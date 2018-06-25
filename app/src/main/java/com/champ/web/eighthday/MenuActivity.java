package com.champ.web.eighthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent=getIntent();
        String Mobile=intent.getStringExtra("Mobile");
        String Pass=intent.getStringExtra("Password");

        Toast.makeText(getApplicationContext(),
                ""+Mobile+" "+Pass,Toast.LENGTH_LONG).show();
        imageButton=findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 =new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent1);
            }
        });

    }
}
