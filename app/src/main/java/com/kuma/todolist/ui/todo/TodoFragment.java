package com.kuma.todolist.ui.todo;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.kuma.todolist.R;

public class TodoFragment extends Fragment {

    private TodoViewModel todoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        todoViewModel =
                new ViewModelProvider(this).get(TodoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_todo, container, false);
        Button button = root.findViewById(R.id.todo_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TodoFragment", "Clicked");
                EditText editText = root.findViewById(R.id.editText);
                TextView textView = root.findViewById(R.id.todoText);
                String text = editText.getText().toString();
                textView.setText(text);
                Log.d("TodoFragment", text);
            }
        });
        return root;
    }
}