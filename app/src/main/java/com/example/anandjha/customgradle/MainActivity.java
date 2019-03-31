package com.example.anandjha.customgradle;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showToast(View v){
        switch (v.getId()){
            case R.id.errorButton:
                Toasty.error(this,"Login error",Toast.LENGTH_SHORT).show();
                break;
            case R.id.successButton:
                Toasty.success(this,"Login success",Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoButton:
                Toasty.info(this,"Information here",Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningButton:
                Toasty.error(this,"oopppSS",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toasty.normal(this,"Upload done",Toast.LENGTH_SHORT,ContextCompat.getDrawable(this,R.drawable.ic_arrow)).show();
                break;
        }

    }
}
