class Program15{
	public static void main(String [] args){
		int age=29;
		char gender='M';
		if(gender=='M'){
			if(age>=21){
				System.out.println("Eligible Bachelor");
			}
			else{
				System.out.println("Boy Underage");
			}
		}
		else if(gender=='F'){

			if(age>=19){
				System.out.println("Eligible Spinster");
			}
			else
			{
				System.out.println("Girl Underage");
			}
		}
		else
		{
			System.out.println("Invalid Gender");
		}
	}
}