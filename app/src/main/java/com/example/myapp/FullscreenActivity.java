package com.example.myapp;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.myapp.databinding.ActivityFullscreenBinding;

public class FullscreenActivity extends AppCompatActivity {
    WebView miVisorWeb;
    String url = "https://www.gestionatuweb.net/crear-webview-con-android-studio-para-cargar-una-web-en-una-app-android/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        miVisorWeb = findViewById(R.id.webview);
        final WebSettings ajustesVisorWeb = miVisorWeb.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        miVisorWeb.loadUrl(url);

    }


}