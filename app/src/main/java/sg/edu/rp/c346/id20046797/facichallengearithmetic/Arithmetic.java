package sg.edu.rp.c346.id20046797.facichallengearithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Arithmetic extends AppCompatActivity {

    EditText etSum, etProduct, etDivision, etSubtraction;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);

        etSum = findViewById(R.id.etSum);
        etProduct = findViewById(R.id.etProduct);
        etDivision = findViewById(R.id.etDivision);
        etSubtraction = findViewById(R.id.etSubtraction);
        tv = findViewById(R.id.textView3);

        Intent intent = getIntent();

        double number1 = intent.getDoubleExtra("number1" , 1.11);
        double number2 = intent.getDoubleExtra("number2", 1.11);


        double Sum = (number1 + number2);
        double Product = number1 * number2;
        double Division = number1 / number2;
        double Subtraction = number1 - number2;

        etSum.setText(String.valueOf(Sum));
        etProduct.setText(String.valueOf(Product));
        etDivision.setText(String.valueOf(Division));
        etSubtraction.setText(String.valueOf(Subtraction));
    }
}