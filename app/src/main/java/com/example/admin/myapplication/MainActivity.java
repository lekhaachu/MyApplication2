package com.example.admin.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd,subBtn,mulBtn,divBtn;
    int result,num1,num2;
    float x1,x2,q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = (EditText) findViewById(R.id.editText);
        secondNumber = (EditText) findViewById(R.id.editText2);
        addResult = (TextView) findViewById(R.id.textView3);
        btnAdd = (Button) findViewById(R.id.button);
        subBtn=(Button)findViewById(R.id.subtract);
        mulBtn=(Button)findViewById(R.id.multi);
        divBtn=(Button)findViewById(R.id.divide);
    }
    /*public  void clickeditText(View view){
        addResult.setText("0");
    }*/
    public void btnadd(View v) {
        String n1= firstNumber.getText().toString();
        String n2= secondNumber.getText().toString();
        num1= Integer.parseInt(n1);
        num2= Integer.parseInt(n2);
        result=num1+num2;
        addResult.setText(Integer.toString(result));
    }
    public void btnSub(View view){
        String n1= firstNumber.getText().toString();
        String n2= secondNumber.getText().toString();
        num1= Integer.parseInt(n1);
        num2= Integer.parseInt(n2);
        result=num1-num2;
        addResult.setText(Integer.toString(result));
    }
    public void btnMul(View view){
        String n1= firstNumber.getText().toString();
        String n2= secondNumber.getText().toString();
        num1= Integer.parseInt(n1);
        num2= Integer.parseInt(n2);
        result=num1*num2;
        addResult.setText(Integer.toString(result));
    }
    public void btnDiv(View view){
        String n1= firstNumber.getText().toString();
        String n2= secondNumber.getText().toString();
        x1= Float.parseFloat(n1);
        x2= Float.parseFloat(n2);
        q=x1/x2;
        addResult.setText(""+q);
    }
}