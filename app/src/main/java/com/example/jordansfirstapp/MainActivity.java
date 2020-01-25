package com.example.jordansfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //region [Properties]

    public Integer EthansInt;

    public static Context ThisActivity;

    //endregion

    //region [Private Methods]

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ThisActivity = this;

        //Integer ethansVariable = TestOne(5,8);

        //TestTwo(ethansVariable);
        JordansFirstClass noParams = new JordansFirstClass();
        JordansFirstClass oneParams = new JordansFirstClass(5);
        JordansFirstClass twoParams = new JordansFirstClass(5,10);
        JordansFirstClass threeParams = new JordansFirstClass(5,10,15);

        noParams.SendToast();
        oneParams.SendToast();
        twoParams.SendToast();
        threeParams.SendToast();
    }

    private Integer TestOne(Integer firstNumber, Integer secondNumber) {
        //Integer ethansAnswer = firstNumber + secondNumber;

        Integer ethansAnswer = firstNumber * secondNumber;

        return ethansAnswer;
    }

    private void TestTwo(Integer ethansVariable) {
        String message = "The answer is : " + ethansVariable + ". LOOK MORE TEXT";

        Toast.makeText(ThisActivity, message, Toast.LENGTH_SHORT).show();
    }

    //endregion

}
