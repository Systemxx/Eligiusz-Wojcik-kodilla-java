package com.kodilla.testing.collection;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {

        public List<Integer> exterminate(List<Integer> numbers) {

            List<Integer> aList = new LinkedList<>();

              for (int number : numbers) {
                if (number % 2 == 0) {
                    aList.add(number);
                }
            }

            return aList;
        }
    }