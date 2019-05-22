import java.io.*;

class DirectoriesDemo
{
    public static void main(String arg[])
    {
        String dirname = "D:\\Srujan\\Learn\\Java_Practice"; 
        File f1 = new File(dirname); // LINE A
  String s[] = f1.list(); // LINE D
        
            for(int i = 0; i < s.length; i++)
            {
System.out.println(s[i]);

            }

}
}