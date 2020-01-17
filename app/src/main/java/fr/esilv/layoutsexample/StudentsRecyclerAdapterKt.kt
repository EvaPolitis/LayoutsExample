package fr.esilv.layoutsexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

internal class StudentsRecyclerAdapterKt(private val studentList: List<StudentKt>) :
		RecyclerView.Adapter<StudentViewHolderKt>() {
	override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): StudentViewHolderKt {
		val view = LayoutInflater.from(viewGroup.context)
				.inflate(R.layout.view_student, viewGroup, false)
		return StudentViewHolderKt(view)
	}

	override fun onBindViewHolder(studentViewHolder: StudentViewHolderKt, position: Int) {
		studentViewHolder.bind(studentList[position])
	}

	override fun getItemCount(): Int {
		return studentList.size
	}

}