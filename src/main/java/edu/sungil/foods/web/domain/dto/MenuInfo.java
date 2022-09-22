package edu.sungil.foods.web.domain.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

public class MenuInfo {
	private Long menuNo;
	private String menuNm;
	private long menuPrc;
	private String menuDesc;
	private long menuStockQty;
	private String menuDispYn;
	private MultipartFile menuImgNm;
	private String fileNm;
	
	public Long getMenuNo() {
		return menuNo;
	}
	public String getMenuNm() {
		return menuNm;
	}
	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
	}
	public long getMenuPrc() {
		return menuPrc;
	}
	public void setMenuPrc(long menuPrc) {
		this.menuPrc = menuPrc;
	}
	public String getMenuDesc() {
		return menuDesc;
	}
	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}
	public long getMenuStockQty() {
		return menuStockQty;
	}
	public void setMenuStockQty(long menuStockQty) {
		this.menuStockQty = menuStockQty;
	}
	
	public String getMenuDispYn() {
		return menuDispYn;
	}
	public void setMenuDispYn(String menuDispYn) {
		this.menuDispYn = menuDispYn;
	}
	public MultipartFile getMenuImgNm() {
		return menuImgNm;
	}
	public void setMenuImgNm(MultipartFile menuImgNm) {
		this.menuImgNm = menuImgNm;
	}
	public String getFileNm() {
		return fileNm;
	}
	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}
	public void setMenuNo(Long menuNo) {
		this.menuNo = menuNo;
	}
}