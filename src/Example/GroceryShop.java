package Example;

public class GroceryShop {
    public static void main(String[] args) {
        Apple apple = new Apple(220, "jabłkowate", "szampion");
        Apple apple1 = new Apple(220, "jabłkowate", "ligol");


        System.out.println(apple1.getInfo());
        System.out.println(apple.getInfo());

    }
}
