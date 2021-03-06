package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class infoActivity extends AppCompatActivity implements View.OnClickListener {

    int imgno=0;
    int imgs[] = {R.drawable.nexon1, R.drawable.nexon2,R.drawable.nexon3,
        R.drawable.nexon4,R.drawable.nexon5};

    String txts[] = {"위의 사진은 넥슨 사옥 입니다.","넥슨의 정준형 회장입니다.","넥슨의 게임들 입니다",
            "매출표 입니다.","넥슨의 신입사원 연봉입니다."};
    ImageView img_info;
    TextView txt_info;
    Button btn_info_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        img_info = findViewById(R.id.img_info);
        txt_info = findViewById(R.id.txt_info);
        btn_info_back = findViewById(R.id.btn_info_back);

        img_info.setOnClickListener(this);
        btn_info_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_info:
                Log.d("test","이미지 클릭");
                imgno = ++imgno %5;
                img_info.setImageResource(imgs[imgno]); ;
                txt_info.setText(txts[imgno]);
                break;
            case R.id.btn_info_back:
                Log.d("test","버튼 클릭");
                finish();
                break;
        }

    }
}