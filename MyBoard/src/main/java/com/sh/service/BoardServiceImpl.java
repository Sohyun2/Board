package com.sh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sh.mapper.BoardMapper;
import com.sh.mapper.BoardMapperTests;
import com.sh.vo.BoardVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * 
 * @author sh
 *	BoardService를 구현한 class
 */

@Log4j
@Service //service객체임을 알려줌
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{

	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		log.info("BoardService..getList()");
		
		return mapper.getList();
	}
	
	
}
