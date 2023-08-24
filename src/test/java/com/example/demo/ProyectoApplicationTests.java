package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;


@DataJpaTest

class ProyectoApplicationTests {
	@Autowired
	private TestEntityManager em;

	
	@Test
	void contextLoads() {
		Assertions.assertNotNull(em);
	}

}
