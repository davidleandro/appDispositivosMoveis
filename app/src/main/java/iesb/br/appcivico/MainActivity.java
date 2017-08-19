package iesb.br.appcivico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, signupActivity.class));
            }
        });

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inputEmail = (EditText) findViewById(R.id.inputEmail);
                EditText inputPassword = (EditText) findViewById(R.id.inputPassword);

                if(inputEmail.getText().toString().equals("david@teste.com.br") && inputPassword.getText().toString().equals("12345678")) {
                    startActivity(new Intent(MainActivity.this, MapActivity.class));
                } else {
                    Log.d("myTag1", inputPassword.getText().toString());
                    Log.d("myTag2", inputEmail.getText().toString());

                    Toast.makeText(MainActivity.this, "Ops", Toast.LENGTH_LONG).show();
                }

            }
        });




    }

}
