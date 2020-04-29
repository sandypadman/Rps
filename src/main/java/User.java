import java.util.Scanner;

public class User {
    private String name;
    private int counter;
    Scanner scan;

    public  User(Scanner scan){
        this.scan= scan;
    }

    public void promptForName(String message){
        System.out.println(message);
        this.name = scan.next();
    }

    public void promptForCounter(String message){
        System.out.println(message);
        this.counter = scan.nextInt();
    }

    public void getDetails()
    {
        promptForName("Please enter your name: ");
        promptForCounter("How many games do you want to play: ");
        System.out.println("\n Hello " + getName());
        System.out.println(" We will play "+ getCounter()+ " games");
    }

    public String getName () {
        return name;
    }
    public int getCounter (){
        return counter;
    }
    public void setName(String name) { this.name = name; }
    public void setCounter(int counter)
    {
        this.counter = counter;
    }
}

