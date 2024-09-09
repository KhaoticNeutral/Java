import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows ;
        int cols ;
        String symbol = "";

        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of coloumns: ");
        cols = sc.nextInt();
        System.out.println("Enter the symbol: ");
        symbol = sc.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();

            for (int j = 1; j <= cols; j++) {
                System.out.print(symbol);
            }

        }
    }
}

//nested loop is a loop inside of a loop
//you'll notice that our index has changed names from i to j thats because we cant use the same condition names for each condition 