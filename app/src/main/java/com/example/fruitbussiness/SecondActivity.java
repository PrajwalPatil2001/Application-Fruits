package com.example.fruitbussiness;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {

    EditText etdate;
    TextView kiwiq, kiwip, kiwitotal;
    TextView appqun,appp,appletotal;
    TextView bananaquntity,bananaprice,bananatotal;
    AppCompatButton readbtn;
    FirebaseDatabase db;
    DatabaseReference reference;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        etdate=findViewById(R.id.etdate);

        kiwiq = findViewById(R.id.kiwiq);
        kiwip = findViewById(R.id.kiwip);
        kiwitotal = findViewById(R.id.kiwitotal);

        appqun = findViewById(R.id.appqun);
        appp = findViewById(R.id.appp);
        appletotal = findViewById(R.id.appletotal);



        readbtn=findViewById(R.id.readbtn);

        readbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date= etdate.getText().toString();
                if(!date.isEmpty()){
                    readData(date);
                }
                else {
                    Toast.makeText(SecondActivity.this, "Please Enter Date", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void readData(String date){
        reference = FirebaseDatabase.getInstance().getReference("FruitsData");
        reference.child(date).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if(task.isSuccessful()){
                    if (task.getResult().exists()) {
                        Toast.makeText(SecondActivity.this, "Successfully Read", Toast.LENGTH_SHORT).show();
                        DataSnapshot dataSnapshot = task.getResult();

                        String quantity = String.valueOf(dataSnapshot.child("quantity").getValue());
                        String price = String.valueOf(dataSnapshot.child("price").getValue());
                        String totalprice = String.valueOf(dataSnapshot.child("totalprice").getValue());

                        kiwiq.setText(quantity);
                        kiwip.setText(price);
                        kiwitotal.setText(totalprice);

                        String appquantity = String.valueOf(dataSnapshot.child("appquantity").getValue());
                        String appprice = String.valueOf(dataSnapshot.child("appprice").getValue());
                        String apptotal = String.valueOf(dataSnapshot.child("apptotal").getValue());

                        appqun.setText(appquantity);
                        appp.setText(appprice);
                        appletotal.setText(apptotal);

                        String bquantity = String.valueOf(dataSnapshot.child("bquantity").getValue());
                        String bprice = String.valueOf(dataSnapshot.child("bprice").getValue());
                        String btotal = String.valueOf(dataSnapshot.child("btotal").getValue());

                        bananaquntity.setText(bquantity);
                        bananaprice.setText(bprice);
                        bananatotal.setText(btotal);
                    }
                    else{
                        Toast.makeText(SecondActivity.this, "Data for this date is not Exist", Toast.LENGTH_SHORT).show();

                    }

                }
            }
        });
    }
}