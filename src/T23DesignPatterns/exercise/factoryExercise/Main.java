package T23DesignPatterns.exercise.factoryExercise;

import factoryExercise.cakes.Cake;
import factoryExercise.cakes.CakeFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cakeType = scanner.nextLine();
        Cake cake = PastryShop.orderCake(cakeType);

    }
}
