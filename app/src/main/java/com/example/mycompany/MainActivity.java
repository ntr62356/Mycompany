package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText userid,passwd ;
    Button btn_info, btn_login,btn_guide,btn_call ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userid = findViewById(R.id.userid);
        passwd = findViewById(R.id.passwd);
        btn_info = findViewById(R.id.btn_info);
        btn_login = findViewById(R.id.btn_login);
        btn_guide = findViewById(R.id.btn_guide);
        btn_call = findViewById(R.id.btn_call);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "로그인 버튼 클릭", Toast.LENGTH_SHORT).show();

                String str_id = userid.getText().toString();
                String str_pw = passwd.getText().toString();
                if(str_id.length() <6 || str_pw.length() < 6){
                    Toast.makeText(MainActivity.this,
                            "아이디 또는 패스워드의 길이는 여섯글자 이상 입니다.", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this,
                            "ID :"+str_id +"pw:"+str_pw, Toast.LENGTH_SHORT).show();

                    if(str_id.equals("robot1") && str_pw.equals("123456")){
                        Log.d( "test", str_id );
                        Log.d( "test", str_pw );

                        Toast.makeText(MainActivity.this,
                                "환영합니다.", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(MainActivity.this,
                                "아이디와 패스워드를 확인하세요", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        btn_info.setOnClickListener(this);
        btn_guide.setOnClickListener(this);
        btn_call.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){
            case R.id.btn_info:
                intent = new Intent(MainActivity.this, infoActivity.class);
                Log.d("test","info click");
                break;
            case R.id.btn_guide:
                intent = new Intent(MainActivity.this, GuideActivity.class);
                Log.d("test","guide click");
                break;
            case R.id.btn_call:
                intent = new Intent(MainActivity.this, CallActivity.class);
                Log.d("test","call click");
                break;
        }
        startActivity(intent);
    }
}