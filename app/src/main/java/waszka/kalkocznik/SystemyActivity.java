package waszka.kalkocznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SystemyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systemy);
    }


    public void BackSys(View view)
    {
        Intent myIntent = new Intent(SystemyActivity.this, MenuActivity.class);
        startActivity(myIntent);
    }

    public void GoBin(View view)
    {
        Intent myIntent = new Intent(SystemyActivity.this, BinActivity.class);
        startActivity(myIntent);
    }

    public void GoDec(View view)
    {
        Intent myIntent = new Intent(SystemyActivity.this, DecActivity.class);
        startActivity(myIntent);
    }

    public void GoOct(View view)
    {
        Intent myIntent = new Intent(SystemyActivity.this, OctActivity.class);
        startActivity(myIntent);
    }

    public void GoHex(View view)
    {
        Intent myIntent = new Intent(SystemyActivity.this, HexActivity.class);
        startActivity(myIntent);
    }
}
