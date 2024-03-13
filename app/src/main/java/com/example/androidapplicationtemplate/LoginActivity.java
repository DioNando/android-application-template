package com.example.androidapplicationtemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnAlert = findViewById(R.id.btnNavigateToRegister);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Créer une alerte
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                builder.setTitle("Alerte");
                builder.setMessage("Ceci est une alerte !");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Action à effectuer lors du clic sur le bouton "OK"
                        dialog.dismiss(); // Fermer l'alerte
                    }
                });
                // Afficher l'alerte
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        Button btnNavigateToHome = findViewById(R.id.btnNavigateToHome);
        btnNavigateToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Créer une intention pour naviguer vers l'écran de connexion (ActivityLogin)
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                // Démarrer l'activité de connexion
                startActivity(intent);
            }
        });
    }
}
