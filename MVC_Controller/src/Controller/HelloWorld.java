package Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloWorld implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
     Map m=new HashMap();
     String name=req.getParameter("name");
     m.put("msg","Hello and the name is ="+name);
     ModelAndView mv=new ModelAndView("Suc",m);
		return mv; 	
	}

}
