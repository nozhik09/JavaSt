package lesson_27.lesson2;

import jdk.jfr.Percentage;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    //Метод помеченный этой анотацией выполняется перед каждым тестом
//    @BeforeEach
    public void setUp() {
        System.out.println("BeforeEach");


    }

    @Test
    public void testAddition() {

        int result = 2 + 2;
        Assertions.assertEquals(4, result);
//        Assertions.assertEquals(5, result);
        assertTrue(4 == result);
//        assertTrue(5 == result);
        assertNull(null);
        assertNotNull("String");
    }
//    @BeforeAll вызывается 1 раз перед выполнения всех тестов
//    @AfterEach выполняетя полсе каждокого метода
//    @AfterAll выполняется 1 раз в конце всех тестов
//    @Disabled - указать что бы тест не проходил

    @Nested
    class NestedTeast {
        @BeforeEach
        public void setStartValur() {

            System.out.println("Nested BeforEach");
        }

        @Test
        void testNested() {

            Assertions.assertEquals(5, 5);
        }

    }

    @Test
    public void testMethod() {

    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "Banana", "cherry"})
    public void testFruits(String fruit) {
        System.out.println("Current value " + fruit);
        Assertions.assertTrue(fruit.length() > 3);


    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})
    public void testInts(int value) {
        System.out.println("current value " + value);
        Assertions.assertTrue(value > 0);
    }

    @ParameterizedTest
    @EnumSource(EnumTest.class)
    void testEnums(EnumTest value) {
        assertNotNull(value);
    }

    @ParameterizedTest
    @MethodSource("stingProvaider")
    public void testFruitsMethodsSourse(String argument) {
        System.out.println("Current stream arg: " + argument);
        Assertions.assertTrue(argument.length() > 0);

    }

    static Stream<String> stingProvaider() {

        return Stream.of("apple", "banana", "fig", "orange");
    }

    @ParameterizedTest
    @CsvSource({"apple , 1 , true ", "banana , 2 , false", "cherry , 3 , true"})
    public void testWithCsvSourse(String fruits, int rank, boolean flag) {
        System.out.println(fruits + "|" + rank + "|" + flag);
        assertNotNull(fruits);
        assertTrue(rank > 0);
    }
//    @ParameterizedTest
//    @CsvFileSource(resources = "/data.csv")
//        public void testWithFileSource(String fruits , int rank , boolean flag){
//
//
//
//    }

    @ParameterizedTest
    @MethodSource("squareTestData")
    public void testSauare(int input, int expected, boolean isEqual) {
        int result = input * input;
//        Assertions.assertEquals(expected, result);
        assertEquals(isEqual, result == expected);


    }

    static Stream<Arguments> squareTestData() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)

        );

    }





    }


