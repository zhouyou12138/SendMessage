package com.example.joker.sendmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText adress;
    EditText content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adress = (EditText) findViewById(R.id.editText);
        content = (EditText) findViewById(R.id.editText2);
        Button fs = (Button) findViewById(R.id.button);
        Button qk = (Button) findViewById(R.id.button2);
fs.setOnLongClickListener(new SendSmsListener(this,adress,content));
        qk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adress.setText("");
                content.setText("");
            }
        });
    }
}
