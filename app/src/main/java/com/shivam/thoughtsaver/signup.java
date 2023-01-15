package com.shivam.thoughtsaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class signup extends AppCompatActivity {
    private EditText msignupemail,msignuppassword;
    private Button mbtnsignup;
    private TextView mgotologin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().hide();

        msignupemail=findViewById(R.id.textsignupemail);
        msignuppassword=findViewById(R.id.textsignuppassword);
        mbtnsignup=findViewById(R.id.btnsignup);
        mgotologin=findViewById(R.id.gotologin);

        mgotologin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signup.this,MainActivity.class);
                startActivity(intent);


            }

        });

        mbtnsignup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String mail=msignupemail.getText().toString().trim();
                String password=msignuppassword.getText().toString().trim();

                if(mail.isEmpty() || password.isEmpty()){
                    Toast.makeText(getApplicationContext(), "All fields are required..", Toast.LENGTH_SHORT).show();
                }else if(password.length()<7){
                    Toast.makeText(getApplicationContext(), "Password should greater than 7", Toast.LENGTH_SHORT).show();
                }else{

                }

            }

        });
    }

}
