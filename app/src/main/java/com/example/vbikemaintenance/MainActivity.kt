package com.example.vbikemaintenance

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        setContentView(webView)

        val webSettings: WebSettings = webView.settings

        // ✅ Enable JavaScript and localStorage
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true

        // ✅ Allow access to local assets
        webSettings.allowFileAccess = true
        webSettings.allowContentAccess = true

        // ✅ Enable zoom controls (optional)
        webSettings.builtInZoomControls = true
        webSettings.displayZoomControls = false

        // ✅ Make sure confirm(), alert(), etc. work
        webView.webChromeClient = WebChromeClient()
        webView.webViewClient = WebViewClient()

        // ✅ Load the HTML file from assets folder
        webView.loadUrl("file:///android_asset/index.html")
    }
}
