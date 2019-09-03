package com.example.mvvm.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.mvvm.R;
import com.example.mvvm.databinding.ActivityMainBinding;
import com.example.mvvm.model.User;
import com.example.mvvm.viewmodel.MainViewModel;


public class MainActivity extends AppCompatActivity implements MainNavigator {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);

        binding.recycleView.setLayoutManager(new LinearLayoutManager(this));

        MainViewModel viewModel = ViewModelProviders
                .of(this)
                .get(MainViewModel.class);

        viewModel.setNavigator(this);
        viewModel.setUser();
        viewModel.getUser().observe( this, user -> {
            binding.recycleView.setAdapter(new MainAdapter(user, viewModel));
        });

    }

    @Override
    public void onItemClick(User user) {
        new AlertDialog.Builder(this).setMessage(user.name + "\n" + user.email).show();
    }
}
