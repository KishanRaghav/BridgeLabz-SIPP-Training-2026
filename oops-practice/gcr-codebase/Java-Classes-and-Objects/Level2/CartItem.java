class CartItem {
    String itemName;
    double price;
    int quantity;

    double total() {
        return price * quantity;
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.itemName = "Book";
        c.price = 200;
        c.quantity = 2;
        System.out.println(c.total());
    }
}