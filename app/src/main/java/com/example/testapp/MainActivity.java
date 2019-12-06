package com.example.testapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btnTextShow, btnHomePageOpen;
    RadioButton rdoOreo, rdoPie;
    ImageView ivAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar bar=getSupportActionBar();
        bar.setTitle("좀 그럴듯한 앱");
        bar.setDisplayShowHomeEnabled(true);
        bar.setIcon(R.drawable.bob);
        editText=(EditText)findViewById(R.id.edtInput);
        btnTextShow=(Button)findViewById(R.id.btnTextShow);
        btnHomePageOpen=(Button)findViewById(R.id.btnHomePageOpen);
        rdoOreo=(RadioButton)findViewById(R.id.rdoOreo);
        rdoPie=(RadioButton)findViewById(R.id.rdoPie);
        ivAndroid=(ImageView)findViewById(R.id.ivAndroid);
        btnTextShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,editText.getText().toString(),Toast.LENGTH_SHORT).show();
/*          // 하단은 선택한 문자만 나오도록 설정
                        Toast.makeText(getApplicationContext(),"나는행복합니다.",Toast.LENGTH_SHORT).show();*/
                    }
                });
        btnHomePageOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent=new Intent(Intent.ACTION_VIEW, Uri.parse(editText.getText().toString()));
                startActivity(mintent);
            }
        });
        rdoOreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivAndroid.setImageResource(R.drawable.api44);

            }
        });

        rdoPie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivAndroid.setImageResource(R.drawable.pie);
            }
        });





    }
}
