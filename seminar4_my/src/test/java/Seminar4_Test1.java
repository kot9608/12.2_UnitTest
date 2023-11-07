import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import java.util.Iterator;
//import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;


//Создать мок-объект Iterator, настроить поведение так, чтобы за два вызова next() Iterator вернул два слова  “Hello World”, и проверить это поведение с помощью утверждений
public class Seminar4_Test1 {
    @Test
    public void iterTest(){
        Iterator iterator = mock(Iterator.class);
        when(iterator.next()).thenReturn("Hello").thenReturn("World!");
        String result = iterator.next() +" "+ iterator.next();
        assertThat(result).isEqualTo("Hello World!");
    }

}
