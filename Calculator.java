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

}
