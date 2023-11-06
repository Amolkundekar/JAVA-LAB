import java.util.*;

public class Math_exception {
    public static void main(String [] args){
        int[] intArray = new int[5];
        Scanner sc = new Scanner(System.in);
        int n;
        try{
          System.out.println("enter array elements (5 elements)");  
          for(int i= 0; i<5 ;i++)
          {
            intArray[i]= sc.nextInt();
          }
          System.out.println("enter array index to access element");
          n = sc.nextInt();
          System.out.println("element at index "+n +"is" + intArray[n]);

          try{
            System.out.println("enter index of array elements for division operation");
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            int ans = intArray[d1]/intArray[d2];
            System.out.println("answer of division operation is "+ ans);
          }
          catch(ArithmeticException e){
            System.out.println("divide by 0 operation is not possible");
            System.err.println(e);
          }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("you are accessing array element with out of bound index");
            System.err.println(e);
        }

        sc.close();
    }
}
