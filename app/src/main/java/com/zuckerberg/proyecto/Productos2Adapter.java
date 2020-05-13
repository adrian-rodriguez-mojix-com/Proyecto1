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


public class Productos2Adapter extends ArrayAdapter<Productos2> {

    private ArrayList<Productos2> productos;

    public Productos2Adapter(Context context, ArrayList<Productos2> objects) {
        super(context, 0, objects);
        productos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item_productos2, null);

        ImageView ivProducto1 = view.findViewById(R.id.ivProductos2);
        TextView tvProducto1 = view.findViewById(R.id.tvProducto2);
        TextView tv1Producto1 = view.findViewById(R.id.tvPrecio2);

        ivProducto1.setImageResource(productos.get(position).getImagen());
        tvProducto1.setText(productos.get(position).getNombre());
        tv1Producto1.setText(String.valueOf(productos.get(position).getPrecio()));


        return view;
    }


}