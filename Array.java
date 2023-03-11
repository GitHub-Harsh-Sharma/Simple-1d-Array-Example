import java.util.Scanner;
class Array
{
 int []arr= new int[5];
 public void input()
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements");
    for (int i=0;i<5;i++)
    {
        arr[i]=sc.nextInt();
    }
 }   

public void print()
 {
    System.out.println("Elements are:");
    for (int i=0;i<5;i++)
    {
        System.out.println(arr[i]);
    }
 }
 public static void main(String args[])
 {
     Array arr=new Array();
     arr.input();
     arr.print();
 }
} 