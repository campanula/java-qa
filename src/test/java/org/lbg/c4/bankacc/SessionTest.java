package org.lbg.c4.bankacc;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.lbg.salesapp2.IReader;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

class SessionTest {
    @Test
    public void verify_if_last_item_sold_is_correct() {

        // arrange

        Basket basket = new Basket();

        Item item1 = new Item("Bananas", 6, 0.19); // 1.14
        Item item2 = new Item("Avocado", 3, 0.89); // 2.67
        Item item3 = new Item("Spinach", 1, 1.27); // 1.27
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);

        ObjectMapper objectMapper = new ObjectMapper();

        String expectedResult = "";

        double value = 5.08;

        try {

            expectedResult = objectMapper.writeValueAsString(item3);

        } catch (JsonProcessingException e) {

            e.printStackTrace();

        }

        IDataStore dataStore = mock(IDataStore.class);
        when(dataStore.getLastItemSoldInDB()).thenReturn(item3);

        Session cut = new Session(dataStore);

        // act

        String actualResult = cut.getTheLastItemSold();

        // assert

        assertEquals(expectedResult, actualResult);
        verify(dataStore, times(1)).getLastItemSoldInDB();

    }

    @Test
    public void verify_if_total_value_of_items_is_correct() {

        // arrange

        Basket basket = new Basket();


        ObjectMapper objectMapper = new ObjectMapper();

        String expectedResult = "";

        double value = 5.08;

        try {

            expectedResult = objectMapper.writeValueAsString(value);

        } catch (JsonProcessingException e) {

            e.printStackTrace();

        }

        IDataStore dataStore = mock(IDataStore.class);
        when(dataStore.getTotalPriceInDB()).thenReturn(value);

        Session cut = new Session(dataStore);

        // act

        String actualResult = cut.getTotalPrice();

        // assert

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void verify_if_basket_has_correct_items() {

        // arrange

        Basket basket = new Basket();

        Item item1 = new Item("Bananas", 6, 0.19); // 1.14
        Item item2 = new Item("Avocado", 3, 0.89); // 2.67
        Item item3 = new Item("Spinach", 1, 1.27); // 1.27
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);

        ObjectMapper objectMapper = new ObjectMapper();

        String expectedResult = "";

        try {

            expectedResult = objectMapper.writeValueAsString(basket);

        } catch (JsonProcessingException e) {

            e.printStackTrace();

        }

        IDataStore dataStore = mock(IDataStore.class);
        when(dataStore.getItemsInDB()).thenReturn(basket);

        Session cut = new Session(dataStore);

        // act

        String actualResult = cut.getItems();

        // assert

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void how_mocks_work() {
        // arrange

        ArrayList<String> names = mock(ArrayList.class);

        names.add("a2");
        int expectedResult = 3;
        when(names.size()).thenReturn(3);

        // act
        int actualResult = names.size();

        // assert
        assertEquals(expectedResult, actualResult);
        verify(names, times(1)).size(); //verifies how many times the method was called in the mock
        verify(names, times(1)).add(any());
    }

    interface IRegister {
        String getDelegate(int i);

        int getNumberRegistered();
    }

    class Register implements IRegister {
        private ArrayList<String> delegates = new ArrayList<>(); //simulates a DB table

        public Register() {
            delegates.add("1");
            delegates.add("2");
            delegates.add("3");
        }

        public String getDelegate(int i) {
            return delegates.get(i - 1);
        }

        public int getNumberRegistered() {
            return delegates.size();
        }
    }

    class Course {

        private IRegister reg;

        public Course(IRegister register) {
            reg = register;
        }

        public String getLastPersonRegistered() {
            String result = reg.getDelegate(reg.getNumberRegistered());
            return result;
        }
    }

    @Test
    public void verify_lastName_returned_is_lastName_in_register() {
        // arrange
        IRegister reg = mock(IRegister.class);
        Course cut = new Course(reg);
        String expectedResult = "3";
        // when(reg.getNumberRegistered()).thenReturn(3);
        when(reg.getDelegate(anyInt())).thenReturn("3");

        // act
        String actualResult = cut.getLastPersonRegistered();

        // assert
        assertEquals(expectedResult, actualResult);
    }

}
 