package com.example.azbuka.models;

import android.content.Context;
import android.media.MediaPlayer;

public class Letter {
    private String name;
    private Integer soundId;

    public void playSound(Context context) {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, soundId);
        mediaPlayer.start();
    }

    public Letter(String name, Integer soundId) {
        this.name = name;
        this.soundId = soundId;
    }

    public Letter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSoundId() {
        return soundId;
    }

    public void setSoundId(Integer soundId) {
        this.soundId = soundId;
    }
}
