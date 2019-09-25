import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date; 
import java.util.Random; 
public class encryption
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int i,sum=0,l,j;
char psw[]=new char[100];
char e[]=new char[100];
Date todaysDate = new Date();
SimpleDateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
String str2 = df2.format(todaysDate);
System.out.println("String in dd-MM-yyyy HH:mm:ss format is: " +str2);
char[] buffer = str2.toCharArray(); 
for(i=0;i<buffer.length;i++)
 {
  sum+=(int)buffer[i];
 }
 char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9','@','#','*'};
 int f=1234;
 int pass;
System.out.println("Enter the password \n");
 pass=s.nextInt();
Random rand = new Random(); 
 if(f==pass)
{
System.out.print("Your key is :");
for(i=0;i<10;i++)
{
psw[i]=a[rand.nextInt(sum)%65];
System.out.print(psw[i]);
}
System.out.println("Enter your message \n");
String stri=new String();
stri=s.nextLine();
int ab=stri.length();
char[] m=stri.toCharArray();
int h=ab;
int pos=0,q=-1;
for(i=0;i<h;i++)
{
for(j=1;j<=i+1;j++)
{
++q;
if(q>9)
q=q%10;
e[pos++]=psw[q];
}
e[pos++]=m[i];
}
System.out.println("\nYour encrypted code is: ");
System.out.println(e);
System.out.println("\n");
System.out.println("Enter the password \n");
pass=s.nextInt();
if(pass==1234)
{
int temp=1;
pos=0;
System.out.println("Your message is :");
for(i=0;i<e.length;i++)
{
while(temp<=h)
{
for(j=1;j<=temp;j++)
{
pos++;
i++;
}
System.out.println(e[pos++]);
temp++;
}
}
}
else
{
System.out.println("Incorrect password \n");
}
}
}
}
