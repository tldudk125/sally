package org.zerock.service;

import java.util.List;

import org.zerock.domain.CategoryVO;
import org.zerock.domain.GdsVO;

public interface GoodsService {
	//카테고리
	public CategoryVO category(int cateNo);
	
	//카테고리2
	public List<CategoryVO> category();
	
	//상품목록
	public List<GdsVO> list();

}
