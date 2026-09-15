package com.mnu.RyokanMaker.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mnu.RyokanMaker.Service.Inquiryservice;
import com.mnu.RyokanMaker.domain.InquiryDTO;
import com.mnu.RyokanMaker.domain.MemberDTO;

import jakarta.servlet.http.HttpSession;

@Controller
public class InquiryController {
	
	private static final Logger log =
			LoggerFactory.getLogger(InquiryController.class);
	
	@Autowired
	private Inquiryservice inquiryservice;
	
	private MemberDTO loginMember(HttpSession session) {
		return (MemberDTO) session.getAttribute("loginMember");
	}
	
	//유저가 쓴 문의 목록
	@GetMapping("/inquiry/list")
	public String list(HttpSession session, Model model) {
		MemberDTO member = loginMember(session);
		if(member==null) {
			return "redirect:/member/login";
		}
		model.addAttribute("inquiryList", inquiryservice.listByMember(member.getUserMail()));
		return "inquiry/list";
	
	}
	
	//등록 폼 료칸이 어딘지는 idx로 식별
	@GetMapping("/inquiry/write")
	public String writeForm(HttpSession session, @RequestParam int adminIdx, Model model) {
		if(loginMember(session) == null) {
			return "redirect:/member/login";
		}
		model.addAttribute("adminIdx", adminIdx);
		return "inquiry/write";
	}
	
	//등록처리
	@PostMapping("/inquiry/write")
	public String write(HttpSession session, InquiryDTO inquiryDTO) {
		MemberDTO member=loginMember(session);
		if(member == null) {
			return "redirect:/member/login";
		}
		inquiryDTO.setUserMail(member.getUserMail());
		inquiryservice.write(inquiryDTO);
		return "redirect:/inquiry/list";
	}
	//상세 보기(본인 문의만)
	@GetMapping("/inquiry/view")
	public String view(HttpSession session, @RequestParam int idx, Model model) {
		MemberDTO member = loginMember(session);
		if(member== null) {
			return "redirect:/member/login";
		}
		InquiryDTO inquiry = inquiryservice.select(idx);
		if(inquiry == null || !inquiry.getUserMail().equals(member.getUserMail())) {
			return "redirect:/inquiry/list";
		}
		
		model.addAttribute("inquiry",inquiry);
		return "inquiry/view";
	}
	
	

}
