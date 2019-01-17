package fr.esilv.layoutsexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class StudentViewHolder extends RecyclerView.ViewHolder {
	
	private TextView firstName;
	private TextView lastName;
	
	public StudentViewHolder(View itemView) {
		super(itemView);
		firstName = itemView.findViewById(R.id.firstName);
		lastName = itemView.findViewById(R.id.lastName);
	}
	
	public void bind(Student student) {
		firstName.setText(student.getFirstName());
		lastName.setText(student.getLastName());
	}
}
