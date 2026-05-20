```java
class FoodItem {

    private String foodName;
    private double itemPrice;

    public FoodItem(String foodName, double itemPrice) {
        this.foodName = foodName;
        this.itemPrice = itemPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}

class Restaurant {

    private String nameOfRestaurant;
    private FoodItem[] foodMenu;

    public Restaurant(String nameOfRestaurant, FoodItem[] foodMenu) {
        this.nameOfRestaurant = nameOfRestaurant;
        this.foodMenu = foodMenu;
    }

    public void showMenu() {

        System.out.println("===== Welcome to " + nameOfRestaurant + " =====");

        for (int i = 0; i < foodMenu.length; i++) {

            FoodItem item = foodMenu[i];

            if (item != null) {

                System.out.println(
                        (i + 1) + ". " +
                        item.getFoodName() +
                        " --> ₹" +
                        item.getItemPrice()
                );
            }
        }

        System.out.println("-----------------------------------");
    }
}

public class project1 {

    public static void main(String[] args) {

        FoodItem item1 = new FoodItem("Paneer Tikka", 250.0);
        FoodItem item2 = new FoodItem("Butter Naan", 50.0);
        FoodItem item3 = new FoodItem("Dal Makhani", 200.0);
        FoodItem item4 = new FoodItem("Chocolate Ice Cream", 80.0);

        FoodItem[] menu = {item1, item2, item3, item4};

        Restaurant restaurant =
                new Restaurant("Taste of India", menu);

        restaurant.showMenu();

        System.out.println();
        System.out.println("Visit Again :)");
    }
}
```
