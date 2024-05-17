package com.spring;

// import org.springframework.beans.factory.BeanFactory;
// import org.springframework.core.io.ClassPathResource;
// import org.springframework.core.io.Resource;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //Resource resource = new ClassPathResource("spring.xml");
        //BeanFactory factory = new XmlBeanFactory(resource);

        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        
        
        Alien obj1=(Alien) factory.getBean("alien");
        
        obj1.code();
    }
}
