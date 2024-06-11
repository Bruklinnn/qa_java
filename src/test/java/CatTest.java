import com.example.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

@Test
    public void catGetSoundTest(){
        /*Feline feline = new Feline();*/
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу",cat.getSound());
    }

    @Test
    public void catGetFoodTest() throws Exception {
    List<String> foodsExpected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(foodsExpected);
        /*Feline feline = new Feline();*/
        Cat cat = new Cat(feline);
        List<String> catGoodsActual = cat.getFood();
        Assert.assertEquals(foodsExpected,catGoodsActual);
    }
}
