"""
Q : Implement a Factory Pattern where a FoodFactory returns either a Pizza or Cake object based on the input string.
Each food type implements the Food interface and returns its category using getType().
"""

import java.io.*;
import java.util.*;

interface Food {
    String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Fast Food";
    }
}

class Cake implements Food {
    public String getType() {
        return "Dessert";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("cake")) {
            return new Cake();
        }
        return null;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();

        FoodFactory factory = new FoodFactory();
        Food food = factory.getFood(order);

        System.out.println("The factory returned class " + food.getClass().getSimpleName());
        System.out.println("Someone ordered a " + food.getType() + "!");

        sc.close();
    }
}
