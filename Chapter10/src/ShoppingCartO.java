public class ShoppingCartO {

    public static void main(String args[]){
        OrderO order = new OrderO("Rick Wilson", 910.00, "VA", OrderO.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }

}
