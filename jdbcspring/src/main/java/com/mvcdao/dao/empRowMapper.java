package com.mvcdao.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mvcdao.model.emp;

public class empRowMapper implements RowMapper<emp> {

	public emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		emp e=new emp();
		e.setID(rs.getInt("id"));
		e.setName(rs.getString("name"));
		e.setEmail(rs.getString("email"));
		e.setAddress(rs.getString("address"));
		return e;
	}

}
