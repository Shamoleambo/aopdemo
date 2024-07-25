package com.tidz.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

	public boolean addNewestAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
		return true;
	}

	@Override
	public void goToSleep() {
		System.out.println(getClass() + ": I'm going to sleep now");
	}
}
