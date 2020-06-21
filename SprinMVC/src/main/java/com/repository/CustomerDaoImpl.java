
  package com.repository;
  
  import java.util.List;
  
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import
  org.springframework.jdbc.core.JdbcTemplate; import
  org.springframework.stereotype.Repository;
  
  @Configuration
  @Repository 
  public class CustomerDaoImpl implements CustomerDao{
  
	  @Autowired 
	  private JdbcTemplate jdbcTemplate;
	  
	  public CustomerDaoImpl(JdbcTemplate jdbcTemplate)
	  {
		  this.jdbcTemplate=jdbcTemplate;
	  }
  
  
  public List getJdbcTemplateData() { 
	  List result=jdbcTemplate.queryForList("select *from customer");
	  System.out.println("Got Result" +result);
  return result; 
  
  }
  
  
  
  
  }
 