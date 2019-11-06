package facci.alexarcentales.semanaactual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.texto1);
        boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RecibirActivity.class);
                Bundle b = new Bundle();
                b.putString("dato",et1.getText().toString());
                i.putExtras(b);
                startActivity(i);
            }
        });

    }/*
    public void resultado(View pp){
        Intent futbol = new Intent(this, RecibirActivity.class);
        startActivity(futbol);
    }*/
}
