package jaqueline.angel.historinha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    Button btn1;
    String editTextVal1;
    String editTextVal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.butt1);
        editText1 = (EditText) findViewById(R.id.edit1);
        editText2 = (EditText) findViewById(R.id.edit2);
    }

    public void btnClick1(View v){

        Intent i = new Intent(this, MainActivity2.class);
        editTextVal1 = editText1.getText().toString();
        i.putExtra("Value", editTextVal1);
        editTextVal2 = editText2.getText().toString();

        i.putExtra("Value", editTextVal2);
        startActivity(i);
        finish();
    }
}
