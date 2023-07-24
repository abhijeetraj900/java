import java.util.*;


public class JavaBasic{  


    public static int linearSearch(int numbers[], int key)
    {
        for (int i=0; i<numbers.length; i++)
        {
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int number [] = {1,2,3,4,5,6,7,8,9,10};
        int key = 7;  
        int result = linearSearch(number, key);
        if(result==-1){
            System.out.println("Element is not found in the array");
        }
        else{
            System.out.println("Element is found at index: "+result);
        }
    }  
} 
