package com.example.vanessa.uujbadminton2;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Cursor cursor;
    EditText e1, e2;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.tbUsername);
        e2 = (EditText) findViewById(R.id.tbPassword);
        btn1 = (Button) findViewById(R.id.btnReg);
        btn2 = (Button) findViewById(R.id.btnLogin);
        //openHelper = new DatabaseHelper(this);
        //db = openHelper.getReadableDatabase();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = e1.getText().toString();
                String password = e2.getText().toString();



//                cursor = db.rawQuery("SELECT * FROM" + DatabaseHelper.TABLE_NAME + "WHERE" + DatabaseHelper.COL_3 + "=? AND" + DatabaseHelper.COL_4 + "=?", new String[]{username, password});
//                if (cursor !=null) {
//                    if (cursor.getCount()>0){
//                        Toast.makeText(getApplicationContext(), "Login Success!", Toast.LENGTH_SHORT).show();
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(), "Login Error", Toast.LENGTH_SHORT).show();
//                    }
//                }
                Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
            }
        });

    }
}
