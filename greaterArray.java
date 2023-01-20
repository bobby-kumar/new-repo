import java.util.Arrays;

public class greaterArray {
    public static int getLargest(int[] a,int total){
        
     Arrays.sort(a);
    
    return (total-1);
    }           
            
    
    
    public static void main(String  args[]){
        int a[]={1,5,8,9};
        int b[]={55,33,44,88,99};
    
        System.out.println("Largest : "+getLargest(a,4));
        System.out.println("Largest : "+getLargest(b,5));
        
    }
}