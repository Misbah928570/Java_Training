package Queues;
//print binary strings upto n numbers
import java.util.LinkedList;
import java.util.Queue;

public class print_binary {
    public static void printBinary(int  n){
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i=1;i<=n;i++){
            String curr = q.poll();
            System.out.println(curr);
            q.offer(curr+"0");
            q.offer(curr+"1");
        }
    }

    public static void main(String[] args) {
        printBinary(7);
    }
}
