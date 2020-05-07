package com.neu.hrm01;

import com.neu.hrm01.entity.Event;
import com.neu.hrm01.mapper.EventMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Hrm01ApplicationTests {

	@Autowired
	private EventMapper eventMapper;

	@Test
	void contextLoads() {
	}

	@Test
	public void getEvent() {
		Event event = eventMapper.selectEventById(1);
		System.out.println(event);

	}

}
