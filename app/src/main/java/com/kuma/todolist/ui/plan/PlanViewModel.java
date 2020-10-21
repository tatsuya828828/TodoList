package com.kuma.todolist.ui.plan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PlanViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PlanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is plan fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}