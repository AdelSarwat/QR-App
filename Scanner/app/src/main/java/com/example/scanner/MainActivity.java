package com.example.scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn_scan;
    public Spinner Qr_reslut;
    public static TextView res;
    public static ArrayList<String> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_scan=(Button) findViewById(R.id.btn_scan);
        Qr_reslut=(Spinner) findViewById(R.id.Qr_spinner);
        res = (TextView)findViewById(R.id.res);

        arr = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_gallery_item,arr);
        Qr_reslut.setAdapter(adapter);
        btn_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ScanCode.class));

            }
        });

    }
}
