package com.example.jonghee.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    private EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = (EditText)findViewById(R.id.etText);

        btn = (Button)findViewById(R.id.btn_next);
        btn.setOnClickListener(this);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        String text = etText.getText().toString();
        setContentView(R.layout.activity_main);

        etText = (EditText) findViewById(R.id.etText);
        etText.setText(text);
    }

    @Override
    public void onClick(View view) {
        //다음화면으로 전환
        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        startActivity(intent);
    }

}
