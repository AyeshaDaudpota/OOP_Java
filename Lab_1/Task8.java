import java.util.Scanner;

class Task8{

public static void main(String[] args){

Scanner Object = new Scanner(System.in);

System.out.println("Speed Conversion");
System.out.print("Speed in Miles/hour :  ");
double mile = Object.nextDouble();
System.out.println("Speed in Kilometer/hour : " +  (mile*1.6));

}
}