package com.example.jagermeister.contrastratio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browser = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = browser.getSettings();   // Get settings
        webSettings.setJavaScriptEnabled(true);           // Enable Javascript
        browser.setWebViewClient(new WebViewClient());   // Force links and redirects to open in the WebView instead of in a browser
        browser.loadUrl("file:///android_asset/www/index.html");
    }

}