package com.mvcdao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.mvcdao.dao.empdao;
import com.mvcdao.model.emp;
import com.oracle.webservices.internal.api.databinding.Databinding.Builder;

@Controller
public class empcontroller {
	@Autowired
	empdao empdao;
	
	@RequestMapping(value="/empform",method=RequestMethod.GET)
	public ModelAndView empform() {
		return new ModelAndView("empform","newform",new emp());
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("newform")emp emp) {
		empdao.save(emp);
		return new ModelAndView("redirect:/viewemp");
		}
	
	@RequestMapping(value="/viewemp",method=RequestMethod.GET)
	public ModelAndView viewemp() {
		List<emp> list=empdao.getall();
		return new ModelAndView("viewemp","list",list);
	}
	
	@RequestMapping(value="/editemp",method=RequestMethod.GET)  
    public ModelAndView edit(@RequestParam("id") int id,RedirectAttributes rd){ 
		UriComponentsBuilder builder=ServletUriComponentsBuilder.fromCurrentRequest();
		String url=builder.buildAndExpand().getPath();
		System.out.println(url);
        emp emp=empdao.getbyid(id);
        rd.addFlashAttribute(emp);
        return new ModelAndView("redirect:/reder"); 
    }  
	@RequestMapping(value="/reder",method=RequestMethod.GET)
	public ModelAndView reder(@ModelAttribute("emp") emp emp) {
        return new ModelAndView("empeditform","edit",emp); 
	}	
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public ModelAndView editsave(@ModelAttribute("edit") emp emp){  
    	empdao.update(emp);  
        return new ModelAndView("redirect:/viewemp");  
    }  
    @RequestMapping(value="/deleteemp",method = RequestMethod.GET)  
    public ModelAndView delete(@RequestParam("id") int id){  
    	empdao.delete(id);  
        return new ModelAndView("redirect:/viewemp");  
    }  
}

