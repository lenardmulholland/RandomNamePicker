package com.example.android.randomnamepicker;

import java.util.List;
import java.util.Random;

public class NamePicker {

    public int randomNumberSelection(List<String> nameList, Random randomNumber) throws Exception {
        if (nameList.size()>0) {
            int randomIndex = randomNumber.nextInt(nameList.size());
            return randomIndex;
        } else{
            throw new Exception("No names to choose from");
        }
    }

    public String pickRandomName(List<String> nameList, Random randomNumber) throws Exception {
        String name_chosen = nameList.get(randomNumberSelection(nameList, randomNumber));
        nameList.remove(name_chosen);
        return name_chosen;
    }
}
