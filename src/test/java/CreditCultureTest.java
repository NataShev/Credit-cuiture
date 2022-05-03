import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CreditCultureTest {
    private CreditCulture num;

    @BeforeAll
    public static void startMethod(){
       System.out.println("Tests started");
    }
    @AfterAll
    public static void afterMethod(){
        System.out.println("Tests finished");
    }
    @BeforeEach
    public void eachMethod(){
        System.out.println("Test start");
        num = new CreditCulture();
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Test finish");
        num = null;
    }


    @Test
    void monthly_Payment_Test () {
        //arrange
        int sumOfcredit = 300000;
        int numberOfMonths = 18;
        double monthsBid = 0.0125;
        double expected = 18715.44;
        //act
        int result = num.monthlyPayment(sumOfcredit,numberOfMonths,monthsBid);
        //assert
        Assertions.assertEquals(expected,result);
    }
    @Test
    void total_Amount_Test(){
        double monthsBid = 0.0125;
        int numberOfMonth = 18;
        int sumOfCredit = 500000;
        double expected = 559375;
        //act
        int result = num.totalAmount(monthsBid,numberOfMonth,sumOfCredit);
        //assert
        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @MethodSource("source")
    public void overpayments_Test(int numberOfMonth,int sumOfCredit,double monthsBid,double expected){
        //act
        int result = num.overpayments(numberOfMonth,sumOfCredit,monthsBid);
        //assert

    }
    private static Stream<Arguments>source(){
        return Stream.of(Arguments.of(18,100000,0.0125,11875),Arguments.of(36,800000,0.0136,201280),
                Arguments.of(24,569000,0.0117,83216.25));
    }
}
//(numberOfMonth++)*sumOfCredit*(monthBid/2)+sumOfCredit
//(numberOfMonth++)*sumOfCredit*(monthsBid/2)
