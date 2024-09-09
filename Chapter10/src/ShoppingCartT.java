public class ShoppingCartT {

    public static void main(String args[]){
        OrderT order = new OrderT("Rick Wilson", 910.00, "VA", OrderT .NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }

}
