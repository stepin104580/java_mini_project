class SavingsAccount extends Account{
		public SavingsAccount(){
		}
		
	String deposit(double depositAmount,long accountNo){
		accountNo=getAccountNo();
		if(depositAmount<49000){
			double totalAmount=getBalance()+depositAmount;
			setBalance(totalAmount);
			return ("Amount deposited Successfully. Your total balance is "+totalAmount);
		}else{
			return("you cannot deposit amount greater than 49,000");
		}
	}

	@Override
	String withdrawal(double withdrawAmount,long accountNo){
		accountNo=getAccountNo();
		//check for insufficient Balance
		double balance=getBalance();
		if(withdrawAmount>balance){
			return("Insufficient Balance. You cannot withdraw amount greater than your balance.");
		}
		if(withdrawAmount<10000){
			double totalAmount=getBalance()-withdrawAmount;
			setBalance(totalAmount);
			return ("Amount withdrawn Successfully. Your remaining balance is "+totalAmount);
		}else{
			return("you cannot withdraw amount greater than 10,000");
		}	
	}

    @Override
	String showBalance(long accountNo){
		return("Your balance is "+(getBalance()));
	}
         
	@Override
	String transferAmount(long accountNoSender,long accountNoReceiver,double transferAmount) {
		//check for insufficient Balance
		double balance=getBalance();
		if(transferAmount>balance){
			return("Insufficient Balance. You cannot withdraw amount greater than your balance.");
		}
		//sender's Account
		accountNoSender=getAccountNo();
		if(transferAmount<10000){
			double remainingBalanceSender=getBalance()-transferAmount;
			setBalance(remainingBalanceSender);
		}else{
			return("you cannot deposit amount greater than 49,000");
		}
		
		//receiver's Account
		accountNoReceiver=getAccountNo();
		if(transferAmount<49000){
			double remainingBalanceReceiver=getBalance()+transferAmount;
			setBalance(remainingBalanceReceiver);
			return ("Amount transferred Successfully.");
		}else{
			return("you cannot transfer amount greater than 10,000");
		}	
        }
}
