import java.util.*;
public class Matadd{
public static void main(String args[])
{
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
int i,j;
System.out.println("enter the no:of rows:");
Scanner as=new Scanner(System.in);
int n1=as.nextInt();
System.out.println("enter the no:of cols:");
int n2=as.nextInt();
System.out.println("enter matrix 1:\n");
for(i=0;i<n;i++)
{
for(j=0;j<n2;j++)
{
a[i][j]=as.nextInt();
}
System.out.println("enter matrix 2:\n");
for(i=0;i<n1;i++)
{
for(j=0;j<n2;j++)
{
b[i][j]=as.nextInt();
}
}


}
}
}