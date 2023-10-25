package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class PreAudioActivity extends AppCompatActivity {

    BackgroundMYSQL backgroundMYSQL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_audio);
        Objects.requireNonNull(getSupportActionBar()).hide();
        backgroundMYSQL = new BackgroundMYSQL(this);
        backgroundMYSQL.execute("getAudio");
    }
}