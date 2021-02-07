package org.maatanyy.janggon.mydictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    ImageButton imageButton;

    MainFragment mainFragment;
    GoogleFragment googleFragment;
    KakaoFragment kakaoFragment;
    NaverFragment naverFragment;
    WorldFragment wordFragment;
    FrameLayout container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button google = (Button)findViewById(R.id.google);
       Button naver = (Button)findViewById(R.id.naver);
       Button kakao = (Button)findViewById(R.id.kakao);
       Button word = (Button)findViewById(R.id.word);

       editText = findViewById(R.id.editText);
       imageButton = findViewById(R.id.imageButton);


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
       // fragmentTransaction.add(R.id.container,new MainFragment()).commit();
       // getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();

        naverFragment = new NaverFragment();
        googleFragment = new GoogleFragment();
        kakaoFragment = new KakaoFragment();
        wordFragment = new WorldFragment();

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("text",editText.getText().toString());
                googleFragment = new GoogleFragment();
                googleFragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.container,googleFragment).commit();
            }
        });


        naver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("text",editText.getText().toString());
                naverFragment = new NaverFragment();
                naverFragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.container,naverFragment).commit();

            }
        });


        kakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("text",editText.getText().toString());
                kakaoFragment = new KakaoFragment();
                kakaoFragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.container,kakaoFragment).commit();
            }
        });

        word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("text",editText.getText().toString());
                wordFragment = new WorldFragment();
                wordFragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.container,wordFragment).commit();
            }
        });

    }
}