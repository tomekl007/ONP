import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Tomasz Lelek
 * @since 2014-11-03
 */
public class ONPTest {

    @Test
    public void shouldAddTwoNumbers(){
        //when
        int result = ONP.countExpression("2 3 +");
        //then
        Assert.assertEquals(5, result);

    }


    @Test
    public void shouldAddTwoBiggerNumbers(){
        //when
        int result = ONP.countExpression("12 3 +");
        //then
        Assert.assertEquals(15, result);

    }

    @Test
    public void shouldExecuteTwoAddOperations(){
        //when
        int result = ONP.countExpression("12 3 + 5 +");
        //then
        Assert.assertEquals(20, result);

    }

    @Test
    public void shouldSubstract(){
        //when
        int result = ONP.countExpression("12 3 -");
        //then
        Assert.assertEquals(9, result);
    }

    @Test
    public void shouldDivide(){
        //when
        int result = ONP.countExpression("10 2 / ");
        //then
        Assert.assertEquals(5, result);
    }

    @Test
    public void shouldMultiply(){
        //when
        int result = ONP.countExpression("10 2 * ");
        //then
        Assert.assertEquals(20, result);
    }

    @Test
    public void shouldCountExpressionWithAllOperands(){
        //when
        int result = ONP.countExpression("12 2 3 4 * 10 5 / + * +");
        //then
        Assert.assertEquals(40, result);
    }

    @Test
    public void shouldCountFunction(){
        //when
        int result = ONP.countExpression("2 3 - abs");
        //then
        Assert.assertEquals(1, result);
    }
}
