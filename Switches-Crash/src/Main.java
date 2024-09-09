public class Main {
    public static void main(String[] args) {

        String day = "Friday";

        switch(day){
            case "Sunday": System.out.println("It is Sunday");
            break;
            case "Monday": System.out.println("It is Monday");
            break;
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            case "Thursday": System.out.println("It is Thursday");
            break;
            case "Friday": System.out.println("It is Friday");
            break;
            case "Saturday": System.out.println("It is Saturday");
            break;
            default: System.out.println("WHAT CALENDER IS THIS?");
            break;
        }

    }
}

//switches are an easier way that doing endless if else statements but it works much the same way, if you have a value tell the switch to look at that value
//it will then look at each case and then once it finds one that matches then it stops running
//adding a default is extremely important in case a value doesn't match it can output the default instead and you wont have a blank output
//breaks make sure that the enitre block of code doesn't run, if you remove them you'll see what happens