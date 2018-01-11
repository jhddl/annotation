package com.qf.pojo.test;


import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qf.pojo.po.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class StudentTest {
	
	@Resource(name="student")
	private Student student;
	@Test
	public void test() {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Student student = ctx.getBean("student", Student.class);
		 */
		
		System.out.println(student);
	}

}
