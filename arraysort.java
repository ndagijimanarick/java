
package array;
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
            int n;
       int  sum=0;
Scanner b=new Scanner(System.in);

System.out.println("enter number of elements to be stored");
int []array=new int[10];
System.out.println("enter 10 numbers");
for(int i=0;i<10;i++){
    
     array[i]=b.nextInt();
     sum=sum+array[i];
    
}
 float average=sum/10;      
  System.out.println("the sum of array element is:"+sum);      
        
        System.out.println("the sum of array element is:"+average);  
       for(int i=0;i<10;i++){
           for(int j=i+1;i<10;i++){
               if(array[i]> array[j])
			{
				int temp  = array[i];
				array[i]=array[j];
				array[j]=temp;
           }
       } 
        
        
    }
        for(int i=0;i<10;i++)
  System.out.println("the sorted array element is:"+array[i]);   
}}
