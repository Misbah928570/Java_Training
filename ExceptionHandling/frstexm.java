package ExceptionHandling;

public class frstexm {
    public static void main(String[] args){
        int a=0;
        int b =3;
        try{
            System.out.println(b/a);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            int arr[] = {12,3,4};
            System.out.println(arr[6]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Printed after excpetion handling");
    }
}
