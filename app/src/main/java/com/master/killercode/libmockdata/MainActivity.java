package com.master.killercode.libmockdata;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.master.killercode.libmockdata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MainActivityVM model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVars();
        initActions();
    }

    private void initVars() {

        model = new MainActivityVM(this);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setMock(model);
        binding.executePendingBindings();

    }

    private void initActions() {
        binding.getMock().generateMocks();
        binding.bt.setOnClickListener(binding.getMock().newValues);
    }

}

