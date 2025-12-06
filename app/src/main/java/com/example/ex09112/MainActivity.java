package com.example.ex09112;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv = findViewById(R.id.tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean isTecni()
    {
        try {
            Double.parseDouble(et1.getText().toString());
            Double.parseDouble(et2.getText().toString());
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (isTecni()) {
            if (id == R.id.plus) {
                tv.setText(Double.parseDouble(et1.getText().toString())+Double.parseDouble(et2.getText().toString())+"");
            } else if (id == R.id.minus) {
                tv.setText(Double.parseDouble(et1.getText().toString())-Double.parseDouble(et2.getText().toString())+"");
            } else if (id == R.id.kefel) {
                tv.setText(Double.parseDouble(et1.getText().toString())*Double.parseDouble(et2.getText().toString())+"");
            } else if (id == R.id.hilook) {
                tv.setText(Double.parseDouble(et1.getText().toString())/Double.parseDouble(et2.getText().toString())+"");
            } else if (id == R.id.c) {
                tv.setText("");
                et1.setText("");
                et2.setText("");
            }
        }

        return super.onOptionsItemSelected(item);
    }
}