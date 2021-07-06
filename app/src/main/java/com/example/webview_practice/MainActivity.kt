package com.example.webview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true  //자바스크립트 허용
        /* 웹뷰에서 새 창이 뜨지 않도록 방지하는 구문 */
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        /* 웹뷰에서 새창이 뜨지 않도록 방지하는 구문 */
        webView.loadUrl("https://www.naver.com")


    }


    override fun onBackPressed() {
        if(webView.canGoBack())
        {//웹사이트에서 뒤로 갈 페이지가 존재한다면.
            webView.goBack() //웹사이트 뒤로가기
        }
        else
        {
            super.onBackPressed() //안드로이드의 백버튼 수행
        }

    }
}