package com.example.evaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mEtEmail;
    private EditText mEtPassword;
    private Button mbtnLogin;
    private CheckBox mChkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        mbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=mEtEmail.getText().toString();
                if(mChkbox.isChecked()) {

                }

            }
        });
    }

    private void initviews() {
        mEtEmail=findViewById(R.id.etEmail);
        mEtPassword=findViewById(R.id.etPassword);
        mbtnLogin=findViewById(R.id.btnLogin);
        mChkbox=findViewById(R.id.chkbox);
    }
}