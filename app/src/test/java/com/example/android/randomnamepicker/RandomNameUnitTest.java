package com.example.android.randomnamepicker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class RandomNameUnitTest {
    @Test
    public void name_isCorrect() throws Exception {
        NamePicker namePicker = new NamePicker();

        List<String> nameList = new ArrayList<>();
        nameList.add("John");
        nameList.add("Albert");
        nameList.add("Richard");
        nameList.add("Zealand");
        nameList.add("Sophie");
        nameList.add("George");
        nameList.add("Trey");
        nameList.add("Katherine");
        nameList.add("James");

        Random randomNumber = new Random();

        randomNumber.setSeed(124514);
        String name_chosen = namePicker.pickRandomName(nameList, randomNumber);
        assertEquals("Sophie", name_chosen);
    }

    @Test
    public void name_isRandom() throws Exception {
        NamePicker namePicker = new NamePicker();

        List<String> nameList = new ArrayList<>();
        nameList.add("John");
        nameList.add("Albert");
        nameList.add("Richard");
        nameList.add("Zealand");
        nameList.add("Sophie");
        nameList.add("George");
        nameList.add("Trey");
        nameList.add("Katherine");
        nameList.add("James");

        Random randomNumber = new Random();

        String name_chosen = namePicker.pickRandomName(nameList, randomNumber);
        assertEquals("John", name_chosen);
    }

}