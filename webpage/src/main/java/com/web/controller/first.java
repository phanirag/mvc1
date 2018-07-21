package com.web.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.input.inputdata;

@Controller
@Configuration
public class first {
	@Bean(initMethod="init",destroyMethod="dest")
	public ID id() {
	return new ID();	
	}
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public ModelAndView viewform() {
		return new ModelAndView("input","newaccount",new inputdata());
	}
	@RequestMapping(value="/check",method=RequestMethod.POST)
	public String inputdata(@Valid @ModelAttribute ("newaccount") inputdata inputdata,BindingResult r ) 
	{
		if(r.hasErrors())
			{
			System.out.println("Enter Valied detailes");
			return "input";
			}
		System.out.println("name"+inputdata.getName()+"email"+inputdata.getEmail()+"age"+inputdata.getAge()+"Address"+inputdata.getAddress());
		return "suc";
	}
}
