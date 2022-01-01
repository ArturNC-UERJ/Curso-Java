package entities;

public class Account {
	
	private String number;
	private String name;
	private double deposit;

	public Account(String number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Account(String number, String name) {
		this.number = number;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public String getNumber() {
		return number;
	}
	
	public void deposit(double valor) {
		deposit += valor;
	}
	
	public void withdraw(double valor) {
		deposit -= valor + 5;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", deposit);
	}
}
