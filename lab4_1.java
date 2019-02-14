
class Account {
 int  accNum;
	Person accholder;
double balance ;


public Account(int accNum, Person accholder, double balance) {
	super();
	this.accNum = accNum;
	this.accholder = accholder;
	this.balance = balance;
}







public Person getAccholder() {
	return accholder;
}
public void setAccholder(Person accholder) {
	this.accholder = accholder;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

void deposit(double balance) {
	//this.balance=balance;
	this.balance+=balance;
	System.out.println("ur current balance after deposit is:"+this.balance);
}
void withdraw(double balance) {
	//this.balance=balance;
	this.balance-=balance;
	System.out.println("ur current balance after withdraw is:"+balance);
}

public String toString() {
	return "Account [accNum=" + accNum + ", accholder=" + accholder + ", balance=" + balance + "]";
}
}
  


