package ru.lesson.lessons;

/**
 * A calculator class with 4 operations
 */
public class Calculator {
    private int result;

    public int getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }

    /**
     * additioning params
     * @param params params is additioned
     */
    public void add(int... params) {
        for (int i : params) {
            this.result += i;

        }
    }

    /**
     * multiplication
     * @param params adding arguments
     * @throws UserException if user didn't add arguments, throws exception
     */
    public void mul(int... params) throws UserException {
        if(params.length > 0) {
            for (int i = 0; i < params.length - 1; i++) {
                result = params[i] * params[i + 1];
            }
        }else{
            throw new UserException("You should add two or more arguments!");
        }
    }

    /**
     * substraction
     * @param params added arguments
     * @throws UserException if user didn't add arguments, throws exception
     */
    public void sub(int... params) throws UserException {
        if(params.length > 0) {
            for (int i = 0; i < params.length - 1; i++) {
                result = params[i] - params[i + 1];
            }
        }else{
            throw new UserException("You should add two or more arguments!");
        }
    }

    /**
     * division
     * @param params added arguments
     * @throws UserException if user didn't add arguments, throws exception
     */
    public void div(int... params) throws UserException {
            if (params.length > 0) {
                for (int i = 0; i < params.length - 1; i++) {
                    result = params[i] / params[i + 1];
                }
            } else {
                throw new UserException("You should add two or more arguments!");
            }

    }


}
