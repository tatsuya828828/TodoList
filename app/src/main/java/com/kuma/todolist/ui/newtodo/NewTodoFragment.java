package com.kuma.todolist.ui.newtodo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.kuma.todolist.R;
import com.kuma.todolist.ui.todo.TodoViewModel;

public class NewTodoFragment extends Fragment {

    private NewTodoViewModel newTodoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        newTodoViewModel =
                new ViewModelProvider(this).get(NewTodoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_new_todo, container, false);
        final TextView textView = root.findViewById(R.id.text_new_todo);
        newTodoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}