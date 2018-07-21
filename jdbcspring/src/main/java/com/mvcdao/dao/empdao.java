package com.mvcdao.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mvcdao.model.emp;

public class empdao {
	private JdbcTemplate JdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}

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
