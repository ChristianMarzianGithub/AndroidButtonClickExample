package com.example.marzian.listmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnClick;
    private TextView abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClick = (Button) findViewById(R.id.button) ;


        btnClick.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView abc = (TextView) findViewById(R.id.abc);
                        abc.setText("asdf");
                    }
                }
        );




    }




}
