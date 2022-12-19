package com.sony.spring.util;
import org.springframework.beans.factory.*;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

public class Test {
	public static void main(String[] args) { 
		
		Resource r=new ClassPathResource("applicationContext.xml");  
		BeanFactory b=new XmlBeanFactory(r);  
		QAMailsender m=(QAMailsender)b.getBean("qAMailsender");  
		String sender="************";//write here sender gmail id  
		String receiver="*************";//write here receiver id  
		m.sendMail(sender,receiver,"hi","welcome");  
		      
		System.out.println("success");  
		}  
	    

	}
	

