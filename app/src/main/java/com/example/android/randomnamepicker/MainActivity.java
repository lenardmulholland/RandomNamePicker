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

    TextView winnerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> nameList = new ArrayList<>();
        nameList.add("John");
        nameList.add("Jake");
        nameList.add("Lance");

        final Button button = findViewById(R.id.choose_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NamePicker namePicker = new NamePicker();
                Random randomNumber = new Random();
                winnerTextView = findViewById(R.id.winner_text_view);
                String name_chosen;
                try {
                    name_chosen = namePicker.pickRandomName(nameList, randomNumber);
                    winnerTextView.setText(name_chosen);
                } catch (Exception e) {
                    displayError();
                }
            }
        });
    }

    private void displayError() {
        winnerTextView.setText(R.string.no_names_error);
    }


}
