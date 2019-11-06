package facci.alexarcentales.semanaactual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class RecibirActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir);

        tv1 = (TextView) findViewById(R.id.tv1);

        Bundle bundle = this.getIntent().getExtras();
        int num = Integer.parseInt(bundle.getString("dato"));
        Calendar calendario = Calendar.getInstance();
        int  numSemana = calendario.get(Calendar.WEEK_OF_YEAR);

        if (numSemana==num){
            tv1.setText("HAS ACERTADO");
        }
        else{
            tv1.setText("INTENTA NUEVAMENTE");
        }
    }
}