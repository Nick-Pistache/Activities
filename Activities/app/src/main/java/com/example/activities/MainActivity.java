package com.example.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText mEdit = findViewById(R.id.editText);


        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent HomeActivity = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(HomeActivity);
                Toast.makeText(MainActivity.this, mEdit.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
