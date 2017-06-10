package waszka.kalkocznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void GoSys(View view)
    {
        Intent myIntent = new Intent(MenuActivity.this, SystemyActivity.class);
        startActivity(myIntent);
    }

    public void GoCal(View view)
    {
        Intent myIntent = new Intent(MenuActivity.this, CalculatorActivity.class);
        startActivity(myIntent);
    }

    public void GoFig(View view)
    {
        Intent myIntent = new Intent(MenuActivity.this, FiguresActivity.class);
        startActivity(myIntent);
    }

    public void GoExit(View view)
    {
        finish();
        System.exit(0);
    }








}
