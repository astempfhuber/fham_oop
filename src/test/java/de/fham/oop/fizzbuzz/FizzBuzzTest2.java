package de.fham.oop.FizzBuzz;

import de.fham.oop.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest2 {

    FizzBuzz sut;

    //wird vor jedem Test ausgeführt
    @BeforeEach
    void setUp(){

        sut = new FizzBuzz();

    }

    @Test
    void one_fizzBuzz_is_one(){

        //Set up
        //sut = system under test
        //FizzBuzz sut = new FizzBuzz();

        //ineinander geschachtelt
        //assertThat(sut.fizzBuzz( 1)).isEqualTo("1");

        //run the function
        String resultOfFizzBuzz = sut.calcFizzBuzz(1);

        //assert result
        assertThat(resultOfFizzBuzz).isEqualTo("1");
        assertThat(resultOfFizzBuzz).isInstanceOf(String.class);

    }

    @Test
    void two_fizzBuzz_is_two(){

        //set up
        //FizzBuzz sut = new FizzBuzz();

        //run the shit
        String resultOfFizzBuzz = sut.calcFizzBuzz(2);

        //assert result
        assertThat(resultOfFizzBuzz).isEqualTo("2");
        assertThat(resultOfFizzBuzz).isInstanceOf(String.class);
    }

    @Test
    void FizzBuzz_of_15() {

        //run the shit
        String resultOfFizzBuzz = sut.calcFizzBuzz(15);

        //assert result
        assertThat(resultOfFizzBuzz).isEqualTo("FizzBuzz");
        assertThat(resultOfFizzBuzz).isInstanceOf(String.class);
    }

    @Test
    void FizzBuzz_of_3() {
        //run the shit
        String resultOfFizzBuzz = sut.calcFizzBuzz(3);

        //assert result
        assertThat(resultOfFizzBuzz).isEqualTo("Fizz");
    }

    @Test
    void FizzBuzz_of_5() {
        //run the shit
        String resultOfFizzBuzz = sut.calcFizzBuzz(5);

        //assert result
        assertThat(resultOfFizzBuzz).isEqualTo("Buzz");
    }

}