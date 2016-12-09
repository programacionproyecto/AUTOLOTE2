package android.unitec.autolote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class turismoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo);
    }
    public void corola(View view) {
        datos("corola",2014,"Blanco");
    }
    public void mini(View view){
        datos("Cooper S",2012,"Rojo");
    }
    public void datos(String modelo,int año,String Color){
        Intent inte=new Intent("Datos");
        inte.putExtra("Modelo",modelo);
        inte.putExtra("Año",año);
        inte.putExtra("Color",Color);
        inte.putExtra("Tipo","Turismo");
        startActivity(inte);
    }
}
