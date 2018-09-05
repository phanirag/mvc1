package com.mvcdao.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("jdbc.properties")
public class appConfig {

	@Autowired
	private Environment ev;
	
	@Bean
	public DriverManagerDataSource dsObj() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(ev.getProperty("driver"));
		ds.setUrl(ev.getProperty("url"));
		ds.setUsername(ev.getProperty("name"));
		ds.setPassword(ev.getProperty("pass"));
		return ds;
	}
	
	@Bean
	public JdbcTemplate jtObj() {
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(dsObj());
		return jt;
	}
}
