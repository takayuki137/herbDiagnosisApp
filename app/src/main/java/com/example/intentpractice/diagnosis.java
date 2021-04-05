package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class diagnosis extends AppCompatActivity {

    TextView where;
    Button workOrStudy;
    Button breakTime;

    TextView purpose;
    Button forWork;
    Button whileBreakTime;

    TextView when;
    Button alone;
    Button withFamily;

    Button comfortable;
    Button slow;

    Button daytime;
    Button nighttime;
    TextView whichtime;

    Button inside;
    Button outside;

    TextView scine;
    Button danran;
    Button sleep;


    public void alone(View view){

        where.setVisibility(View.VISIBLE);
        workOrStudy.setVisibility(View.VISIBLE);
        breakTime.setVisibility(View.VISIBLE);

        when.setVisibility(View.INVISIBLE);
        alone.setVisibility(View.INVISIBLE);
        withFamily.setVisibility(View.INVISIBLE);





    }

    public void workOrStudy(View view){


        purpose.setVisibility(View.VISIBLE);
        forWork.setVisibility(View.VISIBLE);
        whileBreakTime.setVisibility(View.VISIBLE);
        where.setVisibility(View.INVISIBLE);
        workOrStudy.setVisibility(View.INVISIBLE);
        breakTime.setVisibility(View.INVISIBLE);

    }

    public void breakTime(View view){

        purpose.setVisibility(View.VISIBLE);
        where.setVisibility(View.INVISIBLE);
        workOrStudy.setVisibility(View.INVISIBLE);
        breakTime.setVisibility(View.INVISIBLE);
        slow.setVisibility(View.VISIBLE);
        comfortable.setVisibility(View.VISIBLE);


    }

    public void forWork(View view){
        String a=getString(R.string.mint);
        String b=getString(R.string.lemon);
        String c=getString(R.string.orange);
        Intent intent =new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("sendText1",a);
        intent.putExtra("sendText2",b);
        intent.putExtra("sendText3",c);
        startActivity(intent);

    }

    public void whileBreakTime(View view){
        String a=getString(R.string.berugamotto);
        String b=getString(R.string.glass);
        String c=getString(R.string.grape);
        Intent intent =new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("sendText1",a);
        intent.putExtra("sendText2",b);
        intent.putExtra("sendText3",c);
        startActivity(intent);
    }

    public void comfortable(View view){

        String a=getString(R.string.yukari);
        String b=getString(R.string.mint);
        String c=getString(R.string.lemon);

        Intent intent =new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("sendText1",a);
        intent.putExtra("sendText2",b);
        intent.putExtra("sendText3",c);
        startActivity(intent);


    }

    public void slow(View view){
        String a=getString(R.string.majoram);
        String b=getString(R.string.rose);
        String c=getString(R.string.labenda);
        Intent intent =new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("sendText1",a);
        intent.putExtra("sendText2",b);
        intent.putExtra("sendText3",c);
        startActivity(intent);
    }

    public void withFamily(View view){

        when.setVisibility(View.INVISIBLE);
        alone.setVisibility(View.INVISIBLE);
        withFamily.setVisibility(View.INVISIBLE);
        whichtime.setVisibility(View.VISIBLE);
        daytime.setVisibility(View.VISIBLE);
        nighttime.setVisibility(View.VISIBLE);



    }

    public void daytime(View view){
        whichtime.setVisibility(View.INVISIBLE);
        daytime.setVisibility(View.INVISIBLE);
        nighttime.setVisibility(View.INVISIBLE);
        where.setVisibility(View.VISIBLE);
        inside.setVisibility(View.VISIBLE);
        outside.setVisibility(View.VISIBLE);
    }

    public void nighttime(View view){
        whichtime.setVisibility(View.INVISIBLE);
        daytime.setVisibility(View.INVISIBLE);
        nighttime.setVisibility(View.INVISIBLE);
        scine.setVisibility(View.VISIBLE);
        danran.setVisibility(View.VISIBLE);
        sleep.setVisibility(View.VISIBLE);


    }

    public void inside(View view){
        String a=getString(R.string.majoram);
        String b=getString(R.string.rose);
        String c=getString(R.string.labenda);
        Intent intent =new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("sendText1",a);
        intent.putExtra("sendText2",b);
        intent.putExtra("sendText3",c);
        startActivity(intent);

    }

    public void sleep(View view){
        String a=getString(R.string.labenda);
        String b=getString(R.string.orange);
        String c=getString(R.string.berugamotto);
        Intent intent =new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("sendText1",a);
        intent.putExtra("sendText2",b);
        intent.putExtra("sendText3",c);
        startActivity(intent);

    }

    public void danran(View view){
        String a=getString(R.string.labenda);
        String b=getString(R.string.majoram);
        String c=getString(R.string.yukari);
        Intent intent =new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("sendText1",a);
        intent.putExtra("sendText2",b);
        intent.putExtra("sendText3",c);
        startActivity(intent);

    }

    public void outside(View view){
        String a=getString(R.string.mint);
        String b=getString(R.string.lemon);
        String c=getString(R.string.teatree);
        Intent intent =new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("sendText1",a);
        intent.putExtra("sendText2",b);
        intent.putExtra("sendText3",c);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        where =findViewById(R.id.where);
        workOrStudy=findViewById(R.id.workOrStudy);
        breakTime=findViewById(R.id.breakTime);

        purpose =findViewById(R.id.purpose);
        forWork=findViewById(R.id.forWork);
         whileBreakTime=findViewById(R.id.whileBreakTime);

         when =findViewById(R.id.when);
         alone=findViewById(R.id.alone);
         withFamily=findViewById(R.id.withFamily);

         comfortable=findViewById(R.id.comfortable);
         slow=findViewById(R.id.slow);

         daytime=findViewById(R.id.daytime);
         nighttime=findViewById(R.id.nightTime);
         whichtime=findViewById(R.id.whichtime);

         inside=findViewById(R.id.inside);
         outside=findViewById(R.id.outside);

         scine=findViewById(R.id.scine);
        sleep=findViewById(R.id.sleep);
        danran=findViewById(R.id.danran);


    }
}