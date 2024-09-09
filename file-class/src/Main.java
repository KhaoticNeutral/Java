import java.io.File;

public class Main {
    public static void main(String[] args) {

    File file = new File("Secrete_Message.txt");
    File file1 = new File("C:\\Users\\kikib\\Desktop\\Code\\New_Message.txt");

    if(file.exists()) {
        System.out.println("File exists :D");
        System.out.println(file.getPath()); //gets the file path
        System.out.println(file.getAbsolutePath()); //gets the full file path
        System.out.println(file.isFile()); //returns a boolean if it is a file
        //file.delete(); This will delete your file
    }else{
        System.out.println("File does not exist :D");
    }

    if(file1.exists()) {
        System.out.println("File exists :D");
    }else {
        System.out.println("File does not exist :D");
    }

    }
}
//file is an abstract representation of file paths
//make sure not to put it in your src folder else it will say that it doesn't exsist
//put it in your project file
//however if it's somewhere else in your desktop we will have to list the full file path name
//after you refresh your project only then will the file be deleted 
