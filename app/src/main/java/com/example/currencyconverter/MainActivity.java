package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
EditText amount;
TextView P;
    DecimalFormat df = new DecimalFormat("#.###");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount =(EditText) findViewById(R.id.amount);
        P=(TextView) findViewById(R.id.textView3);
    }
    public void convertToD(View V){
        double output =Double.parseDouble(amount.getText().toString())/22000;

        P.setText(df.format(output) + "$");
        // String z= output + "$"
        // Toast.makeText(getApplicationContext(), output, Toast.LENGTH_SHORT).show();


    }
    public void convertToLL(View V){
        double output =Double.parseDouble(amount.getText().toString())*22000;

        P.setText(df.format(output) + "LL");

        // String z= output + "LL";
        //Toast.makeText(getApplicationContext(), z, Toast.LENGTH_SHORT).show();      (In case of toast)
    }
}
