package fr.esilv.layoutsexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class StudentsAdapterKt(context: Context, students: List<StudentKt>) :
		ArrayAdapter<StudentKt>(context, 0, students) {
	private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
	override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
		var convertView = convertView
		val holder: ViewHolder
		if (convertView == null) {
			convertView = layoutInflater.inflate(R.layout.view_student, parent, false)
			holder = ViewHolder()
			holder.firstName = convertView.findViewById(R.id.firstName)
			holder.lastName = convertView.findViewById(R.id.lastName)
			convertView.tag = holder
		} else {
			holder = convertView.tag as ViewHolder
		}
		val student = getItem(position)
		holder.firstName!!.text = student!!.firstName
		holder.lastName!!.text = student.lastName
		return convertView!!
	}

	internal class ViewHolder {
		var firstName: TextView? = null
		var lastName: TextView? = null
	}

}