package org.zerock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.CategoryVO;
import org.zerock.service.GoodsService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/goods/*")
public class GoodsController {
	
	 @Autowired
	 private GoodsService Service;
	 
	//카테고리
	 @RequestMapping(value = "/category", method = RequestMethod.GET)
	 public void getList(@RequestParam("no") int cateNo, Model model) throws Exception {
	  
		 CategoryVO vo = Service.category(cateNo);
		 model.addAttribute("category", vo);
	 }
	 
	 
	 
	 
	 //상품 목록
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
	 public void getList(Model model) {
		 log.info("상품 목록 페이지");
		 model.addAttribute("list", Service.list());
	 }
	 
}