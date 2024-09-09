public class Main {
    public static void main(String[] args) {

        String[][] cars = new String[3][3];

        cars[0][0] = "Camero";
        cars[0][1] = "BMW";
        cars[0][2] = "Audi";
        cars[1][0] = "Ford";
        cars[1][1] = "Tesla";
        cars[1][2] = "Ferrari";
        cars[2][0] = "Lamborghini";
        cars[2][1] = "Ranger";
        cars[2][2] = "Hyundai";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}

//A 2-d array is an array of arrays kinda, I seriously mean kinda, like nested loops its the ability to use an array within an array
//to visualise it imagine it being a set of rows and columns