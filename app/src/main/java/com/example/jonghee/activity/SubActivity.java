package com.example.jonghee.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btn_sub = (Button)findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(SubActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
