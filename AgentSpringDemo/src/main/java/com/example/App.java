package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ak=new ClassPathXmlApplicationContext("config.xml");
	    JdbcTemplate template=ak.getBean("jdbcTemplate",JdbcTemplate.class);
    	AgentDao Dao=(AgentDao)ak.getBean("e2");
    	//System.out.println(Dao.saveAgent(new Agent(101,"Dipali",30000)));
    	/*System.out.println(Dao.saveAgent(new Agent(102,"Shubham",27000)));
    	System.out.println(Dao.saveAgent(new Agent(103,"Prerana",21000)));
    	System.out.println(Dao.saveAgent(new Agent(104,"Rakhee",44000)));
    	System.out.println(Dao.saveAgent(new Agent(105,"Ajay",54000)));*/
    	System.out.println(Dao.updateAgent(new Agent(101,"Dipali",77000)));
    	System.out.println(Dao.deleteAgent(new Agent(1101,"Dipali",300)));

    }
}
