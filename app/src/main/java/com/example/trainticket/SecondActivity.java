package com.example.trainticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // поле

    private TextView ticketInfo;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ticketInfo = findViewById(R.id.ticketInfo);

        Bundle bundle = getIntent().getExtras();
        user = (User) bundle.getSerializable(User.class.getSimpleName());

        ticketInfo.setText(user.toString());
    }

    // кнопка очистки\возврата
    public void onClickClr(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}