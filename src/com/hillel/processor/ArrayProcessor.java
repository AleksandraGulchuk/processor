package com.hillel.processor;

public class ArrayProcessor<T> {

    private final T[] arrayType;

    public ArrayProcessor(T[] arrayType) {
        this.arrayType = arrayType;
    }

    public void process(ElementProcessor<T> elementProcessor) {
        for (T element : arrayType) {
            elementProcessor.run(element);
        }
    }

}