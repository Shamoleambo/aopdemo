package com.tidz.aopdemo.dao;

import org.springframework.stereotype.Repository;

import com.tidz.aopdemo.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {

	private String name;
	private String serviceCode;

	@Override
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}

	@Override
	public boolean doWork() {
		System.out.println(getClass() + ": doWork()");
		return false;
	}

	public String getName() {
		System.out.println("getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println("getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println("setServiceCode()");
		this.serviceCode = serviceCode;
	}

}
