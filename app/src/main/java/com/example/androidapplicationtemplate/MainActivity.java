package com.example.androidapplicationtemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNavigateToLogin = findViewById(R.id.btnNavigateToLogin);
        btnNavigateToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Créer une intention pour naviguer vers l'écran de connexion (ActivityLogin)
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                // Démarrer l'activité de connexion
                startActivity(intent);
            }
        });

        Button btnNavigateToHome = findViewById(R.id.btnNavigateToHome);
        btnNavigateToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Créer une intention pour naviguer vers l'écran de connexion (ActivityLogin)
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                // Démarrer l'activité de connexion
                startActivity(intent);
            }
        });
    }
}