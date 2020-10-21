package com.kuma.todolist.ui.newtodo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewTodoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewTodoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is new_todo fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
