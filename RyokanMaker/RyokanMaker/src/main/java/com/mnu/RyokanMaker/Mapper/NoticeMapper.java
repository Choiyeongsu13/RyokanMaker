package com.mnu.RyokanMaker.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mnu.RyokanMaker.domain.NoticeDTO;

@Mapper
public class NoticeMapper {
	// 료칸의 공지 목록 최신순
	List<NoticeDTO>selectListByAdminIdx(int adminIdx);
	
	//조회
	NoticeDTO selectByIdx(int noticeIdx);
	
	//등록
	int insert(NoticeDTO noticeDTO);
	
	//수정
	int update(NoticeDTO noticeDTO);
	
	//삭제
	int delete(@Param("noticeIdx") int noticeIdx, @Param("adminIdx") int adminIdx);
	

}
