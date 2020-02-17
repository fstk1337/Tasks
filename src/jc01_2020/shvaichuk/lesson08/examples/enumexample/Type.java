package jc01_2020.shvaichuk.lesson08.examples.enumexample;

public enum Type {
    INT(true),
    INTEGER(false),
    STRING(false);

    boolean primitive;

    Type(boolean primitive) {
        this.primitive = primitive;
    }

    public boolean isPrimitive() {
        return primitive;
    }

}
