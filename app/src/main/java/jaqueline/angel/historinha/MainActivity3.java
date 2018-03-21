package jaqueline.angel.historinha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView3;
    TextView textView4;
    Button btn2;
    String valFromAct3;
    String valFromAct4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn2 = (Button) findViewById(R.id.butt2);
        textView3 = (TextView) findViewById(R.id.text3);
        textView4 = (TextView) findViewById(R.id.text4);
        valFromAct3 = getIntent().getExtras().getString("Value");
        textView3.setText(valFromAct3);
        valFromAct4 = getIntent().getExtras().getString("Value");
        textView4.setText(valFromAct4);
    }
    public void btnClick3(View v){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
