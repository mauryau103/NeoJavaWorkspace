package pojo;

public class Account {
	private int accountNo;
	private int custId;
	private String accType;
	private double balance;
	
	public Account() {
		super();
	}

	public Account(int accountNo, int custId, String accType, double balance) {
		super();
		this.accountNo = accountNo;
		this.custId = custId;
		this.accType = accType;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", custId=" + custId + ", accType=" + accType + ", balance="
				+ balance + "]";
	}
	
	

}
