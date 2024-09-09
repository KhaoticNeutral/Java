public class ShoppingCartTH {

    ItemTH[] items = {new ItemTH("Shirt",25.60),
            new ItemTH("WristBand",1.00),
            new ItemTH("Pants",35.99)};

    public static void main(String[] args){
        ShoppingCartTH cart = new ShoppingCartTH();
        cart.displayTotal();
    }

    public void displayTotal(){
        double total = 0;
        for(int idx = 0; idx < items.length; idx++){
            if(items[idx].isBackOrdered())
                continue;
            total += items[idx].getPrice();
        }
        System.out.println("Shopping Cart total: "+total);
    }

}
