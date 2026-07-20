package recursion;

public class kill {
    public static int killer(int n,int k){
        if(n==1){
            return 0;
        }
        return (killer(n-1,k)+k)%n;
    }
    public static void main(String[] args){
        System.out.println(killer(7,3)+1);
    }

}
