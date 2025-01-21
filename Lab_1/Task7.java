import java.util.Scanner;


class Task7{

public static void main(String[] args){
Scanner Object1 = new Scanner (System.in);
Scanner Object2 = new Scanner (System.in);
System.out.println("Calculates the Volume of a Cylinder ");
System.out.print("Enter the Radius: ");
double r = Object1.nextDouble();
System.out.print("Enter the Height: ");
double h = Object2.nextDouble();
System.out.println("Volume is Equal to: " + (3.14*(r*r)*h));

}

}
