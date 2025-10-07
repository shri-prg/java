class Program14{
 public static void main(String [] args){
 	double accBal = 10000.0;
 	int amt = 130;
	if(accBal>=amt){
		if(amt%100==0){
	 System.out.println("Withdrawal Success");
		}
		else
		{
			System.out.println("Invalid Denomination, You have to enter the value in multiple of 100");
		}
	}
	else{
		System.out.println("Insufficient Balance");
	}
}
}
