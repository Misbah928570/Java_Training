-> Java code for adding all elements in an integer
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int s = 0;
        int r;
        while(n != 0 ){
            r = n%10;
            s = s+r;
            n = n/10;
        }
        System.out.println(s);
    }
}


-> sum of squares of even digits from an integer

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = 2736;
        int s = 0;
        int r;
        int sq;
        while(n != 0 ){
            r = n%10;
            if( r%2 == 0){
                // sq = Math.pow(r,2);
                s = s + (r*r);
                
            }
            n = n/10;
        }
        System.out.println(s);
    }
}


-> sum of all the powers of digits w.r.t to their position

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = 23;
        double s = 0;
        int r;
        double sq;
        int i = 0;
        while(n != 0 ){
            i++;
            r = n%10;
            s = s + Math.pow(r,i);
            n = n/10;
        }
        System.out.println(s);
    }
}

-> Array decleration
int[] arr = {2,5,2,5};
        // in java when we declare array it already initialize it to 0's
        int[] arr1 = new int[5];


-> Sum of an array elements
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int s = ob.nextInt();
        int[] arr1 = new int[s];
        int sum = 0;
        for(int i=0; i<s ; i++){
            arr1[i] = ob.nextInt();
        }
        for(int i=0; i<s ; i++){
            sum = sum + arr1[i];
        }
        System.out.println("Sum : "+sum);
        ob.close();
        
    }
}


-> count of even and odd nums  an array
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int s = ob.nextInt();
        int[] arr1 = new int[s];
        int count = 0;
        for(int i=0; i<s ; i++){
            arr1[i] = ob.nextInt();
        }
        for(int i=0; i<s ; i++){
            if(arr1[i] % 2 == 0){
                count = count+1;
            }
        }
        System.out.println("count of even nums : "+count);
        System.out.println("count of odd nums : "+(s - count));
        ob.close();
        
    }
}



-> print consecutive numbers sum in an array
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int s = ob.nextInt();
        int[] arr1 = new int[s];
       
        for(int i=0;i<s;i++){
            arr1[i] = ob.nextInt();
        }
        for(int i = 0; i <(s-1); i++){
            System.out.print((arr1[i] + arr1[i+1])+" ");
        }
        
            
        ob.close();
        
    }
}


-> largest element in an array
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int s = ob.nextInt();
        int[] arr1 = new int[s];
        int largest = 0;
        for(int i=0;i<s;i++){
            arr1[i] = ob.nextInt();
        }
        for(int i = 0; i <s; i++){
            if (arr1[i] > largest)
                    largest = arr1[i];
            
        }
        System.out.print("Largest elem = "+largest);
        
            
        ob.close();
        
    }
}


-> add the array elements with its reversed array nums
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int s = ob.nextInt();
        int[] arr1 = new int[s];
       
        for(int i=0;i<s;i++){
            arr1[i] = ob.nextInt();
        }
        for(int i = 0; i <s; i++){
            System.out.print(arr1[s - (i+1)] + arr1[i] + " ");
            
        }
        
            
        ob.close();
        
    }
}

-> palindrome or not (two pointer approach)
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr1 = new int[n];
       
        for(int i=0;i<n;i++){
            arr1[i] = ob.nextInt();
        }
        int i = 0 ;
        int j = n-1;

        while(i<j){
            if(arr1[i] != arr1[j]){
                System.out.println("Not Palindrome");
                break;
            }
            i++;j--;
        }
        if(i>j)
            System.out.println("Palindrome");
        ob.close();
        
    }
}


-> Revering the array
import java.util.Arrays;
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = ob.nextInt();
        }
        int i=0;
        for(int j=n-1;j>=0;j--){
            arr2[i++] = arr1[j];
        }
        System.out.print(Arrays.toString(arr2));
        ob.close();
        
    }
}


-> Rotation of an array for k times(clockwise)
import java.util.Arrays;
import java.util.Scanner;
class Exm {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = ob.nextInt();
        }
        int k = ob.nextInt();
        for(int d=0;d<k;d++){
            int temp1 = arr1[n-1];
            for(int c=n-1;c>0;c--){
                arr1[c] = arr1[c-1];
            }
            arr1[0] = temp1;
        }
        
        System.out.print(Arrays.toString(arr1));
        ob.close();
        
    }
}

-> two sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}

-> plus one
class Solution {
    public int[] plusOne(int[] digits) {
        n = digits.length;

        for(int i=n-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[n+1];
        digits[0] = 1;
        return digits;
    }
}

->Rotation of an array for k times(clockwise)[ in O(n) ]
import java.util.Arrays;
import java.util.Scanner;
class Exm {
    public static int[] reverse(int[] arr,int s,int e) {
        int n = arr.length;

        for(int i=s,j=e-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }


    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = ob.nextInt();
        }
        int k = ob.nextInt();
	k = k%n;
        arr1 = reverse(arr1,0,n);
        arr1 = reverse(arr1, 0, k);
        arr1 = reverse(arr1, k, n);
        System.out.print(Arrays.toString(arr1));
        ob.close();
        
    }
}


-> Rotation of an array for k times(counter clockwise)[ in O(n) ]
//only the order of func calls will change
	arr1 = reverse(arr1,0,n);
        arr1 = reverse(arr1, 0, k);
        arr1 = reverse(arr1, k, n);

-> 

[7,8,,7,6,7,9,8,7,8,9,4,4]
            i
[7,8,6,98uj]
       j


->
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr1 = new int[n];
       
        for(int i=0;i<n;i++){
            arr1[i] = ob.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j =0;j<n;j++){
                if(arr1[i] == arr1[j])
                    c = c + 1;
            }
            if(c == 1){
                System.out.println(arr1[i]);
                break;
            }
        }
        
        
        ob.close();
        
    }
}

->using bit manipulation
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr1 = new int[n];
       
        for(int i=0;i<n;i++){
            arr1[i] = ob.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
            s= s^arr1[i];
            System.out.println(s);
    
        
        ob.close();
        
    }
}

##STRINGS

  s1 == s2		compares the objects
 s1.equals(s2)  	compares content of two strings
 s1.equalsIgnoreCase(s2)
 s1.charAt(i)		to get character at ith posn
 s1.length()		because s1 is a object so we have to add paranthesis
 s1 = s1.toUpperCase()
 s1.substring(i,j)
 s1.replaceAll()
 s1.replace('r','c')     all r gets replaced with c
 s1.indexOf('r')	 gives last
 chr[] charr = s1.toCharArray()   to convert string into a character array
 Arrays.toString(charr)
 String rev = new String(arr);    to convert array into a string
 

//Printing mber of upper, lower and digits in a sentence
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        int u = 0, l =0, d=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i); 
            if (c >= 65 && c <= 90) {
                u++;
            } 
            else if (c >= 97 && c <= 122) {
                l++;
            }
            else if(c >= 48 && c<=57){
                d++;
            }
        }
        System.out.println(" u -  " + u); 
        System.out.println(" l - " + l);
        System.out.println(" d - " + d);
        
        
        ob.close();
        
    }
}

//Password checker
import java.util.Scanner;
class Prg {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String password = ob.nextLine();
        if (password.length() <8){
            System.out.println("Password should contain atleast 8 chars");
        }
        else{
            int upper = 0, lower =0, d =0 ,s=0;
            for(int i=0;i<password.length();i++){
                char c = password.charAt(i);
                if (c >= 65 && c <= 90) {
                    upper++;
            } 
                else if (c >= 97 && c <= 122) {
                    lower++;
            }
                else if(c >= 48 && c<=57){
                     d++;
            }
                // 
                else if(!Character.isLetter(c) && !Character.isDigit(c)){
                    s++;
                 }
            }
            if (upper > 0 && lower > 0 && d > 0 && s > 0) {
                System.out.println("Password is valid");
            } else {
                System.out.println("Password should contain atleast one uppercase, lowercase, digit and special char");
        }
        }
        
        ob.close();
        
    }
}


// Pas checker which return minimum num of characters to add to make it valid
import java.util.Scanner;
public class Mon {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String password = ob.nextLine();
        int min_len = 0;
        if (password.length() <8){
            min_len = 8 - password.length();
        }
        else{
            int upper=0,lower=0,d=0,s=0;
            for(int i=0;i<password.length();i++){
                char c = password.charAt(i);
                if (c >= 65 && c <= 90){
                    upper++;
                    min_len = Math.min(min_len,min_len+1);
                }
                else if (c >= 97 && c <= 122) {
                    lower++;
            }
                else if(c >= 48 && c<=57){
                     d++;
            }
             else if(!Character.isLetter(c) && !Character.isDigit(c)){
                    s++;
                 }
            }
        }
    }
}



//reversing a string  -- O(n) & larger space comp for temp strings
import java.util.Scanner;
class Exm {
    

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
        ob.close();
        
    }
}




//reversing a string  -- O(n/2) ,space - O(n) better than the prev one
import java.util.Scanner;
class Exm {
    

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        char[] arr = s.toCharArray();
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        String rev = new String(arr);
        System.out.println(rev);
        ob.close();
        
    }
}


//reversing a string using string builder -- better than the prev one



//palindrome string or not -- T-O(n/2) S-O(1)
import java.util.Scanner;
class Exm {
    

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        // char[] arr = s.toCharArray();
        
        int i = 0 ;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("Not Palindrome");
                break;
            }
            i++;j--;
        }
        if(i>j)
            System.out.println("Palindrome");
      
        ob.close();
        
    }
}

//position of character in string in alphabetical order
import java.util.Scanner;
class Exm {
    

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        // char[] arr = s.toCharArray();
        

        for(int i = 0; i < s.length() ;i++){
            int ascii_value = (int)s.charAt(i);
            System.out.print(ascii_value - 96+"   ");
        }
        
      
        ob.close();
        
    }
}

//encoding and decoding
import java.util.Scanner;
class Exm {
    

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        int k = ob.nextInt();
        

        for(int i = 0; i < s.length() ;i++){
            k = k % 26;
            int ascii_value = (int)(s.charAt(i) - k);
            
            char x = (char)(ascii_value);
            if (ascii_value < 97 ) {
                x = (char)(ascii_value + 26);
            }
            System.out.print(x+"");
        }
      
        ob.close();
        
    }
}




//reversing a string using string builder -- better than the prev one





###### // Valid paranthesis checker using ArrayList
import java.util.*;
class Exm {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String n = ob.nextLine();
        ArrayList<Character> stack = new ArrayList<>();
        int top = -1;
        for(Character ch : n.toCharArray()){
            if(ch == '{' | ch == '[' | ch == '('){
                stack.add(ch);
                top++;
            }
            else if(ch == ')'){
                if(top == -1 || stack.get(top) != '('){
                    System.out.println("Invalid");
                    return;
                }
                stack.remove(top);
                top--;
            }
            else if(ch == '}'){
                if(top == -1 || stack.get(top) != '{'){
                    System.out.println("Invalid");
                    return;
                }
                stack.remove(top);
                top--;
            }
            else if(ch == ']'){
                if(top == -1 || stack.get(top) != '['){
                    System.out.println("Invalid");
                    return;
                }
                stack.remove(top);
                top--;
            }

        }
        if(top == -1)
            System.out.println("Valid");
        else    
            System.out.println("Not Valid");
        ob.close();
    }
}


###### // Valid paranthesis checker using stack
import java.util.*;
class Exm {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String n = ob.nextLine();
        Stack<Character> stack = new Stack<>();
        
        for(Character ch : n.toCharArray()){
            if(ch == '{' | ch == '[' | ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();
                
            }
            else if(ch == '}'){
                if(stack.isEmpty() || stack.peek() != '{'){
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();
            }
            else if(ch == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();
            }

        }
        if(stack.isEmpty())
            System.out.println("Valid");
        else    
            System.out.println("Not Valid");
        ob.close();
    }
}


##### // postfix expression
import java.util.*;
class Exm {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String n = ob.nextLine();
        Stack<Integer> stack = new Stack<>();
        String[] chr = n.split(",");
        // Integer.parseInt(ch[2]);
        for(int i=0;i<chr.length;i++){
            if(Character.isDigit(chr[i].charAt(0))){
                stack.push(Integer.parseInt(chr[i]));
                

            }
            else{
                
                int op2 = stack.pop();
                int op1 = stack.pop();
                if(chr[i].equals("+"))
                    stack.push(op2 + op1);
                  
                else if(chr[i].equals("-"))
                    stack.push(op2 - op1);
                
                else if(chr[i].equals("/"))
                    stack.push(op2 / op1);
                else if(chr[i].equals("*"))
                    stack.push(op2 * op1);
            }

        }
        System.out.println(stack.peek());
        
        ob.close();
    }
}


##### // Print the key element which has the highest frequency(if 2 keys exists print the greater key )
import java.util.*;
public class HshmapFunc {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = ob.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                int freq = hm.get(arr[i]);
                freq += 1;
                hm.put(arr[i], freq);
            }else{
                hm.put(arr[i], 1);
            }
        }
        int maxkey = 0;
        int maxfreq = 0;
        for(int key : hm.keySet()){
            if(hm.get(key) > maxfreq){
                maxfreq = hm.get(key);
                maxkey = key;
            }else if(hm.get(key) == maxfreq){
                if(key > maxkey){
                    maxkey = key;
                }
            }
        }
        System.out.println(maxkey);
        ob.close();
    }
}



