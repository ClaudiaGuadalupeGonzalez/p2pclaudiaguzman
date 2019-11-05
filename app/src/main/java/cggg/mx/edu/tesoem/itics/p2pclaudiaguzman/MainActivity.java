package cggg.mx.edu.tesoem.itics.p2pclaudiaguzman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    RadioButton rmasculino, rfemenido;
    RadioButton suma, resta, multiplicacion, division;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rmasculino = (RadioButton) findViewById(R.id.rmasculino);
        rfemenido = (RadioButton) findViewById(R.id.rfemenino);
        suma = (RadioButton) findViewById(R.id.suma);
        resta = (RadioButton) findViewById(R.id.resta);
        multiplicacion = (RadioButton) findViewById(R.id.multiplicacion);
        division = (RadioButton) findViewById(R.id.division);
        result = (TextView) findViewById(R.id.result);


    }

    public void invocarmensaje(View view) {
        if (rmasculino.isChecked()) {
            Toast.makeText(this, "Selecciono Masculino", Toast.LENGTH_LONG).show();

        }
        if (rfemenido.isChecked()) {
            Toast.makeText(this, "Selecciono Femenino", Toast.LENGTH_LONG).show();
        }
    }
    public void op(View view) {
        if (suma.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1+valor2;
            result.setText(" " + res);

        }
        if (resta.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1-valor2;
            result.setText(" " + res);

        } if (multiplicacion.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1*valor2;
            result.setText(" " + res);

        } if (division.isChecked()) {
            EditText n1 = (EditText) findViewById(R.id.txtnum1);
            EditText n2 = (EditText) findViewById(R.id.txtnum2);
            double valor1 = Double.parseDouble(n1.getText().toString());
            double valor2 = Double.parseDouble(n2.getText().toString());

            double res = valor1/valor2;
            result.setText(" " + res);

        }
    }

}
