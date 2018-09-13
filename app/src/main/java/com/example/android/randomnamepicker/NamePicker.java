package com.example.android.randomnamepicker;

import java.util.List;
import java.util.Random;

public class NamePicker {

    public int randomNumberSelection(List<String> nameList, Random randomNumber){
        int randomIndex = randomNumber.nextInt(nameList.size());
        return randomIndex;
    }

    public String pickRandomName(List<String> nameList, Random randomNumber){
        String name_chosen = nameList.get(randomNumberSelection(nameList, randomNumber));
        return name_chosen;
    }
}
