import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
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
    private Cat cat;

    @Before
    public void initializeCat() {
        cat = new Cat(feline);
    }

    @Test
    public void testGetSound() {
        Assert.assertEquals("Кошка должна говорить Мяу", "Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Необходим возврат списка пищи хищника.", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
