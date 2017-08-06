package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView answer,input;
    Button one,two,three,four,five,six,seven,eight,nine,multiply,divide,plus,minus,openBracket,closeBracket,zero,dot,equal,delete;
    String operation = "";

    private void updateInput(){
        input.setText(operation);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = (TextView) findViewById(R.id.answer);
        input = (TextView) findViewById(R.id.input);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button) findViewById(R.id.equal);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        openBracket = (Button) findViewById(R.id.openBracket);
        closeBracket =  (Button) findViewById(R.id.closeBracket);
        delete = (Button) findViewById(R.id.delete);
    }

    public void oneClicked(View view){
        operation += "1";
        updateInput();
    }

    public void twoClicked(View view){
        operation += "2";
        updateInput();
    }

    public void threeClicked(View view){
        operation += "3";
        updateInput();
    }

    public void fourClicked(View view){
        operation += "4";
        updateInput();
    }

    public void fiveClicked(View view){
        operation += "5";
        updateInput();
    }

    public void sixClicked(View view){
        operation += "6";
        updateInput();
    }

    public void sevenClicked(View view){
        operation += "7";
        updateInput();
    }

    public void eightClicked(View view){
        operation += "8";
        updateInput();
    }

    public void nineClicked(View view){
        operation += "9";
        updateInput();
    }

    public void zeroClicked(View view){
        operation += "0";
        updateInput();
    }

    public void addOpenBracket(View view){
        operation += "(";
        updateInput();
    }

    public void addCloseBracket(View view){
        operation += ")";
        updateInput();
    }

    public void dotClicked(View view){
        operation += ".";
        updateInput();
    }

    public void findProduct(View view){
        operation += "*";
        updateInput();
    }

    public void findQuotient(View view){
        operation += "/";
        updateInput();
    }

    public void findSum(View view){
        operation += "+";
        updateInput();
    }

    public void findDifference(View view){
        operation += "-";
        updateInput();
    }

    public void deleteLast(View view){
        operation = operation.substring(0,operation.length()-1);
        updateInput();
    }
}
