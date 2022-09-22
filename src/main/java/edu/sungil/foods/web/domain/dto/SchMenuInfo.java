package edu.sungil.foods.web.domain.dto;

import lombok.Data;

public class SchMenuInfo {
	private Long menuNo;
	private String menuNm;
	public Long getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(Long menuNo) {
		this.menuNo = menuNo;
	}
	public String getMenuNm() {
		return menuNm;
	}
	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
	}
}