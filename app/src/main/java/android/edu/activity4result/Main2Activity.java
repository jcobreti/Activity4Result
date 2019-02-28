package android.edu.activity4result;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = new Intent ();
        i.putExtra("NOMBRE", "Pepa Pig");
        this.setResult(137,  i);
        this.finish();
    }
}
