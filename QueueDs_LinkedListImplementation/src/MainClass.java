import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){
        File myTestFile = new File("C:\\Users\\Prosper's PC\\Documents\\LinkedListTesting.txt");
        Queue myQueue = new Queue();
        try {
            Scanner readInput = new Scanner(myTestFile);
            while (readInput.hasNextLine()) {
                String data = readInput.nextLine();
                if (data.equals("-")) {
                    System.out.println(myQueue.dequeue());
                } else {
                    myQueue.enqueue(data);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
