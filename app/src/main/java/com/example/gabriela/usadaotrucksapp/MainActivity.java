package com.example.gabriela.usadaotrucksapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.gabriela.usadaotrucksapp.R.id.action_contato;
import static com.example.gabriela.usadaotrucksapp.R.id.action_login;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // public void buttontela2  (View v){//

        Intent intent = new Intent(getApplicationContext(), ProdutoActivity.class);
        String message = "Mensagem";
        intent.putExtra("iesa.ads.primeiraaplicacao.MESSAGE", message);
        startActivity(intent);
    }


//abaixo metodos do menu-mostra o menu atraves do recurso R.menu menu_main

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meu_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      //  int id = item.getItemId();
        if (item.getItemId() == R.id.produto) {
            Intent intent = new Intent(getApplicationContext(), ProdutoActivity.class);
            String message = "MESSAGE";
            intent.putExtra("iesa.ads.primeiraaplicacao.MESSAGE", message);
            startActivity(intent);

            Toast.makeText(getApplicationContext(), "Opção Item 1", Toast.LENGTH_LONG).show();


        } else if (item.getItemId() == R.id.action_cad_produto) {
            Toast.makeText(getApplicationContext(), "Opção Item 2", Toast.LENGTH_LONG).show();

        } else if (item.getItemId() == R.id.action_login) {
            Toast.makeText(getApplicationContext(), "Opção Item 3", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.action_contato) {
            Toast.makeText(getApplicationContext(), "Opção Item 4", Toast.LENGTH_LONG).show();
        }



           return true;

       }
    }

              //  return super.onOptionsItemSelected(item);

           // }


                //   public void buttontela3 (MenuItem item){

//        }


