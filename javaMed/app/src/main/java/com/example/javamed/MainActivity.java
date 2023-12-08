package com.example.javamed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick1 (View view){

        soundM  f1 = new soundM ( );
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.conteiner,f1);
            ft.commit();
    }
    public void onClick2 (View view){

        soundW  f2 = new soundW ( );
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.conteiner,f2);
        ft.commit();
    }



}