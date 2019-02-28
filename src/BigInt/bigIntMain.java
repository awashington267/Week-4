package BigInt;

import java.math.BigDecimal;
import java.math.BigInteger;

public class bigIntMain {
    public static void main(String[] args) {
        //Wisconsin 5,726,398
        //California 38,041,430
        //Texas 26,059,203
        //Cost per copy 3.23

        BigInteger wis = new BigInteger("5726398");
        BigInteger cali = new BigInteger("38041430");
        BigInteger texas = new BigInteger("26059203");
        BigDecimal copy = new BigDecimal("3.23");


        BigInteger div = cali.divide(wis);
        BigInteger mul = texas.multiply(div);
        BigDecimal totalCost = calculateCost(mul, copy);

        //BigInteger cost = copy.multiply(mul);
        System.out.println("Total letters from Wisconsin to Cali: " + div + "\nTotal Copies of letters made to Texas: " + mul
                + "\nThe cost for each copy will be: " + totalCost);
    }

    public static BigDecimal calculateCost(BigInteger mul, BigDecimal copy2)
    {
        BigDecimal copy  = copy2.multiply(new BigDecimal(mul));

        return copy;
    }
}
