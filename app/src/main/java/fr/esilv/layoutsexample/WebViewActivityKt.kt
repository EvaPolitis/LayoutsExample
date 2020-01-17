package fr.esilv.layoutsexample

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web_view.webView

class WebViewActivityKt : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_web_view)
		webView.webViewClient = WebViewClient()
		webView.loadUrl("https://www.esilv.fr/")
	}

	override fun onBackPressed() {
		if (webView!!.canGoBack()) {
			webView!!.goBack()
		} else {
			super.onBackPressed()
		}
	}
}