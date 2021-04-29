package com.example.implicit_and_explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button buttonImplicit, buttonExplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonImplicit = findViewById(R.id.bt1);
        buttonExplicit = findViewById(R.id.bt2);

        buttonImplicit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
                    {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://Google.com"));
                startActivity(intent);
            }
        });

       buttonExplicit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v)
           {
               Intent intent = new Intent(getBaseContext(),MainActivity2.class);
               startActivity(intent);
           }
       });
    }
}