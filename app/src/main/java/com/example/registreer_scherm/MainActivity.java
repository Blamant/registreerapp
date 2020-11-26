package com.example.registreer_scherm;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configurebuttonHome();
    }

    private void configurebuttonHome() {
        final Button buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(MainActivity.this, login_registreer_scherm.class));
            }
        });
    }

    public void onRegisterButtonClick (View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText editTxtFirstName = findViewById(R.id.editTxtFirstName);
        EditText editTxtLastName = findViewById(R.id.editTxtSurName);
        EditText editTxtEmail = findViewById(R.id.editTxtEmail);

        txtFirstName.setText("Voornaam: " + editTxtFirstName.getText().toString());
        txtLastName.setText("Achternaam: " + editTxtLastName.getText().toString());
        txtEmail.setText("Email: " + editTxtEmail.getText().toString());
    }
}