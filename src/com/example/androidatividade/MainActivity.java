package com.example.androidatividade;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button; 
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 
        
        //Chamando os objetos
        
        ImageView imagem = (ImageView) findViewById(R.id.Logo);
        final EditText login = (EditText) findViewById(R.id.Email);
        final EditText senha = (EditText) findViewById(R.id.Senha);
        Button entrar = (Button) findViewById(R.id.Enviar);
        Button limpar = (Button) findViewById(R.id.Limpar);
        
        entrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Toast.makeText(MainActivity.this, login.getText().toString(), Toast.LENGTH_SHORT).show();
				
			}
		});
        
        limpar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				login.setText("");
				senha.setText("");
				
			}
		});
        
        Log.d("Login", "OnCreate");
    }
    
    @Override
    public void onStart(){
    	super.onStart();
    	Log.d("Login", "OnStart");
    }
    
    @Override
    public void onPause(){ 
        super.onPause(); 
        Log.d("Login", "OnPause"); 
    } 

   @Override
   public void onDestroy(){ 
        super.onDestroy(); 
        Log.d("Login", "OnDestroy"); 
   } 
}
