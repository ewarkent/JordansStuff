package com.example.jordansfirstapp;

import android.widget.Toast;

public class JordansFirstClass {

    //Constructors
    JordansFirstClass (){
        numberOne = -1;
        numberTwo = 0;
        numberThree = 0;
    }

    JordansFirstClass (Integer x1){
        numberOne = x1;
        numberTwo = 0;
        numberThree = 0;
    }

    JordansFirstClass (Integer x1, Integer x2){
        numberOne = x1;
        numberTwo = x2;
        numberThree = 0;
    }

    JordansFirstClass (Integer x1, Integer x2, Integer x3){
        numberOne = x1;
        numberTwo = x2;
        numberThree = x3;
    }

    //Properties
    private Integer numberOne;
    private Integer numberTwo;
    private Integer numberThree;

    //Methods
    public void SendToast(){
        Integer answer = numberOne + numberTwo + numberThree;

        Toast.makeText(MainActivity.ThisActivity, "My answer is : " + answer, Toast.LENGTH_LONG).show();
    }
}
