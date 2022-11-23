package FizzBuzz;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 5 == 0;
        boolean isBuzz = number % 3 == 0;
        if(isBuzz && isFizz)
            return "FizzBuzz";

        if(isBuzz)
            return "Fizz";

        if(isFizz)
            return "Buzz";

        return number + "";
    }
}
