package de.fham.oop.FizzBuzz;

import org.junit.Test;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

public class MyStackImplListTest
{

    private de.fham.oop.FizzBuzz.MyStack stack = (de.fham.oop.FizzBuzz.MyStack) new de.fham.oop.FizzBuzz.MyStackImplList();
    private Pattern.CharPredicate Matchers;


    @Test
    public void testStack()
    {
        assertThat(stack.isEmpty(), Matchers.is(true));

        stack.push(1);
        assertThat(stack.peek(), equalTo(1));
        stack.push(2);
        assertThat(stack.peek(), equalTo(2));
        stack.push(3);
        assertThat(stack.peek(), equalTo(3));
        stack.push(3);
        assertThat(stack.peek(), equalTo(3));
        stack.push(4);
        assertThat(stack.peek(), equalTo(4));

        assertThat(stack.pop(), equalTo(4));
        assertThat(stack.pop(), equalTo(3));
        assertThat(stack.pop(), equalTo(3));
        assertThat(stack.pop(), equalTo(2));
        assertThat(stack.pop(), equalTo(1));

        assertThat(stack.isEmpty(), Matchers.is(true));
    }

    private Object equalTo(int i) {
    }

}
