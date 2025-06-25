// problem 1
import java.util.*;
class Calculator{
  double a,b;

  Calculator(double a,double b) {
    this.a = a;
    this.b = b;
  }

  public double Calculator(String Operation) {
    switch (Operation.toLowerCase()){
      case "add":
      return a+b;
      case "subtract":
      return a-b;
      case "multiply":
      return a*b;
      case "divide":
        if(b == 0){
        throw new ArithmeticException("Cannot divide by zero");
        }
      return a / b;
    default:
    throw new IllegalArgumentException("Invalid operation");
    }
  }
}


public class Program1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    double a =sc.nextDouble();
    System.out.println("Enter the value of b:");
    double b =sc.nextDouble();
    System.out.print("Enter operation (add, subtract, multiply, divide): ");
    String op = sc.next();


    Calculator calc = new Calculator(a,b);
            try {
            System.out.println("Result: " + calc.Calculator(op));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    
  }
}
