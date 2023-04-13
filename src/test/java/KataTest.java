import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */

@ExtendWith(MockitoExtension.class)
public class KataTest {

    private Kata kata;
//    @Mock
//    private MockRepository mockRepository;
//    @InjectMocks
//    private MockService mockService;


    @BeforeEach
    void init() {
        kata = new Kata();
//        when(mockRepository.getLat(1)).thenReturn(10);
    }


//    @Test
//    void testMethod() {
//        assertEquals(false, kata.method() );
//    }



    @Test
    void testMethod() {

        assertTrue(kata.method());

    }








//
//    @Test
//    void scoreFor0PointGame() {
//        assertEquals(0, kata.returnTotalScoreForGame("00 00 00 00 00 00 00 00 00 00"));
//    }


//    @Test
//    void scorefor2rollsIn1Frame() {
//        String input = "11";
//        int expected = 2;
//        assertEquals(expected, kata.returnTotalScoreForGame(input));
//    }


//    @Test
//    void scoreForAStrike() {
//    }


//    @Test
//    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
//    void testTimeout() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(1);
////        TimeUnit.SECONDS.sleep(0);
//    }


//    @Test
//    void testIllegalArguments() {
//        assertThrows( IllegalArgumentException.class, () -> kata.method("invalid") );
//    }


//    @ParameterizedTest
//    @CsvSource( {
//            "1, I",
//            "2, II",
//            "3, III",
//            "4, IV",
//            "5, V",
//    } )
//    void testNumbers1to5( int input, String expected ) {
//        assertEquals(expected, kata.numberToNumeral(input));
//    }


//    @Test
//    void testMockedService(){
//        assertEquals(10, mockService.getLat(1));
//    }


//    @ParameterizedTest
//    @CsvSource( {
//            "10 10 10 10 10 10 10 10 1/ 11, 21",
//            "X 23 51 5/ 00 00 00 10 1/ X 10, 69",
//            "X X X 5/ 1/ X 01 00 1/ X 10, 135",
//    } )
//    void testReturnsCorrectTotalsStrikesAndSplits( String frames, String totalExpected ) {
//        assertEquals(totalExpected, k.gameTotal(frames));
//    }


//
//    @Test
//    void testSingleNumber1() {
//
//        String expected =
//                "\n" +
//                "|\n" +
//                "|";
//
//        String returned = kata.convertDigitToLCDNumber("1");
//
////        printString("expected 1", expected);
////        printString("returned", returned);
//
//        assertEquals(expected, returned);
//
//    }
//
//    @Test
//    void testSingleNumber2() {
//
//        String expected =
//                        " _ \n" +
//                        " _|\n" +
//                        "|_ ";
//
//        String returned = kata.convertDigitToLCDNumber("2");
//
////        printString("expected 2", expected);
////        printString("returned", returned);
//
//        assertEquals(expected, returned);
//
//    }
//
//    @Test
//    void testConsecutiveNumbers1and2() {
//
//        String expected =
//                        " " +  " _ \n" +
//                        "|" +  " _|\n" +
//                        "|" +  "|_ ";
//
//        String returned = kata.convertDigitToLCDNumber("12");
//
//        printString("expected 12", expected);
//        printString("returned", returned);
//
//        assertEquals(expected, returned);
//
//    }
//
//
//    void printString(String description, String s){
//        System.out.println(description);
//        System.out.println(s);
//    }



//
//    @Test
//    void testIllegalArgument_$_character() {
//        assertThrows( IllegalArgumentException.class, () -> kata.returnFewestCoins("$1") );
//    }
//
//    @Test
//    void testIllegalArgument_tooShort() {
//        assertThrows( IllegalArgumentException.class, () -> kata.returnFewestCoins("£") );
//    }
//
//    @Test
//    void testLegalArgument() {
//        assertDoesNotThrow( () -> kata.returnFewestCoins("£1") );
//    }



}


















