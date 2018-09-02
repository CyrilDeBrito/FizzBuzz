package com.fizzbuzz;

 class FizzBuzz {

    String generate(int minNumber, int maxNumber) {

        String result = "";
        while (minNumber <= maxNumber)
            result += evaluateNumber(minNumber++);
        return result;
    }

        private String evaluateNumber (int number){
                if (number % 15 == 0)
                    return "FizzBuzz";
                if (number % 3 == 0)
                    return "Fizz";
                else if (number % 5 == 0)
                    return "Buzz";
                return String.valueOf(number);
        }
 }

