package com.ayesigyederrick.splashcreenintern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    val webView: WebView ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Kyu Portal"

        val webview = findViewById<WebView>(R.id.WebView)
        webview.webViewClient = WebViewClient()

        webview.loadUrl("https://myportal.kyu.ac.ug/")
        val webSettings = webview.settings
        webSettings.javaScriptEnabled = true

    }
    override fun onBackPressed() {
        if(webView?.canGoBack() == true){
            webView?.goBack()
        }
        super.onBackPressed()
    }

}