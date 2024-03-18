package ir.hw15;

public class MyMethods {

    private int soorat;
    private int makhraj;


    public MyMethods(int soorat, int makhraj) {
        this.soorat = soorat;
        this.makhraj = makhraj;
    }

    public MyMethods add(MyMethods num) {
        int resultsoorat = (this.soorat * num.makhraj) + (num.soorat * this.makhraj);
        int resultmakhraj = this.makhraj * num.makhraj;
        return new MyMethods(resultsoorat, resultmakhraj);
    }

    public MyMethods sub(MyMethods num) {
        int resultsoorat = (this.soorat * num.makhraj) - (num.soorat * this.makhraj);
        int resultmakhraj = this.makhraj * num.makhraj;
        return new MyMethods(resultsoorat, makhraj);
    }

    public MyMethods mul(MyMethods num) {
        int resultsoorat = this.soorat * num.soorat;
        int resultmakhraj = this.makhraj * num.makhraj;
        return new MyMethods(resultsoorat, resultmakhraj);

    }

    public MyMethods div(MyMethods num) {
        int resultsoorat = this.soorat * num.makhraj;
        int resultmakhraj = this.makhraj * num.soorat;
        return new MyMethods(resultsoorat, resultmakhraj);
    }

    public double toFloatingPoint() {

        return (double) soorat / makhraj;
    }


}
