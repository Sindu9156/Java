import java.io.*;
class Main{
    public static void main(String[] args)
    {
        System.out.println("Main function");
        System.gc();
    }
    public void finalize()
    {
        System.out.println("finalize method");
    }
}
