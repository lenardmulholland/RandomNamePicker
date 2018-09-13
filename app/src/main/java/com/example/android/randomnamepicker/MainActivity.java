package com.example.android.randomnamepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> nameList = new ArrayList<>();
        nameList.add("John");
        nameList.add("Albert");
        nameList.add("Richard");
        nameList.add("Zealand");
        nameList.add("Sophie");
        nameList.add("George");
        nameList.add("Trey");
        nameList.add("Katherine");
        nameList.add("James");

        final Button button = findViewById(R.id.choose_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NamePicker namePicker = new NamePicker();
                Random randomNumber = new Random();
                TextView winnerTextView = (TextView) findViewById(R.id.winner_text_view);
                String name_chosen = namePicker.pickRandomName(nameList, randomNumber);
                winnerTextView.setText(name_chosen);
            }
        });
    }


}
