package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.List;

public class CollectionTestSuite {

    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");

    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when removing all entries from List. " +
            "the List should continue to work, even when empty")

    @Test
    void testOddNumberExterminateEmptyList() {
        //Given

        List<Integer> emptyList = new LinkedList<>();
        List<Integer> normalList = new LinkedList<>();

        //When

        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing empty list");

        //Then
        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName("when removing odd entries from List. " +
            "the List should present even numbers only")

    @Test
    void testOddNumbersExterminateNormalList() {
        //Given

        List<Integer> normalList = new LinkedList<>();
            normalList.add(2);
            normalList.add(3);
            normalList.add(4);
            normalList.add(5);
            normalList.add(6);

        List<Integer> expectedList = new LinkedList<>();
            expectedList.add(2);
            expectedList.add(4);
            expectedList.add(6);


        //When

        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);


        //Then

        Assertions.assertEquals(expectedList, resultList);
    }
}



