package com.copdapp.copdapp.test;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int code;
	private String user;
	private int q1;
	private int q2;
	private int q3;
	private int q4;
	private int q5;
	private int q6;
	private int q7;
	private int q8;
	private int score;
	private LocalDate date;
	
	public Test() {
	}
	
	public Test(int code, String user, int q1, int q2, 
					int q3, int q4, int q5, int q6, int q7, 
					int q8) {
		this.code = ++code;
		this.user = user;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
		this.q6 = q6;
		this.q7 = q7;
		this.q8 = q8;
		this.score = q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8;
		this.date = LocalDate.now();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getQ1() {
		return q1;
	}

	public void setQ1(int q1) {
		this.q1 = q1;
	}

	public int getQ2() {
		return q2;
	}

	public void setQ2(int q2) {
		this.q2 = q2;
	}

	public int getQ3() {
		return q3;
	}

	public void setQ3(int q3) {
		this.q3 = q3;
	}

	public int getQ4() {
		return q4;
	}

	public void setQ4(int q4) {
		this.q4 = q4;
	}

	public int getQ5() {
		return q5;
	}

	public void setQ5(int q5) {
		this.q5 = q5;
	}

	public int getQ6() {
		return q6;
	}

	public void setQ6(int q6) {
		this.q6 = q6;
	}

	public int getQ7() {
		return q7;
	}

	public void setQ7(int q7) {
		this.q7 = q7;
	}

	public int getQ8() {
		return q8;
	}

	public void setQ8(int q8) {
		this.q8 = q8;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
