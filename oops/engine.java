package oops;
//composition
class engine {
    String name;
    engine(String name){
        this.name = name;
    }
    void start(){
        System.out.println("started"+this.name);
    }
}
class car{
    String name;
    engine e;
    car(String name){
        this.name = name;
        e = new engine(this.name);
    }
    void display(){
        System.out.println("start car");
        e.start();
    }
    public static void main(String[] args){
        car c = new car("Abc");
        c.display();
    }
}
