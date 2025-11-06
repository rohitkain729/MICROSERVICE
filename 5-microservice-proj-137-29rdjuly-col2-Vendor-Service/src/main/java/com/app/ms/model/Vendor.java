package com.app.ms.model;

public class Vendor {

	private Integer vid;
	private String vname;

	public Vendor() {

	}

	public Vendor(Integer vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}

	public Integer getVid() {
		return vid;
	}

	public void setVid(Integer vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + "]";
	}

}
