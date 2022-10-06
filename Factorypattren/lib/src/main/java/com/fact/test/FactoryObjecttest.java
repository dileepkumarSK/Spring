package com.fact.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.fact.beans.Car;
import com.fact.beans.HighBudjet;

public class FactoryObjecttest {

	
	public static void main(String[] args) {
		
		Resource res=new FileSystemResource("src/main/java/com/fact/cfgs/applicationContext.xml");
		XmlBeanFactory fac=new XmlBeanFactory(res);
		Car  c=(Car)(Object)fac.getBean("high");
		c.drive();
		
	}

}
