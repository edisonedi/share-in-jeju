package com.ch.pro.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String email;
	private String password;
	private String name;
	private String del;
	private Date regdate;
}
