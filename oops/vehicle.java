package oops;
//Interface
public interface vehicle {
    public void on();
    public void off();
    default void diaplay(){
        System.out.println("default non abstract method within the interface");
    }
}
class bus implements vehicle{
    public void on(){
        System.out.println("bus is on");
    }
    public void off(){
        System.out.println("bus is off");
    }
    public static void main(String[] args){
        vehicle ob = new bus();
        ob.on();
        ob.off();
    }
}