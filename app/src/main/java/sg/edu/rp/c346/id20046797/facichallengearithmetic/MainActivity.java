package sg.edu.rp.c346.id20046797.facichallengearithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnCalculate;
    EditText etNumber1, etNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.editTextNumber1);
        etNumber2 = findViewById(R.id.editTextNumber2);
        btnCalculate = findViewById(R.id.buttonCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Arithmetic.class);
                intent.putExtra("number1", Double.parseDouble(etNumber1.getText().toString()));
                intent.putExtra("number2" , Double.parseDouble(etNumber2.getText().toString()));
                startActivity(intent);
            }
        });

    }
}