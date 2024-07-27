package com.example.fruitbussiness;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView tvSelectDate;
    private EditText num1;
    private EditText num2;
    private AppCompatButton okans;
    private TextView tvans;


    private EditText nilam1;
    private EditText nilam2;
    private AppCompatButton nilamok;
    private TextView nilamans;


    private EditText lagda1;
    private EditText lagda2;
    private AppCompatButton lagdaok;
    private TextView lagdaans;

    private EditText tota1;
    private EditText tota2;
    private AppCompatButton totaok;
    private TextView totaans;


    private EditText bnum1;
    private EditText bnum2;
    private AppCompatButton bok;
    private TextView bans;

    private EditText kiwinum1;
    private EditText kiwinum2;
    private AppCompatButton kiwiok;
    private TextView kiwians;

    private EditText fnum1;
    private EditText fnum2;
    private AppCompatButton fok;
    private TextView fans;

    private EditText panum1;
    private EditText panum2;
    private AppCompatButton pok;
    private TextView pans;

    private EditText pear1;
    private EditText pear2;
    private AppCompatButton pearok;
    private TextView pearans;


    private EditText alnum1;
    private EditText alnum2;
    private AppCompatButton alok;
    private TextView alans;

    private EditText nash1;
    private EditText nash2;
    private AppCompatButton nashok;
    private TextView nashans;

    private EditText painum1;
    private EditText painum2;
    private AppCompatButton paiok;
    private TextView paians;

    private AppCompatButton btntotal;
    private TextView tvtotal;

    AppCompatButton save;
    FirebaseDatabase db;
    DatabaseReference reference;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        AppCompatButton button = findViewById(R.id.nextactivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivities(new Intent[]{intent});
            }
        });


        tvSelectDate = findViewById(R.id.tvSelectDate);
        final Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        tvSelectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                        month = month + 1;
                        String date = dayOfMonth + "/" + month + "/" + year;
                        tvSelectDate.setText(date);

                    }
                }, year, month, day);
                dialog.show();

            }
        });


        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        okans = (AppCompatButton) findViewById(R.id.btnok);
        tvans = (TextView) findViewById(R.id.tvans);

        okans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = num1.getText().toString();
                String num2Str = num2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    tvans.setText("0");
                } else {
                    int number1 = Integer.parseInt(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    int multiply = number1 * number2;
                    tvans.setText(String.valueOf(multiply));
                }
            }
        });

        nilam1 = (EditText) findViewById(R.id.nilam1);
        nilam2 = (EditText) findViewById(R.id.nilam2);
        nilamok = (AppCompatButton) findViewById(R.id.nilamok);
        nilamans = (TextView) findViewById(R.id.nilamans);

        nilamok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = nilam1.getText().toString();
                String num2Str = nilam2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    nilamans.setText("0");
                } else {
                    float number1 = Float.parseFloat(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    float multiply = number1 * number2;
                    nilamans.setText(String.valueOf(multiply));
                }
            }
        });

        lagda1 = (EditText) findViewById(R.id.lagda1);
        lagda2 = (EditText) findViewById(R.id.lagda2);
        lagdaok = (AppCompatButton) findViewById(R.id.lagdaok);
        lagdaans = (TextView) findViewById(R.id.lagdaans);

        lagdaok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = lagda1.getText().toString();
                String num2Str = lagda2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    lagdaans.setText("0");
                } else {
                    float number1 = Float.parseFloat(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    float multiply = number1 * number2;
                    lagdaans.setText(String.valueOf(multiply));
                }
            }
        });

        tota1 = (EditText) findViewById(R.id.tota1);
        tota2 = (EditText) findViewById(R.id.tota2);
        totaok = (AppCompatButton) findViewById(R.id.totaok);
        totaans = (TextView) findViewById(R.id.totaans);

        totaok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = tota1.getText().toString();
                String num2Str = tota2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    totaans.setText("0");
                } else {
                    float number1 = Float.parseFloat(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    float multiply = number1 * number2;
                    totaans.setText(String.valueOf(multiply));
                }
            }
        });

        bnum1 = (EditText) findViewById(R.id.bnum1);
        bnum2 = (EditText) findViewById(R.id.bnum2);
        bok = (AppCompatButton) findViewById(R.id.bok);
        bans = (TextView) findViewById(R.id.bans);

        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = bnum1.getText().toString();
                String num2Str = bnum2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    bans.setText("0");
                } else {
                    int number1 = Integer.parseInt(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    int multiply = number1 * number2;
                    bans.setText(String.valueOf(multiply));
                }
            }
        });

        kiwinum1 = (EditText) findViewById(R.id.kiwinum1);
        kiwinum2 = (EditText) findViewById(R.id.kiwinum2);
        kiwiok = (AppCompatButton) findViewById(R.id.kiwiok);
        kiwians = (TextView) findViewById(R.id.kiwians);

        kiwiok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = kiwinum1.getText().toString();
                String num2Str = kiwinum2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    kiwians.setText("0");
                } else {
                    int number1 = Integer.parseInt(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    int multiply = number1 * number2;
                    kiwians.setText(String.valueOf(multiply));
                }
            }
        });


        fnum1 = (EditText) findViewById(R.id.fnum1);
        fnum2 = (EditText) findViewById(R.id.fnum2);
        fok = (AppCompatButton) findViewById(R.id.fok);
        fans = (TextView) findViewById(R.id.fans);

        fok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = fnum1.getText().toString();
                String num2Str = fnum2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    fans.setText("0");
                } else {
                    int number1 = Integer.parseInt(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    int multiply = number1 * number2;
                    fans.setText(String.valueOf(multiply));
                }
            }
        });


        panum1 = (EditText) findViewById(R.id.panum1);
        panum2 = (EditText) findViewById(R.id.panum2);
        pok = (AppCompatButton) findViewById(R.id.pok);
        pans = (TextView) findViewById(R.id.pans);

        pok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = panum1.getText().toString();
                String num2Str = panum2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    pans.setText("0");
                } else {
                    float number1 = Float.parseFloat(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    float multiply = number1 * number2;
                    pans.setText(String.valueOf(multiply));
                }
            }
        });


        pear1 = (EditText) findViewById(R.id.pear1);
        pear2 = (EditText) findViewById(R.id.pear2);
        pearok = (AppCompatButton) findViewById(R.id.pearok);
        pearans = (TextView) findViewById(R.id.pearans);

        pearok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = pear1.getText().toString();
                String num2Str = pear2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    pearans.setText("0");
                } else {
                    float number1 = Float.parseFloat(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    float multiply = number1 * number2;
                    pearans.setText(String.valueOf(multiply));
                }
            }
        });


        alnum1 = (EditText) findViewById(R.id.alnum1);
        alnum2 = (EditText) findViewById(R.id.alnum2);
        alok = (AppCompatButton) findViewById(R.id.alok);
        alans = (TextView) findViewById(R.id.alans);

        alok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = alnum1.getText().toString();
                String num2Str = alnum2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    alans.setText("0");
                } else {
                    float number1 = Float.parseFloat(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    float multiply = number1 * number2;
                    alans.setText(String.valueOf(multiply));
                }
            }
        });

        nash1 = (EditText) findViewById(R.id.nash1);
        nash2 = (EditText) findViewById(R.id.nash2);
        nashok = (AppCompatButton) findViewById(R.id.nashok);
        nashans = (TextView) findViewById(R.id.nashans);

        nashok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = nash1.getText().toString();
                String num2Str = nash2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    nashans.setText("0");
                } else {
                    float number1 = Float.parseFloat(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    float multiply = number1 * number2;
                    nashans.setText(String.valueOf(multiply));
                }
            }
        });

        painum1 = (EditText) findViewById(R.id.painum1);
        painum2 = (EditText) findViewById(R.id.painum2);
        paiok = (AppCompatButton) findViewById(R.id.paiok);
        paians = (TextView) findViewById(R.id.paians);

        paiok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1Str = painum1.getText().toString();
                String num2Str = painum2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    paians.setText("0");
                } else {
                    int number1 = Integer.parseInt(num1Str);
                    int number2 = Integer.parseInt(num2Str);
                    int multiply = number1 * number2;
                    paians.setText(String.valueOf(multiply));
                }
            }
        });


        btntotal = (AppCompatButton) findViewById(R.id.btntotal);
        tvtotal = (TextView) findViewById(R.id.tvtotal);
        btntotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(kiwians.getText().toString());
                int number2 = Integer.parseInt(tvans.getText().toString());
                int number3 = Integer.parseInt(bans.getText().toString());
                float number4 = Float.parseFloat(nilamans.getText().toString());
                float number5 = Float.parseFloat(lagdaans.getText().toString());
                float number6 = Float.parseFloat(totaans.getText().toString());
                float number7 = Float.parseFloat(fans.getText().toString());
                float number8 = Float.parseFloat(pans.getText().toString());
                float number9 = Float.parseFloat(pearans.getText().toString());
                float number10 = Float.parseFloat(alans.getText().toString());
                float number11 = Float.parseFloat(nashans.getText().toString());
                int number12 = Integer.parseInt(paians.getText().toString());

                float add = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10 + number11 + number12;
                tvtotal.setText(String.valueOf(add));
            }
        });



            save=findViewById(R.id.save);
            save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = tvSelectDate.getText().toString();
                String quantity = kiwinum1.getText().toString();
                String price = kiwinum2.getText().toString();
                String totalprice= kiwians.getText().toString();


                String appquantity = num1.getText().toString();
                String appprice = num2.getText().toString();
                String apptotal= tvans.getText().toString();


                if(!quantity.isEmpty() && !price.isEmpty() && !totalprice.isEmpty()
                ){

                    Data data = new Data(quantity,price,totalprice,
                            appquantity,appprice,apptotal);


                    db = FirebaseDatabase.getInstance();
                    reference = db.getReference("FruitsData");
                    reference.child(date).setValue(data).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            Toast.makeText(MainActivity.this, "Successfully Saved", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

            }
        });


    }

}


