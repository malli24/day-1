import java.util.*;
public class acceptstringbyformatstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=String.format("Congratulations %s ypu won 5 lakhs",a);
        System.out.println(b);
    }
}