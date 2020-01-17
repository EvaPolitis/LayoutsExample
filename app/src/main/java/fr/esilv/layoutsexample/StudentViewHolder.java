package fr.esilv.layoutsexample;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class StudentViewHolder extends RecyclerView.ViewHolder {
	
	private TextView lastName;
	private TextView firstName;
	
	public StudentViewHolder(@NonNull View itemView) {
		super(itemView);
		lastName = itemView.findViewById(R.id.lastName);
		firstName = itemView.findViewById(R.id.firstName);
	}
	
	public void bind(Student student) {
		lastName.setText(student.getLastName());
		firstName.setText(student.getFirstName());
	}
}
























/*extends RecyclerView.ViewHolder {
	
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
}*/
