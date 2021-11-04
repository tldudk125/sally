package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.CategoryVO;
import org.zerock.domain.GdsVO;
import org.zerock.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Inject
	@Autowired
	private GoodsMapper mapper;
	
	// 카테고리
	@Override
	public CategoryVO category(int cateNo){
		
		return mapper.category(cateNo);
	}

	
	// 카테고리2
	@Override
	public List<CategoryVO> category(){
		return mapper.category();
	}
	
	// 상품목록
	@Override
	public List<GdsVO> list(){
		return mapper.list();
	}
	
}
