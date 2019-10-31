package de.fham.oop.FizzBuzz;

public class FizzBuzz2 {

    public String calcFizzBuzz(int number){

        for(int i=1;i<=100;i++) {
            if (number % 15 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            }

        }
        //umwandlung int in String
        return Integer.toString(number);
    }
}
