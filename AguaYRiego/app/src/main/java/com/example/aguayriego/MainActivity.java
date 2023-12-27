package com.example.aguayriego;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        // Ejemplo de datos para la lista
        String[] nivelesAgua = {"Nivel - Bajo hace 15 min", "Nivel - Medio hace 30 min", "Nivel - Alto hace 1 hora"};
        String[] descripciones = {"Breve descripción del nivel bajo", "Breve descripción del nivel medio", "Breve descripción del nivel alto"};

        // Crear un adaptador personalizado y establecerlo en la ListView
        CustomAdapter adapter = new CustomAdapter(this, R.layout.list_item, nivelesAgua, descripciones);
        listView.setAdapter(adapter);
    }
}
