package BasicMultithreading;

public class App {
    public static void main(String[] args) {
        System.out.println("The Multithreading application testing machine STARTED!");
        RunnerOne one = new RunnerOne();
        RunnerTwo two = new RunnerTwo();
        RunnerThree three = new RunnerThree();
        RunnerFour four = new RunnerFour();



        System.out.println("The Multithreading application testing machine ENDED!");
    }
}
