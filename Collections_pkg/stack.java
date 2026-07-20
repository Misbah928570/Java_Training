package Collections_pkg;

import java.util.ArrayList;
import java.util.Stack;

public class stack {
     public void nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
         for(int i=0;i<arr.length;i++)
             res.add(-1);
        for(int i=arr.length - 1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
               }
            if(!s.isEmpty()){
                res.set(i,s.peek());
            }
            s.push(arr[i]);
        }
        for(int i:res){
            System.out.println(i);
        }

    }

    boolean ispalindrome(String word){
        Stack<Character> s = new Stack<>();

        for(char c: word.toCharArray()){
            s.push(c);
        }
        int j =0;
        while(!s.empty()){
            if(!s.peek().equals(word.charAt(j))){
                return false;
            }
            j += 1;
            s.pop();
        }
        return true;

    }
    public static void main(String[] args) {
        stack ob = new stack();
        int[] a = {1,2,3,5};
        ob.nextLargerElement(a);
//        Stack<Integer> s = new Stack<>();
//        s.add(1);
//        s.add(3);
//        s.add(5);
//        s.add(3);
//        s.add(1,7);
//        System.out.println(s);
//        s.pop();
//        System.out.println(s);
//        while(!s.empty()){
//            System.out.println(s.peek());
//            s.pop();


    }
}
