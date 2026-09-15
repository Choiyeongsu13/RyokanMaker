package com.mnu.RyokanMaker.domain;

import lombok.Data;

@Data
public class AdminDTO {
	private int adminidx;
	private String adminid;
	private String adminpassword;
	private String adminname;
	private String adminmail;
	private String ryokanloc;
	private String ryokanname;
	private String ryokanlevel;
	 private String pwresetyn;
}
