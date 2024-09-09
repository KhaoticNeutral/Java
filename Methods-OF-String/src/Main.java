public class Main {
    public static void main(String[] args) {

        String name = "Victor";
        //boolean method
        //boolean result = name.equalsIgnoreCase("Victor"); //this compares two strings and will return a boolean value
        //System.out.println(result); //When adding the ignore case it just ignores the upper or lower casing og the string
        //boolean result = name.isEmpty();

        //int method
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("i");

        //grammer
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim(); //This will remove any empty space in your string
        String result = name.replace("i", "e"); //put the character you want to replace first then the character you want to replace it with
        System.out.println(result);
    }
}

//String is a refrence data-type remember? well there is a lot more going on with the string that meets the eye
//uncomment diffrent sections to see how it works