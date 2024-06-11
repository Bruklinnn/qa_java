

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test(expected = Exception.class)
    public void lionGenderExceptionTest() throws Exception {
        Lion lion = new Lion(" ", feline);
        lion.doesHaveMane();
    }

    @Test(expected = AssertionError.class)
    public void exceptionMessageErrorTest() throws AssertionError {
        try {
            Lion lion = new Lion(" ", feline);
            Assert.fail("Expected AssertionError");
        }
        catch (Exception thrown) {
            Assert.assertNotEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }
    @Test
    public void lionGenderTrueTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expectedHasMane = true;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }

    @Test
    public void getLionHaveKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedGetKittens = 1;
        int actualGetKittens = lion.getKittens();
        assertEquals(expectedGetKittens, actualGetKittens);
    }

    @Test
    public void getLionTypeOfFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        /*Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));*/
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }
}