package waszka.kalkocznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bmul,bsub,bclear,bresult,bdiv,bdot;
    TextView result;
    double var1,var2,var3;
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

    public void b1(View view)
    {
        result.setText(result.getText()+"1");
    }

    public void b2(View view)
    {
        result.setText(result.getText()+"2");
    }

    public void b3(View view)
    {
        result.setText(result.getText()+"3");
    }

    public void b4(View view)
    {
        result.setText(result.getText()+"4");
    }

    public void b5(View view)
    {
        result.setText(result.getText()+"5");
    }

    public void b6(View view)
    {
        result.setText(result.getText()+"6");
    }

    public void b7(View view)
    {
        result.setText(result.getText()+"7");
    }

    public void b8(View view)
    {
        result.setText(result.getText()+"8");
    }

    public void b9(View view)
    {
        result.setText(result.getText()+"9");
    }

    public void b0(View view)
    {
        result.setText(result.getText()+"0");
    }

    public void bdat(View view)
    {
        result.setText(result.getText()+".");
    }

    public void badd(View view) //dodawanie
    {
        var1=Double.parseDouble(result.getText()+"");
        add = true;
        result.setText(null);
    }

    public void bdiv(View view) //dzielenie
    {
        var1=Double.parseDouble(result.getText()+"");
        div = true;
        result.setText(null);
    }

    public void bsub(View view) //odejmowanie
    {
        var1=Double.parseDouble(result.getText()+"");
        sub = true;
        result.setText(null);
    }

    public void bmul(View view) //mnozenie
    {
        var1=Double.parseDouble(result.getText()+"");
        mul = true;
        result.setText(null);
    }

    public void bclear(View view) //czyszczenie
    {
        result.setText("");
        add = false;
        sub = false;
        mul = false;
        div = false;
    }

    public void bresult(View view) //wynik
    {
        var2=Double.parseDouble(result.getText()+"");
        var3 = 0;
        if(add == true) //dodawanie
        {
            result.setText(var1+var2+"");
            add = false;
        }
        if(sub == true) //odejmowanie
        {
            result.setText(var1-var2+"");
            sub = false;
        }
        if(mul == true) //mnozenie
        {
            result.setText(var1*var2+"");
            mul = false;
        }
        if(div == true) //dzielenie
        {
            if(var2 == var3)
            {
                Toast.makeText(getApplicationContext(),"Cannot divide by zero",Toast.LENGTH_LONG).show();
                result.setText("");
                div = false;
            }else
            {
                result.setText(var1 / var2 + "");
                div = false;
            }
        }
    }









}
