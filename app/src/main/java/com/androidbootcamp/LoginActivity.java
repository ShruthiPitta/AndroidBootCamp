package com.androidbootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import com.androidbootcamp.util.TwitterService;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        new MyAsynTask().execute();

//        WebView webview = new WebView(this);
//        setContentView(webview);
//        webview.loadUrl("http://www.gmail.com");
        setContentView(R.layout.activity_login);

        WebView wb = (WebView) findViewById(R.id.activity_main_webview);

        wb.loadUrl("http://www.gmail.com");

//        Button login = (Button) findViewById(R.id.login);
//
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LoginActivity.this,ListActivity.class);
//                EditText userName = (EditText) findViewById(R.id.username);
//                intent.putExtra("userName",userName.getText());
//                startActivity(intent);
//            }
//        });
//        setSupportActionBar(toolbar);
    }
}
