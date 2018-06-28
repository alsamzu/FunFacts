package com.example.zulfa.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        public static final String TAG = MainActivity.class.getSimpleName();
        private FactBook factBook = new FactBook();
        private  ColorWheel colorWheel = new ColorWheel();
    // Declare our view variables
        private TextView factTextView;
        private Button showFactButton;
        private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign the views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.ShowFactButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout) ;

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();


                // Update the screen with a new fact
                factTextView.setText(fact);

                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener( listener);

        //Toast.makeText(this, "Yey! Our app was created", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We are loging from the logcat");


    }
}
