package com.tr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tr.Triangle;

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		triangle.setPointB(new Point(500, 500));
		Triangle tr = (Triangle) context.getBean("triangle");
		triangle.draw();
		tr.draw();
	}

}