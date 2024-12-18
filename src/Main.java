public class Main {
    public static void main(String[] args) {
        printGreeting();
        displaySquare(5);
        displayUserInfo("Samy", 28);
    }

    private static void printGreeting() {
        System.out.println("Welcome to Java Programming!");
    }

    private static void displaySquare(int num) {
        System.out.println("The Square of " + num + " is " + (int) Math.pow(num, 2));
    }

    private static void displayUserInfo(String name, int age) {
        System.out.println("User: " + name + ", Age: " + age);
    }
}