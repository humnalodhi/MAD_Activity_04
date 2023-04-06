package com.example.mad_activity_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void showToast1(View view) {
        Toast.makeText(getBaseContext(), "You ordered Burger!", Toast.LENGTH_SHORT).show();
    }


    public void showToast2(View view) {
        Toast.makeText(getBaseContext(), "You ordered Pizza!", Toast.LENGTH_SHORT).show();
    }

    public void showToast3(View view) {
        Toast.makeText(getBaseContext(), "You ordered Sandwich!", Toast.LENGTH_SHORT).show();
    }

    public void showToast5(View view) {
        Toast.makeText(getBaseContext(), "You ordered Chicken Crackers!", Toast.LENGTH_SHORT).show();
    }

}