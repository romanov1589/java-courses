package ru.lesson.lessons;

/**
 * a class that is allowing to calculate two parametres with addition method
 * from Calculator class
 */
public class ArgRunner {
    /**
     * Adding arguments
     *
     * @param args arguments is added
     */
    public static void main(String[] args) throws UserException {
        System.out.println("Calculate...");
        if (args.length == 2) {
            int first = Integer.valueOf(args[0]);
            int second = Integer.valueOf(args[1]);
            Calculator calculator = new Calculator();
            calculator.add(first, second);
            System.out.println("Suum is: " + calculator.getResult());
        } else {
            throw new UserException("Please add args!");
        }
    }
}
