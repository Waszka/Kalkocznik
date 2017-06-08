package waszka.kalkocznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DecActivity extends AppCompatActivity {

    EditText et_number;
    Button button_Convert;
    TextView t_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dec);
        et_number = (EditText) findViewById(R.id.et_number);
        button_Convert = (Button) findViewById(R.id.button_Convert);
        t_score = (TextView) findViewById(R.id.t_score);

    }

    public void Convert(View view)
    {
        int dec = Integer.parseInt(et_number.getText().toString());
        String bin = Integer.toBinaryString(dec);
        String oct = Integer.toOctalString(dec);
        String hex = Integer.toHexString(dec);

        t_score.setText("DEC: " + dec + "\n\n" +
                "BIN: " + bin + "\n\n" +
                "OCT: " + oct + "\n\n" +
                "HEX: " + hex);

    }

    public void BackSys(View view)
    {
        Intent myIntent = new Intent(DecActivity.this, SystemyActivity.class);
        startActivity(myIntent);
    }
}
