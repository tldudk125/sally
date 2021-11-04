package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.zerock.mapper.OrderListMapper;
import org.zerock.domain.OrderListVO;

@Service
public class OrderListServiceImpl implements OrderListService {

	@Autowired
	private OrderListMapper mapper;
	
	@Override
	public List<OrderListVO> orderlist(){
		
		return mapper.orderlist();
	}

}
