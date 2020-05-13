package com.zuckerberg.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class Productos1Adapter extends ArrayAdapter<Productos1> {

    private ArrayList<Productos1> productos;

    public Productos1Adapter(Context context, ArrayList<Productos1> objects) {
        super(context, 0, objects);
        productos = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item_productos1, null);
        ImageView ivProducto1 = view.findViewById(R.id.ivProducto1);
        TextView tvProducto1 = view.findViewById(R.id.tvProducto1);

        ivProducto1.setImageResource(productos.get(position).getImagen());
        tvProducto1.setText(productos.get(position).getNombre());

        return view;
    }

}
