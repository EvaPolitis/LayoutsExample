package fr.esilv.layoutsexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recycler_view);
		
		RecyclerView recyclerView = findViewById(R.id.recyclerView);
		recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
		
		recyclerView.setAdapter(new StudentsRecyclerAdapter(createStudentList(50)));
	}
	
	private List<Student> createStudentList(final int numberOfStudents) {
		List<Student> students = new ArrayList<>();
		if (numberOfStudents <= 0) {
			return students;
		}
		for (int i = 0; i < numberOfStudents; i++) {
			Student student = new Student("FirstName " + i, "LastName " + i);
			students.add(student);
		}
		return students;
	}
	
}
