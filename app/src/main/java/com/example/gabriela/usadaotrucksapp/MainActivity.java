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
import static com.example.gabriela.usadaotrucksapp.R.id.bt_tela2;

public class MainActivity extends AppCompatActivity {

//o metodo abaixo é responsavel por configurar o layout xml
    //para criação de interface.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //acima set mostra a interface p o usuario


     /*   Button bt = (Button) findViewById(R.id.bt_menu);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(MainActivity.this,ProdutoActivity.class);
                startActivity(ir);
            }
        });*/

        // public void buttontela2  (View v){//

//        Intent intent = new Intent(getApplicationContext(), ContatoActivity.class);
//        String message = "Mensagem";
//        intent.putExtra("gabriela.usadaotrucksapp.MESSAGE", message);
//        startActivity(intent);
    }


//abaixo metodos do menu-mostra o menu atraves do recurso R.menu menu_main

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meu_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int id = item.getItemId();
        if (item.getItemId() == R.id.produto) {
            Intent intent = new Intent(getApplicationContext(), ProdutoActivity.class);
            String message = "MESSAGE";
            intent.putExtra("gabriela.usadaotrucksapp.MESSAGE", message);
            startActivity(intent);

            Toast.makeText(getApplicationContext(), "Opção produtos", Toast.LENGTH_LONG).show();


        } else if (item.getItemId() == R.id.action_cad_produto) {
            Intent intent = new Intent(getApplicationContext(), CadProdutoActivity.class);
            String message = "MESSAGE";
            intent.putExtra("gabriela.usadaotrucksapp.MESSAGE", message);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Opção Item 2", Toast.LENGTH_LONG).show();


        } else if (item.getItemId() == R.id.action_login) {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            String message = "MESSAGE";
            intent.putExtra("gabriela.usadaotrucksapp.MESSAGE", message);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Opção Item 3", Toast.LENGTH_LONG).show();

        } else if (item.getItemId() == R.id.action_contato) {
            Intent intent = new Intent(getApplicationContext(), ContatoActivity.class);
            String message = "MESSAGE";
            intent.putExtra("gabriela.usadaotrucksapp.MESSAGE", message);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Opção Item 4", Toast.LENGTH_LONG).show();
        }



           return true;

       }
    }

              //  return super.onOptionsItemSelected(item);

           // }


                //   public void buttontela3 (MenuItem item){

//        }


