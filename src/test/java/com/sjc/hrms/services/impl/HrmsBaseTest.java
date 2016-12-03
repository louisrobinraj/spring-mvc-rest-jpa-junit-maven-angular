package com.sjc.hrms.services.impl;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:configuration/test-hrms-context.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = true)
@WebAppConfiguration
public abstract class HrmsBaseTest extends Mockito {

}
