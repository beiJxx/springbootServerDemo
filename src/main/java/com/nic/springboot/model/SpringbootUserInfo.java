package com.nic.springboot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by james on 2018/4/26 0026.
 */
public class SpringbootUserInfo {

	@Id
	private BigDecimal id;

	@Column(name = "user_name")
	private String userName;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
