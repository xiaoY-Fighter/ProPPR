package edu.cmu.ml.proppr.prove.v1;

public class ConstantArgument extends Argument {
    private String name;

    public ConstantArgument(String s) {
        if (s == null)
            throw new NullPointerException("name cannot be null");
        this.name = s;
    }

    @Override
    public boolean isConstant() {
        return true;
    }

    @Override
    public String getName() { return name; }

    public String toString() {
        return "c[" + this.name + "]";
    }
}