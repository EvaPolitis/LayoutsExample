package fr.esilv.layoutsexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.constraintLinearButton
import kotlinx.android.synthetic.main.activity_main.constraintRelativeButton
import kotlinx.android.synthetic.main.activity_main.linearButton
import kotlinx.android.synthetic.main.activity_main.listViewButton
import kotlinx.android.synthetic.main.activity_main.recyclerViewButton
import kotlinx.android.synthetic.main.activity_main.relativeButton
import kotlinx.android.synthetic.main.activity_main.webViewButton

class MainActivityKt : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		linearButton.setOnClickListener {
			startActivity(Intent(this, LinearLayoutActivityKt::class.java))
		}
		relativeButton.setOnClickListener {
			startActivity(Intent(this, RelativeLayoutActivityKt::class.java))
		}
		constraintLinearButton.setOnClickListener {
			startActivity(Intent(this, ConstraintLayoutLinearActivityKt::class.java))
		}
		constraintRelativeButton.setOnClickListener {
			startActivity(Intent(this, ConstraintLayoutRelativeActivityKt::class.java))
		}
		listViewButton.setOnClickListener {
			startActivity(Intent(this, ListViewActivityKt::class.java))
		}
		recyclerViewButton.setOnClickListener {
			startActivity(Intent(this, RecyclerViewActivityKt::class.java))
		}
		webViewButton.setOnClickListener {
			startActivity(Intent(this, WebViewActivityKt::class.java))
		}
	}
}