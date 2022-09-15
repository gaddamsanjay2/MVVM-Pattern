package com.example.mvvmpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<StudentsViewModel> data=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        StudentsViewModel studentsViewModel=new StudentsViewModel();
        studentsViewModel.name="SaiKrishna";
        studentsViewModel.email="saikrishna@gmail.com";
        data.add(studentsViewModel);


        StudentsViewModel studentsViewModel1=new StudentsViewModel();
        studentsViewModel1.name="RamaKrishna";
        studentsViewModel1.email="ram@gmail.com";
        data.add(studentsViewModel1);

        StudentsViewModel studentsViewModel2=new StudentsViewModel();
        studentsViewModel2.name="raju";
        studentsViewModel2.email="raju@gmail.com";
        data.add(studentsViewModel2);

        StudentsViewModel studentsViewModel3=new StudentsViewModel();
        studentsViewModel3.name="Ruksana";
        studentsViewModel3.email="ruksana@gmail.com";
        data.add(studentsViewModel3);

        StudentsViewModel studentsViewModel4=new StudentsViewModel();
        studentsViewModel4.name="karuna";
        studentsViewModel4.email="karuna@gmail.com";
        data.add(studentsViewModel4);


        StudentsViewModel studentsViewModel5=new StudentsViewModel();
        studentsViewModel5.name="Anand";
        studentsViewModel5.email="Anand@gmail.com";
        data.add(studentsViewModel5);

        StudentsViewModel studentsViewModel6=new StudentsViewModel();
        studentsViewModel6.name="Naziya";
        studentsViewModel6.email="Naziya@gmail.com";
        data.add(studentsViewModel6);

        StudentsViewModel studentsViewModel7=new StudentsViewModel();
        studentsViewModel7.name="Akhila";
        studentsViewModel7.email="Akhila@gmail.com";
        data.add(studentsViewModel7);



        StudentsViewModel studentsViewModel8=new StudentsViewModel();
        studentsViewModel8.name="Aishwarya";
        studentsViewModel8.email="Aishwarya@gmail.com";
        data.add(studentsViewModel8);

        StudentsViewModel studentsViewModel9=new StudentsViewModel();
        studentsViewModel9.name="Laxmikanth";
        studentsViewModel9.email="Laxmikanth@gmail.com";
        data.add(studentsViewModel9);

        StudentsViewModel studentsViewModel10=new StudentsViewModel();
        studentsViewModel10.name="hareesh";
        studentsViewModel10.email="hareesh@gmail.com";
        data.add(studentsViewModel10);


        StudentAdapter studentAdapter=new StudentAdapter(data, MainActivity.this);
        recyclerView.setAdapter(studentAdapter);

    }
}


