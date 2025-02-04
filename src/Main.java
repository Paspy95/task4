public class Main {
    public static void main(String[] args) {
        Bascet cart = new Bascet();
        cart.addProduct("Помидор", 2);
        cart.addProduct("Огурец", 11);

        System.out.println(cart.getProducts());
        System.out.println(cart.getProductQuantity("Помидор"));

        cart.updateProductQuantity("Помидор", 8);
        System.out.println(cart.getProductQuantity("Помидор"));

        cart.removeProduct("Огурец");
        System.out.println(cart.getProducts());

        cart.clear();
        System.out.println(cart.getProducts());
    }
}
