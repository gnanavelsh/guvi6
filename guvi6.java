import java.util.*;
class guvi6
{
public static void main(String args[])
{
int sum=1,i,j,temp=0;
Scanner s1=new Scanner(System.in);
String s=s1.nextLine();
int n=s.length();
char[] a1=s.toCharArray();
for(i=0;i<n;i++)
{
int a=Character.getNumericValue(a1[i]);
sum=sum*a;
}
int n1=Integer.valueOf(s);
sum=sum*n1;
System.out.println(sum);


}
}