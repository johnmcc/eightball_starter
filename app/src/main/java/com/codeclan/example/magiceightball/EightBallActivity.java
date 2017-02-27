package com.codeclan.example.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EightBallActivity extends AppCompatActivity {

    EditText questionEditText;
    Button shakeButton;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_ball2);

        questionEditText = (EditText) findViewById(R.id.question_edittext);
        shakeButton = (Button) findViewById(R.id.shake_btn);
        answerText = (TextView) findViewById(R.id.answer_text);
    }

    public void onShakeButtonClicked(View button){

    }
}
