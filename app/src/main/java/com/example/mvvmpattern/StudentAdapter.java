package com.example.mvvmpattern;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmpattern.databinding.StudentBinding;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyAdapter> {

    List<StudentsViewModel> data;
    Context context;
    private LayoutInflater inflater;

    public StudentAdapter(List<StudentsViewModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (inflater==null){
            inflater=LayoutInflater.from(parent.getContext());
        }
        StudentBinding studentBinding=StudentBinding.inflate(inflater,parent,false);

        return new MyAdapter(studentBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyAdapter extends RecyclerView.ViewHolder {
        private StudentBinding studentBinding;

        public MyAdapter(StudentBinding studentBinding) {
            super(studentBinding.getRoot());
            this.studentBinding=studentBinding;
        }
        public void bind (StudentsViewModel studentsViewModel){
            this.studentBinding.setViewModel(studentsViewModel);
        }
        public StudentBinding getstudentBinding(){
            return studentBinding;
        }
    }
}
