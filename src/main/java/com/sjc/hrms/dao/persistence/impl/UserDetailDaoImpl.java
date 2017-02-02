package com.sjc.hrms.dao.persistence.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;

import com.sjc.hrms.core.persistence.BaseJpaDAO;
import com.sjc.hrms.dao.persistence.UserDetailDao;
import com.sjc.hrms.model.persistence.UserDetail;

@Component
public class UserDetailDaoImpl extends BaseJpaDAO<UserDetail> implements UserDetailDao {

	protected UserDetailDaoImpl() {
		super(UserDetail.class);
	}

	@Override
	public UserDetail getUserDetails(UserDetail user) {
		CriteriaBuilder criteriaBuilder = createCriteriaBuilder();
		CriteriaQuery<UserDetail> criteriaQuery = criteriaBuilder.createQuery(UserDetail.class);
		Root<UserDetail> from = criteriaQuery.from(UserDetail.class);
		criteriaQuery = criteriaQuery.select(from);
		Predicate predicateUserName = criteriaBuilder.equal(from.get("userName"), user.getUserName());
		Predicate predicateUserPassword = criteriaBuilder.equal(from.get("password"), user.getPassword());
		Predicate predicateAll = criteriaBuilder.and(predicateUserName, predicateUserPassword);
		criteriaQuery.where(predicateAll);
		List<UserDetail> userDetail = executeCriteriaQuery(criteriaQuery);
		return userDetail.size() > 0 ? userDetail.get(0) : null;
	}

	@Override
	public String getUserToken(UserDetail user) {
		CriteriaBuilder criteriaBuilder = createCriteriaBuilder();
		CriteriaQuery<String> criteriaQuery = criteriaBuilder.createQuery(String.class);
		Root<UserDetail> from = criteriaQuery.from(UserDetail.class);
		criteriaQuery = criteriaQuery.select(from.<String> get("token"));
		Predicate predicateUserName = criteriaBuilder.equal(from.get("userName"), user.getUserName());
		Predicate predicateUserPassword = criteriaBuilder.equal(from.get("password"), user.getPassword());
		Predicate predicateAll = criteriaBuilder.and(predicateUserName, predicateUserPassword);
		criteriaQuery.where(predicateAll);
		List<String> userDetail = em.createQuery(criteriaQuery).getResultList();
		return userDetail.size() > 0 ? userDetail.get(0) : null;
	}

	@Override
	public Object[] getUserTokenAndIsEnable(UserDetail user) {
		CriteriaBuilder criteriaBuilder = createCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
		Root<UserDetail> from = criteriaQuery.from(UserDetail.class);
		criteriaQuery = criteriaQuery.multiselect(from.get("token"), from.get("userName"));
		Predicate predicateUserName = criteriaBuilder.equal(from.get("userName"), user.getUserName());
		Predicate predicateUserPassword = criteriaBuilder.equal(from.get("password"), user.getPassword());
		Predicate predicateAll = criteriaBuilder.and(predicateUserName, predicateUserPassword);
		criteriaQuery.where(predicateAll);
		criteriaQuery.orderBy(criteriaBuilder.asc(from.get("token")));
		criteriaQuery.distinct(true);
		List<Object[]> userDetail = em.createQuery(criteriaQuery).getResultList();
		return userDetail.size() > 0 ? userDetail.get(0) : null;
	}

	@Override
	public Object[] getUserTokenAndIsEnableToUppercase(UserDetail user) {
		CriteriaBuilder criteriaBuilder = createCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
		Root<UserDetail> from = criteriaQuery.from(UserDetail.class);
		criteriaQuery = criteriaQuery.multiselect(from.get("token"),
				criteriaBuilder.selectCase().when(criteriaBuilder.equal(from.get("userName"), "admin"), "AMINROLE")
						.when(criteriaBuilder.equal(from.get("userName"), "robin"), "AMINROLE").otherwise("No Role"));
		
		List<Object[]> userDetail = em.createQuery(criteriaQuery).getResultList();
		return userDetail.size() > 0 ? userDetail.get(0) : null;
	}
}