package jc01_2020.shvaichuk.lesson08.examples.generics;

public class Box<T> {

    T field;

    public Box(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

}
