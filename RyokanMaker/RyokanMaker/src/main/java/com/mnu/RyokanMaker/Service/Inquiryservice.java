package com.mnu.RyokanMaker.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnu.RyokanMaker.Mapper.InquiryMapper;
import com.mnu.RyokanMaker.domain.InquiryDTO;

@Service
public class Inquiryservice {
	
	private static  final Logger log=
			LoggerFactory.getLogger(Inquiryservice.class);
	
	@Autowired
	private InquiryMapper inquiryMapper;
	
	public List<InquiryDTO> listByMember(String userMail){
		return inquiryMapper.selectListByUserMail(userMail);
	}
	
	public List<InquiryDTO> listByAdmin(int adminIdx){
		return inquiryMapper.selectListByAdminIdx(adminIdx);
	}
	public InquiryDTO select(int inquiryIdx) {
		return inquiryMapper.selectByIdx(inquiryIdx);
	}
	
	public int write(InquiryDTO inquiryDTO) {
		log.info("call : inquirywrite");
		return inquiryMapper.insert(inquiryDTO);
	}
	
	public int answer(int inquiryIdx, int adminIdx, String inquiryAnswerContent) {
		log.info("call : inquirtanswer");
		return inquiryMapper.answer(inquiryIdx,adminIdx,inquiryAnswerContent);
	}
	
}
