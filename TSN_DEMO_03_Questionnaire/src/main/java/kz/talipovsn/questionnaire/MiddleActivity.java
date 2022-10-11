package kz.talipovsn.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MiddleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.middle_middle);

    }

    public void onInfo(View v) {

        // Создание второго окна

        Intent intent = new Intent(MiddleActivity.this, MainActivity.class);
        //Intent intent = new Intent("kz.talipovsn.questionnaire.ResultActivity");

        // Запуск второго окна
        startActivity(intent);
    }

    // МЕТОД ДЛЯ КНОПКИ НАЗАД
    public void onBack(View v) {
        setResult(RESULT_OK);
        finish();
    }
}