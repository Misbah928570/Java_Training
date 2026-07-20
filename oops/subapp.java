package oops;
//abstraction
abstract class app {
    public abstract void open();
    public abstract void close();
    public void display(){
        System.out.println("app is working fine");
    }
}
public class subapp extends app{
    public void open(){
        System.out.println("app is opened");
    }
    public void close(){
        System.out.println("app is closed");
    }
    public static void main(String[] args){
        app ob = new subapp();
        ob.open();
        ob.close();
        ob.display();
    }
}