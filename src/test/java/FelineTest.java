import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    private Feline feline;

    @Before
    public void initializeFeline() {
        feline = new Feline();
    }

    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals("Должен вернуться список еды хищника", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Должно вернуться Кошачьи" ,"Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens () {
        Assert.assertEquals("Ожидаем 1", 1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithParameters () {
        Assert.assertEquals("Ожидаем 3", 3, feline.getKittens(3));
    }
}

