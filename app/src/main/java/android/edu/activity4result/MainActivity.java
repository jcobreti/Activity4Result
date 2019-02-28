package android.edu.activity4result;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private final int REQUEST_CODE=137;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this,Main2Activity.class);

        startActivityForResult(i, REQUEST_CODE); //137 es un número para etiquetar la petición
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String cadena_nombre_resultado = data.getStringExtra("NOMBRE");

        Toast.makeText(this, "Código  = " + resultCode,Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Nombre resultado devuelto = " + cadena_nombre_resultado,Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "peticion = " +requestCode,Toast.LENGTH_SHORT).show();
    }
}
