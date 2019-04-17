package org.andestech.learning.rfb19.g4.homework2;

public abstract class Account {

	String customer;
	double balance;
	int accountId;

	public abstract void withdrawal();
	public abstract void putMoney();
}
