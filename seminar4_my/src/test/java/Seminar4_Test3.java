import static org.mockito.Mockito.*;

import card.CreditCard;
import card.PaymentForm;
import org.junit.jupiter.api.Test;
import weather.WeatherReporter;
import weather.WeatherService;

import java.util.Iterator;
//import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
public class Seminar4_Test3 {

    @Test
    public void TestWeatherReport(){
        WeatherService mockWeatherService = mock(WeatherService.class);
        when(mockWeatherService.getCurrentTemperature()).thenReturn(22);
        WeatherReporter weatherReporterTest = new WeatherReporter(mockWeatherService);
        String result = weatherReporterTest.generateReport();
        assertThat(result).isEqualTo("Текущая температура: 22 градусов.");

    }
}
