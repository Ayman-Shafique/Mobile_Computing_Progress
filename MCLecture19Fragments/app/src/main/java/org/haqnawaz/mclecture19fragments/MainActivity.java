package org.haqnawaz.mclecture19fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button Button1;
    Button Button2;
    Button Button3;
    LinearLayout myLinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1 = findViewById(R.id.btn_1);
        Button2 = findViewById(R.id.btn_2);
        myLinearLayout = findViewById(R.id.linearLayout);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 fragment = new Fragment1();
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, fragment);
                transaction.commit();
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment = new Fragment2();
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, fragment);
                transaction.commit();
            }
        });
    }
}