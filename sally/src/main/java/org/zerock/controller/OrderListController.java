package org.zerock.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.service.OrderListService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/mypage/*")
public class OrderListController {	
	
	@Autowired
	private OrderListService service;
	
	 @RequestMapping(value = "/orderlist", method = RequestMethod.GET)
	 public void getList(Model model) {
		 
		 log.info("오더리스트 목록 페이지");
		 
		 model.addAttribute("orderlist", service.orderlist());
	 }
}
