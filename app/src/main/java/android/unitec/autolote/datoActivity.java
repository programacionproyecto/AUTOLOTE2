package android.unitec.autolote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class datoActivity extends AppCompatActivity {
    TextView tvModelo,tvTipo,tvColor,tvAño;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dato);
        Intent inte =getIntent();
        String marca=inte.getStringExtra("Marca");
        String modelo=inte.getStringExtra("Modelo");
        String color=inte.getStringExtra("Color");
        int año=inte.getIntExtra("Año",0);
        String tipo=inte.getStringExtra("Tipo");
        tvModelo=(TextView)findViewById(R.id.tvModelo);
        tvTipo=(TextView)findViewById(R.id.tvTipo);
        tvAño=(TextView)findViewById(R.id.tvAño);
        tvColor=(TextView)findViewById(R.id.tvColor);
        tvModelo.setText(modelo);
        tvColor.setText(color);
        tvTipo.setText(tipo);
        tvAño.setText(""+año);
    }
}
