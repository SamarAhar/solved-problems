public class numberToString {
    public static void printDigits(int number, String digit[]){
        if(number == 0){
            return;
        }

        int lastDigit = number % 10;
        printDigits(number/10,digit);
        System.out.print(digit[lastDigit]+ " ");
    }

    public static void main(String args[]){
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        printDigits(1212,digits);
    }
}
