public class ShoppingCartO {

    public static void main(String[] args){
        ItemO item1 = new ItemO();
        if (item1.setColor('B')){
            System.out.println("Item1.color = "+item1.color);
        }else System.out.println("Invalid color");
    }

}
