package net.shenru.tv;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by xtdhwl on 03/03/2018.
 */

public class TvWebViewActivity extends Activity {

    private WebView mWebView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tv_webview);
        mWebView = findViewById(R.id.webView);
        initWebView();
    }

    private void initWebView() {
        String url = getIntent().getStringExtra("url");

        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAppCacheEnabled(true);

        mWebView.loadUrl(url);
        WebView.setWebContentsDebuggingEnabled(true);
    }
}
