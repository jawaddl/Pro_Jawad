package com.example.pro_jawad;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    private Button Second_act_btn;
    private ImageView oldm;
    private ImageView newm;
    private ImageView heat;
    private ImageView forza5;
    private ImageView forza4;
    private ImageView forza2;
    private ImageView corsa;
    private ImageView[] pics;
    private Switch Part2;
    private ImageView BlackTop;
    private Button BT;
    public int DS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        oldm = findViewById(R.id.oldm);
        newm = findViewById(R.id.newm);
        heat = findViewById(R.id.heat);
        forza5 = findViewById(R.id.forza5);
        forza4 = findViewById(R.id.forza4);
        forza2 = findViewById(R.id.Forza2);
        corsa = findViewById(R.id.corsa);

        Part2 = findViewById(R.id.part2);
        BT = findViewById(R.id.button4);
        BlackTop = findViewById(R.id.BlackTop);
        pics = new ImageView[7];
        pics[0] = (ImageView) findViewById(R.id.oldm);
        pics[1] = (ImageView) findViewById(R.id.newm);
        pics[2] = (ImageView) findViewById(R.id.heat);
        pics[3] = (ImageView) findViewById(R.id.forza5);
        pics[4] = (ImageView) findViewById(R.id.forza4);
        pics[5] = (ImageView) findViewById(R.id.Forza2);
        pics[6] = (ImageView) findViewById(R.id.corsa);
        Second_act_btn = findViewById(R.id.Second_act_btn);


        Second_act_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }


        });

    }

    private int currentIndex = 0;
    public void Like(View view) {
        // Hide all images except the first one
        for (int i = DS; i < pics.length; i++) {
            if (i != 0) {
                pics[i].setVisibility(View.INVISIBLE);
            } else {
                pics[i].setVisibility(View.VISIBLE);
            }
        }
        // Set click listener to the button
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Hide the current image
                pics[currentIndex].setVisibility(View.INVISIBLE);

                // Move to the next image index
                currentIndex = (currentIndex + 1) % pics.length;

                // Show the next image
                pics[currentIndex].setVisibility(View.VISIBLE);
            }
        });
    }

    public void Dont_Like(View view) {
        for (int i = DS; i < pics.length; i++) {
            if (i != 0) {
                pics[i].setVisibility(View.INVISIBLE);
                DS = i ;
            } else {
                pics[i].setVisibility(View.VISIBLE);
            }
        }
        // Set click listener to the button
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Hide the current image
                pics[currentIndex].setVisibility(View.INVISIBLE);

                // Move to the next image index
                currentIndex = (currentIndex + 1) % pics.length;

                // Show the next image
                pics[currentIndex].setVisibility(View.VISIBLE);
            }
        });
    }




    public void Click(View view) {
        if (Part2.isChecked())
            BlackTop.setVisibility(View.VISIBLE);
        else
            BlackTop.setVisibility(View.INVISIBLE);
         }
        }