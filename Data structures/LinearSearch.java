import java.io.*;
class LinearSearch {
            static int[] num=new int[5];//array to store numbers
            static int target;//number to be searched
            public static void getNum(){ //method to get numbers from user
                
                Console c=System.console(); //console object to take input
                for(int i=0;i<5;i++){
                    System.out.println("Enter number : ");
                    num[i]=Integer.parseInt(c.readLine());//storing numbers in array
                }
                //taking target number to be searched
                target=Integer.parseInt(c.readLine("Enter number to be searched : "));
            
            }
            //method to search the target number in the array
            public static int search() {
                int l=num.length;   //length of the array
                for(int i=0;i<l;i++){
                    //comparing each element with target
                    if(num[i]==target){
                        System.out.println("Number found at index : "+i);//printing index if found
                        return i;
                    }
            }
            System.out.println("Number not found");
            return -1;
            }
            //main method
            public static void main(String[] args){
                
                getNum();//method call to get numbers
                search();//method call to search the target number
            }
}
