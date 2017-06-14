package waszka.kalkocznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OctActivity extends AppCompatActivity {

    EditText et_number;
    Button button_Convert;
    TextView t_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oct);
        et_number = (EditText) findViewById(R.id.et_number);
        button_Convert = (Button) findViewById(R.id.button_Convert);
        t_score = (TextView) findViewById(R.id.t_score);

    }

    public void Convert(View view)
    {
        if(et_number.getText().toString().matches("-?[0-7]+")) {
            int dec = Integer.parseInt(String.valueOf(et_number.getText()), 8);
            int oct = Integer.parseInt(et_number.getText().toString());
            String bin = Integer.toBinaryString(dec);
            String hex = Integer.toHexString(dec);

            t_score.setText("DEC: " + dec + "\n\n" +
                    "BIN: " + bin + "\n\n" +
                    "OCT: " + oct + "\n\n" +
                    "HEX: " + hex);
        }else{
            Toast.makeText(getApplicationContext(),"Symbol range 0-7",Toast.LENGTH_LONG).show();
        }
    }

    public void BackSys(View view)
    {
        Intent myIntent = new Intent(OctActivity.this, SystemyActivity.class);
        startActivity(myIntent);
    }
}
