package de.fham.oop.FizzBuzz;


import org.assertj.core.util.Lists;

import java.util.List;

public class MyStackImplList implements de.fham.oop.FizzBuzz.MyStack {

    private List<Integer> theStack = Lists.newArrayList();

    @Override
    public boolean isEmpty() {

        return theStack.isEmpty();
    }

    @Override
    public Integer peek() {

        return theStack.get(theStack.size() - 1);
    }

    @Override
    public Integer pop() {
        Integer element = theStack.get(theStack.size() - 1);
        theStack.remove(theStack.size() - 1);
        return element;
    }

    @Override
    public void push(Integer i) {

        theStack.add(i);
    }

}
