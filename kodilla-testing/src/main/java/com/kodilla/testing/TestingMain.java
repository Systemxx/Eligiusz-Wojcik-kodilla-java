package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theFormUser");
        String result = simpleUser.getUserName();

        if (result.equals("theFormUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

                Calculator addNumbersCalculator = new Calculator();
                int resultAdd = addNumbersCalculator.add(10, 10);
                System.out.println(resultAdd);

                Calculator subtractNumbersCalculator = new Calculator();
                int resultSubtract = subtractNumbersCalculator.subtract(26,36);
                System.out.println(resultSubtract);
    }
}
