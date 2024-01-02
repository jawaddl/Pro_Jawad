package com.example.pro_jawad;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button btn;
    private Button btnn;
    //private Button insta;
    private Button Second_act_btn;



    ImageView[] iv = new ImageView[3];

    int[] id = new int[7];
    int count = 0;
    int x = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button);
        btnn = (Button) findViewById(R.id.button);
        //insta = (Button) findViewById(R.id.button);

        tv.setTextSize(70);
        tv.setTextColor(Color.GRAY);
        tv.setText("Click here");
        //tv.setVisibility(0);
        //float t = tv.getTextSize();
        //tv.setWidth(135);
        Second_act_btn = findViewById(R.id.Second_act_btn);
        Second_act_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });



}

    public void Click(View view) {
        count++;
        String str = count + " ";
        tv.setText(str);
    }

    public void exit(View view) {
        tv.setText(hashCode());
    }

    public void Next(View view) {
        for (int i = 0; i < 7; i++) {
            iv[i].setImageResource(id[x]);
            x++;
            if (x == 7)
                x = 0;
            //tv.setText('x');
        }
    }

    }