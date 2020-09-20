package sieveOfErastosthenes;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainSieveTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }

//    @org.junit.jupiter.api.Test
//    void isPrime() {
//
//    }

    @org.junit.jupiter.api.Test
    void primeTest() {
        MainSieve mainSieve = new MainSieve();
        int maxInt = 10;
        ArrayList<Integer> expectedNumbers = new ArrayList<Integer>(Arrays.asList(1,2,3,5,7));
        assertEquals(MainSieve.isPrime(maxInt), expectedNumbers);
    }
}