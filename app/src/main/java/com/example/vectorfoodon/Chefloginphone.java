package com.example.vectorfoodon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.hbb20.CountryCodePicker;

public class Chefloginphone extends AppCompatActivity {
    EditText num;
    Button sendotp,signinemail;
    TextView signup;
    CountryCodePicker cpp;
    FirebaseAuth Fauth;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheflogin_phone);
        num = (EditText)findViewById(R.id.number);
        sendotp = (Button)findViewById(R.id.otp);
        cpp=(CountryCodePicker)findViewById(R.id.CountryCode);
        signinemail=(Button)findViewById(R.id.btnEmail);
        signup = (TextView)findViewById(R.id.acsignup);

        Fauth = FirebaseAuth.getInstance();

        sendotp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                number=num.getText().toString().trim();
                String Phonenum = cpp.getSelectedCountryCodeWithPlus()+number;
                Intent b = new Intent(Chefloginphone.this,Chefsendotp.class);

                b.putExtra("Phonenum",Phonenum);
                startActivity(b);
                //finish();

            }
        });
        signup.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chefloginphone.this,ChefRegistration.class));
                finish();
            }
        });
        signinemail.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chefloginphone.this,Cheflogin.class));
                finish();
            }
        });

    }
}


