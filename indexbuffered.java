import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class indexbuffered {

    public static void main(String[] args) {
        System.out.println("Enter number");
        
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int age = 100;
        try {
            age = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(age);
        try {
            bufferedReader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}