package com.example.sokcheapeng.s_health;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Register extends ActionBarActivity implements View.OnClickListener{
    Button btRegister;
    EditText etName,etAge,etUsername,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etName = (EditText)findViewById(R.id.etName);
        etAge = (EditText)findViewById(R.id.etAge);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btRegister=(Button)findViewById(R.id.btRegister);
        btRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btRegister:


                break;
        }
    }
}
