package com.kodilla.testing.collection;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {

        public List<Integer> exterminate(List<Integer> numbers) {

            List<Integer> resultList = new LinkedList<>();

              for (int number : numbers) {
                if (number % 2 == 0) {
                    resultList.add(number);
                }
            }

            return resultList;
        }
    }