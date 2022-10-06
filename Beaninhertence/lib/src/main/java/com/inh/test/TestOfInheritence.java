package com.inh.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.inh.beans.BeaniheritenceChecking;

public class TestOfInheritence {

	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("com/inh/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//BeaniheritenceChecking bi=(	BeaniheritenceChecking )(Object)factory.getBean("child");
		
		
		//defalut bean id means class full name with .class
		BeaniheritenceChecking bi=(	BeaniheritenceChecking )(Object)factory.getBean(BeaniheritenceChecking.class);
		
		System.out.println(bi);
	}
}
