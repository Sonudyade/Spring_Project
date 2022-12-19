package com.sony.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sony.spring.dto.Details;

public class Container {
	public static void main(String[] args) {
		//Beanfactory
		
		Resource resource= new ClassPathResource("applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
	
		Details details=(Details)factory.getBean("details");
		System.out.println(details.getName());
		System.out.println(details.getEmail());
		
		Details details1=(Details)factory.getBean("information");
		System.out.println(details.getName());
		System.out.println(details.getEmail());
		
		
		
		
	}

}
