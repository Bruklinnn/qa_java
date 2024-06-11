import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.Silent.class)
public class FelineTest {
    @Spy
    private Animal animal;

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = feline.getKittens(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void predatorEatMeat() throws Exception {
        List<String> eatMeatCollectionsExpected = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        List<String> eatMeatActual = feline.eatMeat();
        Mockito.when(animal.getFood("Хищник")).thenReturn(eatMeatCollectionsExpected);
        Assert.assertEquals(eatMeatCollectionsExpected, eatMeatActual);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals(feline.getFamily(), "Кошачьи");
    }
}


