package android.unitec.autolote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton cam,tur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cam=(ImageButton) findViewById(R.id.imgPickUp);

    }
    public void camion(View view){
        Intent intent = new Intent(this,CamionetaActivity.class);
        startActivity(intent);
    }
    public void turismo(View view){
        Intent inte = new Intent(this,turismoActivity.class);
        startActivity(inte);

    }

}
