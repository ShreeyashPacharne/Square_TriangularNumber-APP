package com.example.shapenumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        class Number{

            int num;

            public boolean isTriangular() {

                int sum = 0;
                int count = 1;
                while(sum < num){
                    sum+=count;
                    count++;
                }
                if(sum==num){
                    return true;
                }else{
                    return false;
                }
            }

            public boolean isSquare() {

                double sqrt = Math.sqrt(num);

                if(sqrt == Math.floor(sqrt)){
                    return true;
                }else{
                    return false;
                }

            }
        }

        public void guessShape(View v){
            EditText numb = (EditText) findViewById(R.id.enterednumber);    //Taking input
            int guess = Integer.parseInt(numb.getText().toString()); //converting EditText to Int
            String message;
            Number n = new Number();
            n.num = guess;
            if(n.isTriangular() && n.isSquare()){
                message = "Both Triangular and Square";
            }
            else if(n.isTriangular()){
                message = "Triangular number";
            }
            else if(n.isSquare()){
                message = "Square number";
            }
            else{
                message = "none";
            }

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}