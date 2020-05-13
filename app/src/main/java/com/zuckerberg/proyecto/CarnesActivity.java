package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CarnesActivity extends AppCompatActivity {

    ListView lvProductos2;

    ArrayList<Productos1> listProductos2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnes);

        lvProductos2 = findViewById(R.id.lvProductosCarnes);

        listProductos2.add(new Productos1("Bife Chorizo", R.drawable.carnes_bife, 50));
        listProductos2.add(new Productos1("Chorizo", R.drawable.carnes_chorizo, 25));
        listProductos2.add(new Productos1("Chuleta", R.drawable.carnes_chuleta, 30));
        listProductos2.add(new Productos1("Maple de huevos", R.drawable.carnes_huevo, 15));
        listProductos2.add(new Productos1("Carne Molida", R.drawable.carnes_molida, 33));
        listProductos2.add(new Productos1("Mortadela", R.drawable.carnes_molida, 34));
        listProductos2.add(new Productos1("Pollo", R.drawable.carnes_pollo, 38));
        listProductos2.add(new Productos1("Punta de S", R.drawable.carnes_punta, 55));
        listProductos2.add(new Productos1("Sabalo", R.drawable.carnes_sabalo, 60));
        listProductos2.add(new Productos1("Trucha", R.drawable.carnes_trucha, 60));

    }
}
