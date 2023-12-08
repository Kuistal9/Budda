package com.example.javamed;
import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class soundW extends Fragment {
    MediaPlayer mediaPlayer;
    Button buttonPlay, buttonPause, buttonStop;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sound_w, container, false);

        buttonPlay = view.findViewById(R.id.buttonPlay);
        buttonPause = view.findViewById(R.id.buttonPause);
        buttonStop = view.findViewById(R.id.buttonStop);

        // Создание MediaPlayer для воспроизведения аудиофайла
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wumen);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer.prepareAsync(); // Перезагрузка MediaPlayer
                mediaPlayer.seekTo(0);
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}

