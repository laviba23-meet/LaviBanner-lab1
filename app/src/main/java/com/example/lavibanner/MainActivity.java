package com.example.lavibanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lavibanner.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView Email;
    private TextView Password;
    private Button Button1;
    private Button Button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        Button1 = findViewById(R.id.button1);
        Button2 = findViewById(R.id.button2);

        Button1.setOnClickListener(this);
        Button2.setOnClickListener(this);



    }
    package com.example.sample;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.widget.EditText;
    public class MainAct extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    }

    @Override
    public void onClick(View view) {
        if (view == Button2 && Email.getText().toString().contains("@") && Email.getText().toString().contains(".com")) {
            Password.setText(Email.getText().toString());

        }
       if (view == Button1) {
           Toast.makeText(getApplicationContext(),"SignUp is Under Construction",Toast.LENGTH_SHORT).show();


        }

    }
}
