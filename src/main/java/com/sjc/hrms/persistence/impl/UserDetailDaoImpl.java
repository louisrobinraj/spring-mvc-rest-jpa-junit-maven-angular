package com.sjc.hrms.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;

import com.sjc.hrms.core.persistence.BaseJpaDAO;
import com.sjc.hrms.model.UserDetail;
import com.sjc.hrms.persistence.UserDetailDao;

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
		List<UserDetail> userDetail = null;
		criteriaQuery = criteriaQuery.select(from);
		Predicate predicate = criteriaBuilder.equal(from.get("userName"), user.getUserName());
		criteriaQuery.where(predicate);
		userDetail = executeCriteriaQuery(criteriaQuery);
		return (userDetail == null) ? null : userDetail.get(0);
	}

}