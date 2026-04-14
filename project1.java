import java.util.*;

class Resturant {
    String name;
    FoodItem[] menu;

    void display() {
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i].itemName + " " + menu[i].price);
        }
    }

}

class FoodItem {
    String itemName;
    double price;
}

class Order {
}

public class project1 {
    public static void main(String[] args) {

    }

}
