public class WhileLoopFun
{
    public WhileLoopFun() {}

    public double factorial(int number)
    {
        double result = number;
        while (number != 1) {
            number--;
            result = result * number;
        }
        return result;
    }

    public void printDigits(int number)
    {
        String num = Integer.toString(number);
        int index = num.length();
        while (index != 0) {
            System.out.println(num.substring(index - 1, index));
            index--;
        }
    }

    public int sumOfDigits(int number)
    {
        String num = Integer.toString(number);
        int index = num.length();
        int result = 0;
        while (index != 0) {
            result += Integer.parseInt(num.substring(index - 1, index));
            index--;
        }
        return result;
    }

    public boolean isPrime(int number)
    {
        int count = 0;

        if (number == 1)
        {
            return false;
        }
        else
        {
            int divisor = 1;
            int quotient;

            while (divisor <= number) {
                quotient = number / divisor;
                if ((quotient * divisor) == number) {
                    count++;
                }
                divisor++;
            }
            if (count != 2) {
                return false;
            }
            else {
                return true;
            }
        }
    }

    public int maxDoubles(int number, int threshold)
    {
        int result = number;
        int count = 0;

        while (result < threshold) {
            result = result * 2;
            count++;
        }
        if (count > 0) {
            count--;
        }
        return count;
    }
}

