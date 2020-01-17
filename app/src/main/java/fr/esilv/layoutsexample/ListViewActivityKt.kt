package fr.esilv.layoutsexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list_view.listView
import java.util.ArrayList

class ListViewActivityKt: AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_list_view)
		listView.adapter = StudentsAdapterKt(this, createStudentList(50))
	}

	private fun createStudentList(numberOfStudents: Int): List<StudentKt> {
		val students: MutableList<StudentKt> = ArrayList()
		if (numberOfStudents <= 0) {
			return students
		}
		for (i in 0 until numberOfStudents) {
			val student = StudentKt("FirstName $i", "LastName $i")
			students.add(student)
		}
		return students
	}
}