package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.CategoryVO;
import org.zerock.domain.GdsVO;

public interface GoodsMapper {
	// 카테고리
	public CategoryVO category(int cateNo);
	
	// 카테고리2
	public List<CategoryVO> category();
	
	// 상품리스트
	public List<GdsVO> list();
	
}
