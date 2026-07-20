package ExceptionHandling;
import java.util.*;
class InsufficientBalException extends Exception{
    InsufficientBalException(String message){
        super(message);
    }
}
public class main {
    static double balance = 20000;
    public static void withdraw(double amount) throws InsufficientBalException{
        if(amount > balance){
            throw new InsufficientBalException("Insufficient balance");
        }
        balance = balance - amount;
        System.out.println("amount withdrawn");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn : ");
        double amount = sc.nextDouble();
        try{
            withdraw(amount);
        }catch(InsufficientBalException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
