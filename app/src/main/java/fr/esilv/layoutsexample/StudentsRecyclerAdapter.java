package fr.esilv.layoutsexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class StudentsRecyclerAdapter extends RecyclerView.Adapter<StudentViewHolder> {
	
	private final List<Student> studentList;
	
	StudentsRecyclerAdapter(@NonNull List<Student> studentList) {
		this.studentList = studentList;
	}
	
	@NonNull
	@Override
	public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
		View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_student, viewGroup, false);
		return new StudentViewHolder(view);
	}
	
	@Override
	public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int position) {
		studentViewHolder.bind(studentList.get(position));
	}
	
	@Override
	public int getItemCount() {
		return studentList.size();
	}
}


















/*extends RecyclerView.Adapter<StudentViewHolder> {
	
	private final List<Student> studentList;
	
	public StudentsRecyclerAdapter(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	@Override
	public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_student, parent, false);
		return new StudentViewHolder(view);
	}
	
	@Override
	public void onBindViewHolder(StudentViewHolder holder, int position) {
		Student student = studentList.get(position);
		holder.bind(student);
	}
	
	@Override
	public int getItemCount() {
		return studentList == null ? 0 : studentList.size();
	}
}*/
