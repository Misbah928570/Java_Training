package oops;
//Aggregation
class address{
    String city;
    address(String city){
        this.city = city;
    }
}
public class Employee {
    String name;
    address a;
    Employee(String name,address a){
        this.name = name;
        this.a = a;
    }
    void display(){
        System.out.println(name+" "+a.city);
    }
    public static void main(String[] args){
        address a = new address("bellonge");
        Employee e = new Employee("aloy",a);
        e.display();
    }
}
