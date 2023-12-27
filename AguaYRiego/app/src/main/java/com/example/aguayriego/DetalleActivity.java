package com.example.aguayriego;

import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        // Obtener referencias a los elementos de la vista en la actividad Detalle
        TextView tituloTextView = findViewById(R.id.textViewTituloDetalle);
        TextView descripcionTextView = findViewById(R.id.textViewDescripcionDetalle);

        // Obtener la información pasada desde la actividad principal
        String titulo = getIntent().getStringExtra("titulo");
        String descripcion = getIntent().getStringExtra("descripcion");

        // Establecer el texto en los elementos de la vista
        tituloTextView.setText(titulo);
        descripcionTextView.setText(descripcion);
    }
}
