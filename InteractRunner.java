import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractRunner {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        String exit = "no";
        Calculator calculator = new Calculator();
        while(!(exit.equals("yes"))){

                System.out.println("Enter first arg:");
                int first = Integer.parseInt(br.readLine());
                System.out.println("Enter second arg:");
                int second = Integer.parseInt(br.readLine());
                calculator.add(first, second);
                System.out.println("Result is: " + calculator.getResult());
                System.out.println("Do u want to exit? - yes/no");
                exit = br.readLine();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
