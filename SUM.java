
package sum;
import java.util.Scanner;

public class SUM {

    
    public static void main(String[] args) {
     int n;
       int sum=0;
    // int []array=new int[10];
        System.out.println("enter the size of array:");
        Scanner sn=new Scanner(System.in);
        n=sn.nextInt();
        int []array=new int[n];
        System.out.println("enter the elements off array:");
        for(int i=0;i<array.length;i++)
        {
            array[i]=sn.nextInt();
            sum=sum+array[i];
        }
        System.out.println("the sum of array element is:"+sum);
        System.out.println("the sorted array element is");
        int temp=0;
        for(int k=0;k<array.length;k++)
        {
         for(int j=k+1;j<array.length;j++) {
             if(array[k]>array[j]){
                 temp=array[k];
                 array[k]=array[j];
                 array[j]=temp;
             }   
        }
    }
   for(int k=0;k<array.length;k++)
       System.out.println(+array[k]);
   System.out.println("already done@eric ndagijimana ");
   for(int z=0;z<array.length;z++){
      System.out.println(z);
   }
} 
   // System.out.println("woooooooooooooo");
}  
    
    

