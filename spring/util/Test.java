package com.sony.spring.util;
import org.springframework.beans.factory.*;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

public class Test {
	public static void main(String[] args) { 
		
		Resource r=new ClassPathResource("applicationContext.xml");  
		BeanFactory b=new XmlBeanFactory(r);  
		QAMailsender m=(QAMailsender)b.getBean("qAMailsender");  
		String sender="98sonykumari@gmail.com";//write here sender gmail id  
		String receiver="anitashankar86@gmail.com";//write here receiver id  
		m.sendMail(sender,receiver,"hi","welcome");  
		      
		System.out.println("success");  
		}  
	    

	}
	

