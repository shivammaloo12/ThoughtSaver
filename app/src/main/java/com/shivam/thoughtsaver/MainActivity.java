package com.shivam.thoughtsaver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mloginemail,mloginpassword;
    private Button mbtnlogin;
    private TextView mgotoforgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        mloginemail=findViewById(R.id.textloginemail);
        mloginpassword=findViewById(R.id.textloginpassword);
        mbtnlogin=findViewById(R.id.btnlogin);
        mgotoforgotpassword=findViewById(R.id.gotoforgotpassword);
    }
}