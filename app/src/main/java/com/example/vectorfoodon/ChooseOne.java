package com.example.vectorfoodon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseOne extends AppCompatActivity {
    Button Chef,Customer,DeliveryPerson;
    Intent intent;
   String type;
       ConstraintLayout bgimage;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);
        AnimationDrawable animationDrawable= new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.food1),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.food2),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.food3),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.food5),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.food6),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.food7),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.food8),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.food9),3000);

        animationDrawable.setOneShot(false);
        animationDrawable.setEnterFadeDuration(850);
        animationDrawable.setExitFadeDuration(1600);
        bgimage=findViewById(R.id.back3);
        bgimage.setBackgroundDrawable(animationDrawable);
        animationDrawable.start();
         intent = getIntent();
       type=intent.getStringExtra("home");
         Chef=(Button)findViewById(R.id.ContactAsChef);
         DeliveryPerson=(Button)findViewById(R.id.delivery);
         Customer =(Button)findViewById(R.id.Customer);
         Chef.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(type!="Email"){
                    Intent loginemail=new Intent(ChooseOne.this,Cheflogin.class);
                    startActivity(loginemail);
                    finish();
                 }
                 if(type !="Phone"){
                     Intent loginPhone=new Intent(ChooseOne.this, Chefloginphone.class);
                     startActivity(loginPhone);
                     finish();

                 }
                 if(type !="SignUp"){
                     Intent Register=new Intent(ChooseOne.this,ChefRegistration.class);
                     startActivity(Register);


                 }
             }
         });
         Customer.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(type!=("Email")){
                     Intent loginemailcust=new Intent(ChooseOne.this,Login.class);
                     startActivity(loginemailcust);
                     finish();
                 }
                 if(type!=("Phone")){
                     Intent loginPhonecust=new Intent(ChooseOne.this,LoginPhone.class);
                     startActivity(loginPhonecust);
                     finish();

                 }
                 if(type!=("SignUp")){
                     Intent Registercust=new Intent(ChooseOne.this,Registration.class);
                     startActivity(Registercust);

                 }

             }
         });
         DeliveryPerson.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(type!=("Email")){
                     Intent loginemail=new Intent(ChooseOne.this,Delivery_login.class);
                     startActivity(loginemail);
                     finish();
                 }
                 if(type!=("Phone")){
                     Intent loginPhone=new Intent(ChooseOne.this,Delivery_loginPhone.class);
                     startActivity(loginPhone);
                     finish();

                 }
                 if(type!=("SignUp")){
                     Intent Registerdelivery=new Intent(ChooseOne.this,Delivery_Registration.class);
                     startActivity(Registerdelivery);

                 }

             }
         });
    }
}