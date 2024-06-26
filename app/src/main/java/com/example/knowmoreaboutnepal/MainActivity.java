package com.example.knowmoreaboutnepal;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView myWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize WebView from the layout
        myWeb = findViewById(R.id.myWeb);

        // Enable JavaScript (if required by the website)
        WebSettings webSettings = myWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Set a WebViewClient to handle page navigation within the WebView
        myWeb.setWebViewClient(new WebViewClient());

        // Load the URL into the WebView
        myWeb.loadUrl("http://imroj.com.np");
    }

    // Override onBackPressed to handle back navigation in the WebView
    @Override
    public void onBackPressed() {
        if (myWeb.canGoBack()) {
            myWeb.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
