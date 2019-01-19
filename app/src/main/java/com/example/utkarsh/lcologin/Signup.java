package com.example.utkarsh.lcologin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends Activity {

    Button btn_signin;
    EditText name,mid,mno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        mno = findViewById(R.id.mno);
        mid = findViewById(R.id.mid);

        btn_signin = findViewById(R.id.btn_signin);
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this,Thanks.class);
                startActivity(intent);
            }
        });
 }
}
