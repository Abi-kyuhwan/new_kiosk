package edu.sungil.foods.web.domain.dto;

public class OrdInfo {
	private int ordNo;
	private String ordDt;
	private int menuNo;
	private String menuNm;
	private int ordQty;
	private int ordAmt;
	private String ordStat;
	private int menuPrc;
	
	public int getMenuPrc() {
		return menuPrc;
	}
	public void setMenuPrc(int menuPrc) {
		this.menuPrc = menuPrc;
	}
	public int getOrdNo() {
		return ordNo;
	}
	public void setOrdNo(int ordNo) {
		this.ordNo = ordNo;
	}
	public String getOrdDt() {
		return ordDt;
	}
	public void setOrdDt(String ordDt) {
		this.ordDt = ordDt;
	}
	public int getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}
	public String getMenuNm() {
		return menuNm;
	}
	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
	}
	public int getOrdQty() {
		return ordQty;
	}
	public void setOrdQty(int ordQty) {
		this.ordQty = ordQty;
	}
	public int getOrdAmt() {
		return ordAmt;
	}
	public void setOrdAmt(int ordAmt) {
		this.ordAmt = ordAmt;
	}
	public String getOrdStat() {
		return ordStat;
	}
	public void setOrdStat(String ordStat) {
		this.ordStat = ordStat;
	}
	
	
}
