package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class AgentDao {
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public int saveAgent(Agent e )
	{
		String query="insert into AgentDetails values('"+e.getAgent_id()+"','"+e.getAgent_name()+"','"+e.getAgent_salary()+"')";
		return jdbcTemplate.update(query);
		
	}
	public int updateAgent(Agent e)
	{
		String query1="update AgentDetails set Agent_salary='"+e.getAgent_salary()+"'where Agent_id ='"+e.getAgent_id()+"'";
		return jdbcTemplate.update(query1);
		
	}
	public int deleteAgent(Agent e )
	{
		String query="delete from AgentDetails where Agent_id='"+e.getAgent_id()+"'";
		return jdbcTemplate.update(query);
		
	}}

