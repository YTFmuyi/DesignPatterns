package 策略模式;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
