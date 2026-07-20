package oops;

public class cat extends Animal {
    void meow(){
        System.out.println("meow");
        super.color();
    }
    public static void main(String[] args){
        cat a = new cat();
        a.sound();
        a.meow();

    }
}
