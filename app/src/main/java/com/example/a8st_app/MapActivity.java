package com.example.a8st_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.provider.ContactsContract;
import android.provider.MediaStore;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;




public class MapActivity extends AppCompatActivity {
        public static final int REQUEST_CODE_LOGIN = 201;
        public static final int REQUEST_CODE_MAIN= 202;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button menu01Button = (Button) findViewById(R.id.menu01Button);
        menu01Button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.putExtra("titleMsg", "로그인 화면");

                startActivityForResult(intent, REQUEST_CODE_LOGIN);
            }
        });

            Button menu02Button = (Button) findViewById(R.id.menu02Button);
            menu02Button.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("titleMsg", "메인 화면");

                    startActivityForResult(intent, REQUEST_CODE_MAIN);
                }
            });

    }

    }

