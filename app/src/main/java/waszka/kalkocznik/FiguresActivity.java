package waszka.kalkocznik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FiguresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figures);
    }

    public void Go2d(View view)
    {
        Intent myIntent = new Intent(FiguresActivity.this, TwoDActivity.class);
        startActivity(myIntent);
    }

    public void Go3d(View view)
    {
        Intent myIntent = new Intent(FiguresActivity.this, ThreeDActivity.class);
        startActivity(myIntent);
    }

    public void GoBack(View view)
    {
        Intent myIntent = new Intent(FiguresActivity.this, MenuActivity.class);
        startActivity(myIntent);
    }


}
