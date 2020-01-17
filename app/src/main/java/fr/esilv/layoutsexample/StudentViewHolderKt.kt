package fr.esilv.layoutsexample

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_student.view.firstName
import kotlinx.android.synthetic.main.view_student.view.lastName

internal class StudentViewHolderKt(itemView: View) : RecyclerView.ViewHolder(itemView) {
	fun bind(student: StudentKt) {
		itemView.lastName.text = student.lastName
		itemView.firstName.text = student.firstName
	}
}