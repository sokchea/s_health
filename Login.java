package com.example.sokcheapeng.s_health;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends ActionBarActivity implements View.OnClickListener{
    Button btLogin;
    EditText etUsername, etPassword;
    TextView tvRegisterLink;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btLogin = (Button)findViewById(R.id.btLogin);
        tvRegisterLink = (TextView)findViewById(R.id.tvRegisterLink);
        btLogin.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btLogin:


                break;
            case R.id.tvRegisterLink:
                startActivity(new Intent(this,Register.class));
                break;
        }
    }
}
