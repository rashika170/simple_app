package com.example.color_bg;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends
        AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle
                                    savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.RelativeLayout bgElement = (android.widget.RelativeLayout)
                findViewById(R.id.activity_main);
        bgElement.setBackgroundColor(android.graphics.Color.WHITE);

        myButtonListenerMethod();
    }
    public void myButtonListenerMethod() {
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new android.view.View.OnClickListener() {
                                              @Override
                                              public void onClick(android.view.View v) {
                                                  android.widget.RelativeLayout bgElement =
                                                          (android.widget.RelativeLayout)findViewById(R.id.activity_main);
                                                  int color = ((android.graphics.drawable.ColorDrawable)
                                                          bgElement.getBackground()).getColor();
                                                  if (color == android.graphics.Color.RED) {
                                                      bgElement.setBackgroundColor(android.graphics.Color.BLUE);
                                                  }
                                                  else {
                                                      bgElement.setBackgroundColor(android.graphics.Color.RED);
                                                  }
                                              }
                                          });
    }
}


