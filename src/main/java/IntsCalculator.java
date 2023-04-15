public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) Math.round(target.newFormula()//переходил от дабла к инту таким образом
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result());
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) Math.round(target.newFormula()//переходил от дабла к инту таким образом
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result());
    }

    @Override
    public int pow(int a, int b) {
        return (int) Math.round(target.newFormula()//переходил от дабла к инту таким образом
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result());
    }
}
