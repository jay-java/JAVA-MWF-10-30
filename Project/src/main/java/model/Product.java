package model;

import java.math.BigDecimal;

public class Product {

	private int pid;
	private int sid;
	private String pname;
	private String pimage;
	private String pcategory;
	private String pdesc;
	private BigDecimal pprice;

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public BigDecimal getPprice() {
		return pprice;
	}

	public void setPprice(BigDecimal pprice) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", sid=" + sid + ", pname=" + pname + ", pimage=" + pimage + ", pcategory="
				+ pcategory + ", pdesc=" + pdesc + ", pprice=" + pprice + "]";
	}

}
