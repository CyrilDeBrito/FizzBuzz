package main.java.fizzbuzz;

 public class FizzBuzz {

    public String generate(int minNumber, int maxNumber) {

        String result = "";
        while (minNumber <= maxNumber)
            result += evaluateNumber(minNumber++);
        return result;
    }

        private String evaluateNumber (int number){
                if (isModulo15(number))
                    return "FizzBuzz";
                if (isModulo3(number))
                    return "Fizz";
                else if (isModulo5(number))
                    return "Buzz";
                return String.valueOf(number);
        }

		private boolean isModulo5(int number) {
			return number % 5 == 0;
		}

		private boolean isModulo3(int number) {
			return number % 3 == 0;
		}

		private boolean isModulo15(int number) {
			return number % 15 == 0;
		}
 }

