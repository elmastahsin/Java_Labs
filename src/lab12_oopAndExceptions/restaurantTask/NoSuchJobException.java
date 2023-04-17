package lab12_oopAndExceptions.restaurantTask;

public class NoSuchJobException extends RuntimeException {
    public NoSuchJobException(String message) {
        super(message); // display the specified message as an exception message
    }
/*
    public static void main(String[] args) {
        // throw new RuntimeException("Something went wrong");
        //throw new RuntimeException("Invalid job!");
    }*/
}
