package com.example.aguayriego;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    private String[] descripciones;
    private Context context;

    public CustomAdapter(Context context, int resource, String[] items, String[] descripciones) {
        super(context, resource, items);
        this.context = context;
        this.descripciones = descripciones;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.list_item, null);
        }

        // Obtener referencias a los elementos de la vista
        TextView tituloTextView = view.findViewById(R.id.textViewTitulo);
        TextView descripcionTextView = view.findViewById(R.id.textViewDescripcion);

        // Obtener el elemento de la lista en la posición actual
        final String item = getItem(position);

        // Establecer el texto en los elementos de la vista
        if (item != null) {
            tituloTextView.setText(item);
            descripcionTextView.setText(descripciones[position]);

            // Configurar el clic en el elemento para abrir la actividad Detalle
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Crear un Intent para abrir la actividad Detalle
                    Intent intent = new Intent(context, DetalleActivity.class);
                    // Pasar información adicional a la actividad Detalle
                    intent.putExtra("titulo", item);
                    intent.putExtra("descripcion", descripciones[position]);
                    // Iniciar la actividad Detalle
                    context.startActivity(intent);
                }
            });
        }

        return view;
    }
}

