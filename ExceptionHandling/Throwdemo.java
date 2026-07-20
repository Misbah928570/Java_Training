package ExceptionHandling;
import java.util.*;
 class InvalidAgeException extends Exception{
     InvalidAgeException(String message){
         super(message);
     }
 }
public class Throwdemo {
     public static void check(int age) throws InvalidAgeException{
         if(age<18){
             throw new InvalidAgeException("Age must be above 18");
         }
         System.out.println("you're eligible");
     }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your age : ");
         int age = sc.nextInt();
         try{
             check(age);
         } catch (InvalidAgeException e) {
             System.out.println(e.getMessage());
         }
         finally{
             sc.close();
         }
     }
}