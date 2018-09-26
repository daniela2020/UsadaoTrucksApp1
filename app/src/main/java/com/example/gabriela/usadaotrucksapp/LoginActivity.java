package com.example.gabriela.usadaotrucksapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if ("admin".equals(login) && "123".equals(senha)) {
                    alert("Bem vindo, login realizado com sucesso."); //Permite mostrar uma caixa de alerta na aplicação

                } else {
                    alert("Login e senha incorretos");
                }

            }
        });
    }
    private void alert(String s){
        Toast.makeText(this ,s, Toast.LENGTH_SHORT).show();
    }
}


