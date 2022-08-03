package com.project.core;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.core.services.PaymentService;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class CoreApplicationTests {
	
	@Autowired
	PaymentService service;

	@Test
	public void testDependencyInjection() {
		assertNotNull(service);
	}

}
