public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.printf("dog: %.1f%n", dog);
        System.out.printf("cat: %.1f%n", cat);
        System.out.printf("paper: %d%n", paper);
    }

    public static void task2() {
        System.out.println("Задача 2");

        var increase = 4;
        var dog = 8.0;
        dog += increase;
        var cat = 3.6;
        cat += increase;
        var paper = 763789;
        paper += increase;
        System.out.printf("dog increase by %s: %.1f%n", increase, dog);
        System.out.printf("cat increase by %s: %.1f%n", increase, cat);
        System.out.printf("paper increase by %s: %d%n", increase, paper);
    }

    public static void task3() {
        System.out.println("Задача 3");

        var dog = 8.0;
        dog -= 3.5;
        var cat = 3.6;
        cat -= 1.6;
        var paper = 763789;
        paper -= 7639;
        System.out.printf("dog decrease by 3.5: %.1f%n", dog);
        System.out.printf("cat decrease by 1.6: %.1f%n", cat);
        System.out.printf("paper decrease by 7639: %d%n", paper);
    }

    public static void task4() {
        System.out.println("Задача 4");

        var friend = 19;
        System.out.printf("friend: %d%n", friend);
        friend += 2;
        System.out.printf("friend after increase by 2: %d%n", friend);
        friend /= 7;
        System.out.printf("friend after divide by 7: %d%n", friend);
    }

    public static void task5() {
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.printf("frog: %.1f%n", frog);
        frog *= 10;
        System.out.printf("frog * 10: %.1f%n", frog);
        frog /= 3.5;
        System.out.printf("friend after divide by 3.5: %.1f%n", frog);
    }

    public static void task6() {
        System.out.println("Задача 6");

        var weight1 = 78.2;
        var weight2 = 82.7;
        System.out.printf("Total weight: %.1f%n", weight1 + weight2);
        System.out.printf("Difference of weight: %.1f%n", weight2 - weight1);
    }

    public static void task7() {
        System.out.println("Задача 7");

        var weight1 = 78.2;
        var weight2 = 82.7;
        System.out.printf("Difference of weight: %.1f%n", weight2 - weight1);
        System.out.printf("Another difference of weight: %.1f%n", weight1 % weight2);
    }

    public static void task8() {
        System.out.println("Задача 8");
        // part 1
        var totalHours = 640;
        var workingTime = 8;
        var employees = totalHours/workingTime;
        System.out.printf("The total number of employees in the company is %d a person%n", employees);
        // part 2
        employees += 94;
        var newHours = employees * workingTime;
        System.out.printf("If a company employs %d a person, then only %d hours of work can be divided between employees", employees, newHours);

    }
}