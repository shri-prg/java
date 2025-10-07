class Program18{
	public static void main(String [] args){
		int value = 3;
		switch(value)
		{
			case 1 : System.out.println("Withdrawal");
			break;
			case 2 : System.out.println("Balance Enquriy");
			break;
			case 3 : System.out.println("PIN change"); 
			break;
			case 4: System.out.println("Mini statement");
			break;
			default:
				System.out.println("INVALID Selection");
		}
	}
}