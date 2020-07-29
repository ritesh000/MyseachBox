package com.serch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Mysearch {
	
	@RequestMapping("/Myhome")
	public String firstPage()
	{
		System.out.println("firstopen app");
		return "mysearch";
	}
	
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox")String query)
	{
		String url="https://www.google.com/search?q="+query;
		RedirectView redirectView=new RedirectView();
		if(query==null)
		{
			redirectView.setUrl("/myhome");
		}
		redirectView.setUrl(url);
		return redirectView;
		
	}
	
	

}
