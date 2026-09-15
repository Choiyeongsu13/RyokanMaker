package com.mnu.RyokanMaker.domain;

import lombok.Data;

@Data
public class ReservationDTO {
	private int resv_num;
	private int adminidx;
	private String usermail;
	private int resvPrice;
	private int resvpeople;
	private String resvStatus;
	private String resvpayStatus;
	private String resvpaymethod;
	

}
