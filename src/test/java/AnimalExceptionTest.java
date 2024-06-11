


import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class AnimalExceptionTest {
    @Test
    public void lionTestExpectedException() {
        Animal animal = new Animal();
        Exception exception = assertThrows(Exception.class, () -> animal.getFood("Нечто"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}