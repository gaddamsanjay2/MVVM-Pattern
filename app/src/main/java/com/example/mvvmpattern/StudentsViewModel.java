package com.example.mvvmpattern;

import androidx.lifecycle.ViewModel;

public class StudentsViewModel extends ViewModel {

    public String name,email;

    public  StudentsViewModel(){

    }
    public StudentsViewModel(StudentsModel studentsModel) {
        this.name = name;
        this.email = email;
    }

}
