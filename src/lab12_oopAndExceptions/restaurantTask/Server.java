package lab12_oopAndExceptions.restaurantTask;

public class Server extends Employee{
    public Server(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Server", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is serving the customers");

    }
    public void takeOrder(){
        System.out.println(getName()+ " is taking order");

    }
    public void cleanTable(){
        System.out.println(getName()+ " is cleaning tables");

    }
}
