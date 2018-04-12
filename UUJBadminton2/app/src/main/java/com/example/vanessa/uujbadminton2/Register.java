package com.example.vanessa.uujbadminton2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    EditText e1, e2, e3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        openHelper = new DatabaseHelper(this);
        e1=(EditText)findViewById(R.id.tbName);
        e2=(EditText)findViewById(R.id.tbUser);
        e3=(EditText)findViewById(R.id.tbPassW);
        btn1=(Button)findViewById(R.id.btnRegister);
        
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                db=openHelper.getWritableDatabase();
                String fName = e1.getText().toString();
                String uName = e2.getText().toString();
                String pass = e3.getText().toString();
                insertData(fName, uName, pass);
                Toast.makeText(getApplicationContext(), "Register Successful", Toast.LENGTH_SHORT).show();
                
            }

            private void insertData(String fName, String uName, String pass) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(DatabaseHelper.COL_2, fName);
                contentValues.put(DatabaseHelper.COL_3, uName);
                contentValues.put(DatabaseHelper.COL_4, pass);
                long id = db.insert(DatabaseHelper.TABLE_NAME, null, contentValues);
            }
        });

    }

}
