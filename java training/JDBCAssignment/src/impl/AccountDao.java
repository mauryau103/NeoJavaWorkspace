package impl;

import java.util.List;

import pojo.Account;

public interface AccountDao {
	boolean addAccount(Account acc);
	boolean deleteAccount(int accId);
	boolean updateAccount(Account acc);
	Account getAccountById(int accId);
	List<Account> getAllAccounts();

}
