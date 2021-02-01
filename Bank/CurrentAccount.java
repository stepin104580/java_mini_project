class CurrentAccount extends Account{
	public CurrentAccount(){	
	}
	
	@Override
	String deposit(double depositAmount,long accountNo) {
		accountNo=getAccountNo();
		double totalAmount=getBalance()+depositAmount;
		setBalance(totalAmount);
		return ("Amount deposited Successfully. Your total balance is "+totalAmount);
	}

	@Override
	String withdrawal(double withdrawAmount,long accountNo) {
		accountNo=getAccountNo();
		// TODO Auto-generated method stub
		
		//check for insufficient Balance
		double balance=getBalance();
		if(withdrawAmount>balance){
			return("Insufficient Balance. You cannot withdraw amount greater than your balance.");
		}
		double totalAmount=getBalance()-withdrawAmount;
		setBalance(totalAmount);
		return ("Amount withdrawan Successfully. Your remaining balance is "+totalAmount);
	}
	
    @Override
	String showBalance(long accountNo){
		return("Your balance is "+(getBalance()));
	}
         
	@Override
	String transferAmount(long accountNoSender,long accountNoReceiver,double transferAmount) {
		// TODO Auto-generated method stub
		//check for insufficient Balance
		double balance=getBalance();
		if(transferAmount>balance){
			return("Insufficient Balance. You cannot withdraw amount greater than your balance.");
		}
		//sender's Account
		accountNoSender=getAccountNo();
		double remainingBalanceSender=getBalance()-transferAmount;
		setBalance(remainingBalanceSender);
		
		//receiver's Account
		accountNoReceiver=getAccountNo();
		double remainingBalanceReceiver=getBalance()+transferAmount;
		setBalance(remainingBalanceReceiver);
		
		return ("Amount transferred Successfully.");	
    }
}
