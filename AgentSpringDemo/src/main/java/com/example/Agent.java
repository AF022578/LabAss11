package com.example;

public class Agent {
      public int getAgent_id() {
		return Agent_id;
	}
	public void setAgent_id(int agent_id) {
		Agent_id = agent_id;
	}
	public String getAgent_name() {
		return Agent_name;
	}
	public Agent(int agent_id, String agent_name, int agent_salary) {
		super();
		Agent_id = agent_id;
		Agent_name = agent_name;
		Agent_salary = agent_salary;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAgent_name(String agent_name) {
		Agent_name = agent_name;
	}
	public int getAgent_salary() {
		return Agent_salary;
	}
	public void setAgent_salary(int agent_salary) {
		Agent_salary = agent_salary;
	}
	private int Agent_id;
      private String Agent_name;
      private int Agent_salary;
}
