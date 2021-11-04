package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.zerock.mapper.NoticeMapper;
import org.zerock.domain.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	@Inject
	private NoticeMapper mapper;
	
	// 게시물 목록
	@Override
	public List<NoticeVO> list() {
		
		return mapper.list();
	}

	// 게시물 작성
	@Override
	public void write(NoticeVO vo) {

		mapper.write(vo);
	}

	// 게시물 조회
	@Override
	public NoticeVO view(int bno) {

	 return mapper.view(bno);
	}
	
	// 게시물 수정
	@Override
	public void modify(NoticeVO vo) {
	  
	mapper.modify(vo);
	}
	
	// 게시물 삭제
	public void delete(int bno) {
	mapper.delete(bno);
	}
	
	// 게시물 총 갯수
	@Override
	public int count() {
	 return mapper.count();
	}
	
	// 게시물 목록 + 페이징
	@Override
	public List<NoticeVO> listPage(int displayPost, int postNum) {
	 return mapper.listPage(displayPost, postNum);
	}
	
	// 게시물 목록 + 페이징 + 검색
	@Override
	public List<NoticeVO> listPageSearch(
	  int displayPost, int postNum, String searchType, String keyword) {
	 return  mapper.listPageSearch(displayPost, postNum, searchType, keyword);
	}
	
	// 게시물 총 갯수
	@Override
	public int searchCount(String searchType, String keyword) {
	 return mapper.searchCount(searchType, keyword);
	}
}
