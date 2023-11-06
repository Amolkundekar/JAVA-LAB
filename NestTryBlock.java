//  import java.lang.*;
class NestTryBlock
{
   public static void main(String args[])
  {
    try
    {
       int a=args.length;
       int b=42/a;
       System.out.println("a="+a);
       try
       {
        if(a==1)
          a=a/(a-a);
        if(a==2)
          {
            int c[]={1};
             c[42]=99;
          }
         try
          {
            if(a>2)
             System.out.println("error");
          }catch(ArrayIndexOutOfBoundsException e)
            {
             System.out.println("The Argument lentgh is more than 2"+e);
            }
          
        }catch(ArrayIndexOutOfBoundsException e)
          {
           System.out.println("array index out of bound"+e);
          }
    }catch(ArithmeticException e)
     {
       System.out.println("divde by Zero :"+e);
     }
  }
}