import java.util.Scanner;
class Task9{
public static void main(String[] args){
Scanner Object1 = new Scanner (System.in);
Scanner Object2 = new Scanner (System.in);
Scanner Object3 = new Scanner (System.in);
System.out.print("Enter the num1 : ");
int num1 = Object1.nextInt();
System.out.print("Enter the num2 : ");
int num2 = Object1.nextInt();
System.out.print("Enter the operation : ");
String symbol = Object3.next();
int result = 0;
switch (symbol) {
case "+" :
result = num1 + num2 ;
break;
case "-" :
result = num1 - num2 ;
break;
case "*" :
result = num1 * num2 ;
break;
case "/" :
result = num1 / num2 ;
break;
default:
   System.out.println("Invalid entry");
}
System.out.println("The Result is : " + result);
}

}