import book.BookService;
import org.junit.jupiter.api.Test;
import weather.WeatherReporter;
import weather.WeatherService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Sem4_HW {

    @Test
    public void TestWeatherReport(){
//        WeatherService mockWeatherService = mock(WeatherService.class);
//        when(mockWeatherService.getCurrentTemperature()).thenReturn(22);
//        WeatherReporter weatherReporterTest = new WeatherReporter(mockWeatherService);
//        String result = weatherReporterTest.generateReport();
//        assertThat(result).isEqualTo("Текущая температура: 22 градусов.");

        BookService mockBookService = mock(BookService.class); //создал мок-объект класса букСервис
        when(mockBookService.)

    }
}