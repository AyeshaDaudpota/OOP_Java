import java.util.Scanner;

class Task6 {
public static void main(String[] args)
{
Scanner Object = new Scanner(System.in);

System.out.println("Currency Converter");

System.out.print("Enter the value in Dollars: $");

int number = Object.nextInt();

System.out.println("Value in Rupees: Rs" + (number*290) );
}
}