package com.example.trainticket;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // поля
    private EditText nameId;
    private EditText depPoint;
    private EditText arrPoint;
    private EditText depTime;
    private EditText arrTime;
    private TextView ticketPrice;
    private Button button;

    private String nameIdSt;
    private String depPointSt;
    private String arrPointSt;
    private String depTimeSt;
    private String arrTimeSt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка к id
        nameId = findViewById(R.id.nameId);
        depPoint = findViewById(R.id.depPoint);
        arrPoint = findViewById(R.id.arrPoint);
        depTime = findViewById(R.id.depTime);
        arrTime = findViewById(R.id.arrTime);
        ticketPrice = findViewById(R.id.ticketPrice);
        button = findViewById(R.id.button);

        // вывод стоимости билета
        ticketPrice.setText("10 монет");

    }

    // обработка нажатия кнопки
    public void onClickTicket(View view){

        // считывание данных с экрана
        nameIdSt = nameId.getText().toString();
        depPointSt = depPoint.getText().toString();
        arrPointSt = arrPoint.getText().toString();
        depTimeSt = depTime.getText().toString();
        arrTimeSt = arrTime.getText().toString();

        // создание сущности билета пассажира
        User user = new User(nameIdSt, depPointSt, arrPointSt, depTimeSt, arrTimeSt, ticketPrice.getText().toString());

        // создание намерения

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra(User.class.getSimpleName(), user);
        startActivity(intent);
    }

}