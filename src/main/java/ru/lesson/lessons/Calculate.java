package ru.lesson.lessons;

/**
 * A class that is allowing to addition two parametres
 */
public class Calculate {
    /**
     * Adding arguments
     *
     * @param args aeguments is added
     */
    public static void main(String[] args) throws UserException {
        System.out.println("Calculate...");
        if(args.length == 2) {
            int first = Integer.valueOf(args[0]);
            int second = Integer.valueOf(args[1]);
            int summ = first + second;
            System.out.println("Summ is: " + summ);
        }else{
            throw new UserException("Please add args!");
        }
    }
}
