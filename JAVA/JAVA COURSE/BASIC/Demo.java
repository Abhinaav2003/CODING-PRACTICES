public class Demo 
{
    public static void main(String[] args) 
    {
        try
        {
            int a = 10;
            int b = 0;

            int result = a/b;
            System.out.println(result);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Error Division by Zero is Not Allowed");
        }
        finally
        {
            System.out.println("Program Executed Successfully");
        }
    }
}
