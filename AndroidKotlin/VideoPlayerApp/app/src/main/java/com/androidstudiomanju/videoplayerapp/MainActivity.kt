package com.androidstudiomanju.videoplayerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.androidstudiomanju.videoplayerapp.R.raw.baby

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView:VideoView = findViewById(R.id.videoView1)
        // Displaying videos from local storage
        videoView.setVideoPath(
            "android.resources://"
            +packageName + "/"
            +R.raw.fishes
        )
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
        videoView.start()

    }
}