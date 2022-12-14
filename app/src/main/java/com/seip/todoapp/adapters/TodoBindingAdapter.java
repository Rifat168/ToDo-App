package com.seip.todoapp.adapters;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.seip.todoapp.R;
import com.seip.todoapp.utils.TodoConstants;

public class TodoBindingAdapter {
    @BindingAdapter(value = "app:setPriorityIcon")
    public static void setPriorityIcon(ImageView imageView, String priority){
        int icon;
        switch (priority){
            case TodoConstants.LOW:
                icon = R.drawable.ic_priority_todo_low_24;
                break;
            case TodoConstants.HIGH:
                icon = R.drawable.ic_todo_priority_high_24;
                break;
            default:
                icon = R.drawable.ic_priority_todo_normal_24;
                break;
        }
        imageView.setImageResource(icon);
    }
}
