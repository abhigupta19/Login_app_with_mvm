package com.sar.user.loginapp_mvm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView {
LoginPresent loginPresent=new LoginPresent(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText=findViewById(R.id.editText);
        final EditText editText1=findViewById(R.id.editText2);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresent.onHandle(editText.getText().toString(),editText1.getText().toString());
            }
        });
    }

    @Override
    public void onSuccess() {
            startActivity(new Intent(MainActivity.this,Home.class));
    }

    @Override
    public void onFailure() {
        Toast.makeText(MainActivity.this,"something is wrong",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onError(String message) {

    }
}
