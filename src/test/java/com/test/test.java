package com.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.woniuxy.domin.Playeracc;
import com.woniuxy.service.IPlayerService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class test {
	
	@Autowired
	IPlayerService iPlayerService;

	@Test
	public void testName() throws Exception {
	Playeracc p=new Playeracc();
	
	p.setPaccount("aaa");
	p.setPid("4aaa");
	p.setPpassword("44sssds5");
	iPlayerService.save(p);
		
		
	}
}
