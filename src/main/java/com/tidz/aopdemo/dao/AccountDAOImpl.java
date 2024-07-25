package com.tidz.aopdemo.dao;

import org.springframework.stereotype.Repository;

import com.tidz.aopdemo.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@Override
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}

	@Override
	public boolean doWork() {
		System.out.println(getClass() + ": doWork()");
		return false;
	}

}
