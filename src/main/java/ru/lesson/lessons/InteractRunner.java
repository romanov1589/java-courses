package ru.lesson.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * class  is allowing to user to calculate two or more parametres
 */
public class InteractRunner {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String exit = "no";
            String operation = "";
            Calculator calculator = new Calculator();
            while (!(exit.equals("yes"))) {
                System.out.println("What we should do: addition/substraction/multiplication/division?");
                operation = br.readLine();
                if (operation.equals("addition")) {
                    System.out.println("Enter first arg:");
                    int first = Integer.parseInt(br.readLine());
                    System.out.println("Enter second arg:");
                    int second = Integer.parseInt(br.readLine());
                    calculator.add(first, second);
                    System.out.println("Result is: " + calculator.getResult());
                    calculator.cleanResult();
                    operation = "";
                    System.out.println("Do u want to exit? - yes/no");
                    exit = br.readLine();
                } else if (operation.equals("substraction")) {
                    System.out.println("Enter first arg:");
                    int first = Integer.parseInt(br.readLine());
                    System.out.println("Enter second arg:");
                    int second = Integer.parseInt(br.readLine());
                    try {
                        calculator.sub(first, second);
                    } catch (UserException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Result is: " + calculator.getResult());
                    calculator.cleanResult();
                    operation = "";
                    System.out.println("Do u want to exit? - yes/no");
                    exit = br.readLine();
                } else if (operation.equals("multiplication")) {
                    System.out.println("Enter first arg:");
                    int first = Integer.parseInt(br.readLine());
                    System.out.println("Enter second arg:");
                    int second = Integer.parseInt(br.readLine());
                    try {
                        calculator.mul(first, second);
                    } catch (UserException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Result is: " + calculator.getResult());
                    calculator.cleanResult();
                    operation = "";
                    System.out.println("Do u want to exit? - yes/no");
                    exit = br.readLine();
                } else if (operation.equals("division")) {
                    System.out.println("Enter first arg:");
                    int first = Integer.parseInt(br.readLine());
                    System.out.println("Enter second arg:");
                    int second = Integer.parseInt(br.readLine());
                    try {
                        calculator.div(first, second);
                    } catch (UserException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Result is: " + calculator.getResult());
                    calculator.cleanResult();
                    operation = "";
                    System.out.println("Do u want to exit? - yes/no");
                    exit = br.readLine();
                } else {
                    continue;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
