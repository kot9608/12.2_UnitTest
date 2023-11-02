package simple_shopping_cart;

import static simple_shopping_cart.Main.getStoreItems;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.*;


public class TestCard {

    @Test
    public void testPriceCard () {
        Shop shop = new Shop(getStoreItems());
        Cart card = new Cart(shop);
        card.addProductToCartByID(1);
        card.addProductToCartByID(2);
        card.addProductToCartByID(3);
        Assertions.assertEquals(620.00d, card.getTotalPrice());
    }


    @Test
    public void testPriceMultiCard () {
        Shop shop = new Shop(getStoreItems());
        Cart card = new Cart(shop);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        Assertions.assertEquals(470.00d, card.getTotalPrice());
    }

    @Test
    public void testPriceDelCard () {
        Shop shop = new Shop(getStoreItems());
        Cart card = new Cart(shop);
        card.addProductToCartByID(1);
        card.addProductToCartByID(2);
        card.addProductToCartByID(3);
        card.removeProductByID(1);
//        Assertions.assertEquals(450.00d, card.getTotalPrice());
        assertThat(card.getTotalPrice()).isEqualTo(450.00d);
    }

    @Test
    public void testPriceMoveCard () {
        Shop shop = new Shop(getStoreItems());
        Cart card = new Cart(shop);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(7);
    }

    @Test
    public void testPriceMoveAllCard () {
        Shop shop = new Shop(getStoreItems());
        Cart card = new Cart(shop);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        assertThat(card.cartItems.get(0).getQuantity()).isEqualTo(10);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(0);
    }


    @Test
    public void testPriceMoveToCard () {
        Shop shop = new Shop(getStoreItems());
        Cart card = new Cart(shop);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.addProductToCartByID(1);
        card.removeProductByID(1);
        assertThat(card.cartItems.get(0).getQuantity()).isEqualTo(9);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(1);
    }


    @ParameterizedTest
    @ValueSource(ints ={-100, 50000, 0, -1})
    public void testPriceMoveExetp (int id) {
        Shop shop = new Shop(getStoreItems());
        Cart card = new Cart(shop);
        Assertions.assertThrows(RuntimeException.class, ()-> {
            card.addProductToCartByID(id);
        }
        );
    }
}
