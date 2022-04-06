package GroceryStore;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
//        Product toothbrush = new Product("Electric Toothbrush", 3550);
//        Product babyAlarm = new Product("Baby Alarm", 4999);

        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        cart.addProduct(toothbrush);
        cart.addProduct(babyAlarm);
        System.out.println(cart);
        System.out.println(cart.getTotalCost());
    }
}
