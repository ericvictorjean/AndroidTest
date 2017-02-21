package com.example.earaujgi7alumnes.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Comentario 1
        Button createButton = (Button)findViewById(R.id.create);
        createButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                // create an Intent using the current Activity
                // and the Class to be created
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                // pass the Intent to the Activity,
                // using the specified action defined in StartPage
                startActivity(i);
            }
        });
    }
}
