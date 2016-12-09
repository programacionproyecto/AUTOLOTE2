package android.unitec.autolote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CamionetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camioneta);
    }

    public void hilux(View view) {
        datos("Hilux",2014,"Gris");
    }
    public void front(View view){
        datos("Frontier",2013,"Blanco");
    }
    public void datos(String modelo,int año,String Color){
        Intent inte=new Intent("Datos");
        inte.putExtra("Modelo",modelo);
        inte.putExtra("Año",año);
        inte.putExtra("Color",Color);
        inte.putExtra("Tipo","Camioneta");
        startActivity(inte);
    }
}
