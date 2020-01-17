package fr.esilv.layoutsexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recycler_view.recyclerView
import java.util.ArrayList

class RecyclerViewActivityKt : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_recycler_view)
		recyclerView.adapter = StudentsRecyclerAdapterKt(createStudentList(50))
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