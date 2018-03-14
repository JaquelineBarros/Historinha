package jaqueline.angel.historinha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by angel on 13/03/2018.
 */

public class MainActivity2 extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    Button btn2;
    String valFromAct1;
    String valFromAct2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn2 = (Button) findViewById(R.id.butt2);
        textView1 = (TextView) findViewById(R.id.text1);
        textView2 = (TextView) findViewById(R.id.text2);
        valFromAct1 = getIntent().getExtras().getString("Value");
        textView1.setText(valFromAct1);
        valFromAct2 = getIntent().getExtras().getString("Value");
        textView2.setText(valFromAct2);
    }
    public void btnClick2(View v){

        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);
        finish();
    }
}
