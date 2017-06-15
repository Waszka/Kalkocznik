package waszka.kalkocznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bmul,bsub,bclear,bresult,bdiv,bdot;
    TextView result;
    double var1,var2;
    boolean add,mul,sub,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b0 = (Button) findViewById(R.id.button0);
        badd = (Button) findViewById(R.id.buttonadd);
        bsub = (Button) findViewById(R.id.buttonsub);
        bmul = (Button) findViewById(R.id.buttonmul);
        bdiv = (Button) findViewById(R.id.buttondiv);
        bresult = (Button) findViewById(R.id.buttonresult);
        bdot = (Button) findViewById(R.id.buttondot);
        bclear = (Button) findViewById(R.id.buttonclear);
        result = (TextView) findViewById(R.id.tvresult);

    }

    public void GoBackCal(View view)
    {
        Intent myIntent = new Intent(CalculatorActivity.this, MenuActivity.class);
        startActivity(myIntent);
    }











}
