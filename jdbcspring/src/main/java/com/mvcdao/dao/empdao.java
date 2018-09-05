package com.mvcdao.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mvcdao.model.emp;
import com.mvcdao.utils.appConfig;

@Component
public class empdao {
	
	@Autowired
	public  appConfig cf;

	JdbcTemplate JdbcTemplate=cf.jtObj();
	
	public int save(emp p) {
		String sql="insert into empl values(?,?,?,?)";
		return JdbcTemplate.update(sql,p.getID(),p.getName(),p.getEmail(),p.getAddress());		
	}
	public int update(emp p) {
		String sql="update empl set name=?,email=?,address=? where id=?";
		return JdbcTemplate.update(sql,p.getName(),p.getEmail(),p.getAddress(),p.getID());		
	}
	public int delete(int id) {
		String sql="delete from empl where id="+id+"";
		return JdbcTemplate.update(sql);
	}  
	public emp getbyid(int id) {
		String sql="select * from empl where id=?";
		return JdbcTemplate.queryForObject(sql,new empRowMapper(),id);
	}
	public List<emp> getall(){
		String sql="select * from empl";
		return JdbcTemplate.query(sql,new empRowMapper());
	}
}
