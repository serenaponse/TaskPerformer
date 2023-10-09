public class TaskPerformer {
    private int number;

    public TaskPerformer(int number) {
        this.number = number;
    }

    public long calculateFactorial() {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int inputNumber = 5; // Change this to the desired number
        TaskPerformer taskPerformer = new TaskPerformer(inputNumber);
        long result = taskPerformer.calculateFactorial();
        System.out.println("Factorial of " + inputNumber + " is: " + result);
    }
}
