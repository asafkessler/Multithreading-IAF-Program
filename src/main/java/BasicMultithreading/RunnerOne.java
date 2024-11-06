package BasicMultithreading;

public class RunnerOne {

    public static void Running(){
        for (int i = 0; i < 10; i++) {
            System.out.println("RunnerTwo : " + i);
        }
    }
}
