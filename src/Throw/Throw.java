package Throw;

class Throw
{
    static void method()
    {
        try {
            throw new NullPointerException("Exception in Hello, World");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    public static void main(String args[])
    {
        try {
            method();
        } catch(NullPointerException e) {
            System.out.println("Catch inside main : " +
                    e.getMessage());
        }
    }
}
