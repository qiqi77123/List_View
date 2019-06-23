package com.example.ssl.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnsimple,btnbase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsimple=(Button)findViewById(R.id.btnSimple);
        btnbase = (Button)findViewById(R.id.btnBase);

        btnsimple.setOnClickListener(this);
        btnbase.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSimple:
                startActivity(new Intent(MainActivity.this,SimpleAdapter.class));
                break;
            case R.id.btnBase:
                startActivity(new Intent(MainActivity.this,BaseAdapter.class));
                break;
        }
    }
}
