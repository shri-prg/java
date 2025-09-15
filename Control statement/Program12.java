class Program12{
 public static void main(String [] args){
 	char ch='M';
	if(ch>='A' && ch<='Z'){
	 System.out.println("UpperCase");
	}
	else if (ch>='a' && ch<='z'){
		System.out.println("LowerCase");
	}
	else if (ch>='0' && ch<='9') {
		System.out.println("Number");
	}
	else{
		System.out.println("Special Character");
	}
}
}
