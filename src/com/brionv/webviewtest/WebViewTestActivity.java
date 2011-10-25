package com.brionv.webviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewTestActivity extends Activity {
    private WebView webby;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        webby = (WebView)findViewById(R.id.webby);
        webby.loadUrl("http://en.m.wikipedia.org/");
    }
}