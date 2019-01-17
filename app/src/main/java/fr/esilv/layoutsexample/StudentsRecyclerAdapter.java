package fr.esilv.layoutsexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

class StudentsRecyclerAdapter extends RecyclerView.Adapter<StudentViewHolder> {
	
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
}
