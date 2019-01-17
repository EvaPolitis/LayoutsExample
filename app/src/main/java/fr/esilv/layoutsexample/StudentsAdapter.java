package fr.esilv.layoutsexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentsAdapter extends ArrayAdapter<Student> {
	
	private final LayoutInflater layoutInflater;
	
	public StudentsAdapter(@NonNull Context context, List<Student> students) {
		super(context, 0, students);
		this.layoutInflater = LayoutInflater.from(context);
	}
	
	@NonNull
	@Override
	public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = layoutInflater.inflate(R.layout.view_student, parent, false);
			holder = new ViewHolder();
			holder.firstName = convertView.findViewById(R.id.firstName);
			holder.lastName = convertView.findViewById(R.id.lastName);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		
		Student student = getItem(position);
		holder.firstName.setText(student.getFirstName());
		holder.lastName.setText(student.getLastName());
		
		return convertView;
	}
	
	static class ViewHolder {
		private TextView firstName;
		private TextView lastName;
	}
}
