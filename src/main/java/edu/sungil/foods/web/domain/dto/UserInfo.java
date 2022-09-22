package edu.sungil.foods.web.domain.dto;

import lombok.Data;

public class UserInfo {
	  private Long userNo;
	  private String userNm;
	  private String userBirthDt;
	  
	  public String toString() {
		  return "userNo = " + this.userNo + ", userNm = " + this.userNm +", userBirthDt = " + this.userBirthDt;
	  }

	public Long getUserNo() {
		return userNo;
	}

	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getUserBirthDt() {
		return userBirthDt;
	}

	public void setUserBirthDt(String userBirthDt) {
		this.userBirthDt = userBirthDt;
	}
	  
}