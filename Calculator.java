public class Calculator {

    private int result;



    public int getResult() {
        return this.result;
    }

    public void cleanResult(){
        this.result = 0;
    }
    public void add(int ...params){
        for (int i : params) {
            this.result += i;

        }
    }
    public void mult(int ...params){
        for (int i = 0; i < params.length-1 ; i++) {
            result = params[i] * params[i+1];
        }
    }
    public void subs(int ...params){
        for (int i = 0; i < params.length-1 ; i++) {
            result = params[i] - params[i+1];
        }
    }
    public void div(int ...params){
        for (int i = 0; i < params.length-1 ; i++) {
            result = params[i] / params[i+1];
        }
    }


}
