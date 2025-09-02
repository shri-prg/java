import java.io.*;

class BinarySearch {
    public static void main(String[] args){
        int arr[]= new int[5];//array to store numbers
        Console c=System.console(); //console object to take input
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(c.readLine("Enter the number of array"));//storing numbers in array
        }
        int target =Integer.parseInt(c.readLine("Enter number to be searched : "));//number to be searched
        int l=arr.length;   //length of the array
        sortArray(arr,l);//method call to sort the array
        search(arr, l, target);//method call to search the target number
    }
    //method to sort the array
    public static int sortArray(int arr[],int l){
        for(int i=0;i<l;i++){
            for(int j=1;j<l;j++){
                //comparing adjacent elements
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array is : ");//printing sorted array
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" "+"\n");//printing each element of array with space
        }
        return 1;
    } 
    //method to search the target number in the array
    public static int search(int arr[], int l, int target) {
        int low = 0, high = l - 1, mid;//initializing low, high and mid variables
        while (low <= high) {
            mid = (low + high) / 2;//mid index
            //comparing mid element with target
            if (arr[mid] == target) {
                System.out.println("Number found at index: " + mid);
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Number not found");
        return -1;
    }
    
}
