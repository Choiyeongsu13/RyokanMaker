package com.mnu.RyokanMaker.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mnu.RyokanMaker.domain.InquiryDTO;

@Mapper
public class InquiryMapper {
	
	//특정 회원이 쓴 문의
	List<InquiryDTO> selectListByUserMail(String userMail);

	//료칸에 들어온 문의
	List<InquiryDTO> selectListByAdminIdx(int adminIdx);
	
	// 조회
	InquiryDTO selectByIdx(int inquiryIdx);
	
	//문의 등록 (답변 대기로 고정)
	int insert(InquiryDTO inquiryDTO);
	
	//답변 등록
	int answer(@Param("inquiryIdx") int inquiryIdx,
				@Param("adminIdx") int adminIdx,
				@Param("inquiryAnswerContent") String inquiryAnswerContent);
	
}
