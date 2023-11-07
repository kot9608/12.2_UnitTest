import static org.mockito.Mockito.*;

import card.CreditCard;
import card.PaymentForm;
import org.junit.jupiter.api.Test;
import java.util.Iterator;
//import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

public class Seminar4_Test2 {
    @Test
    public void CardTest(){
        CreditCard mockCreditCard = mock(CreditCard.class);
//        when(iterator.next()).thenReturn("Hello").thenReturn("World!");
        when(mockCreditCard.getCardNumber()).thenReturn("1234");
        when(mockCreditCard.getCardHolder()).thenReturn("Ivan Ivanov");
        when(mockCreditCard.getExpiryDate()).thenReturn("10/28");
        when(mockCreditCard.getCvv()).thenReturn("111");

        PaymentForm paymentForm = new PaymentForm(mockCreditCard);
        paymentForm.pay(100);
        verify(mockCreditCard, times(1)).charge(100);

    }
}
