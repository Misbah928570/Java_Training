package recursion;

public class sumOfDigit {
    public static int sum = 0;
    public static int d = 0,cnt = 0;
  public static void print(int n){
      if (n == 0){
          return ;
      }
      d = n%10;
      sum = sum + d;
      cnt = cnt +1;
      print(n/10);

  }
    public static void main(String[] args){
      print(7012);
      System.out.println("sum of digits:"+sum);
      System.out.println("count of digits:"+cnt);
    }
}