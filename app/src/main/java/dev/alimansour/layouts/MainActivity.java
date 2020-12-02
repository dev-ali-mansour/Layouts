package dev.alimansour.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button linearLayoutButton, constraintLayoutButton, tableLayoutButton, listButton, gridButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayoutButton = findViewById(R.id.linearLayoutButton);
        constraintLayoutButton = findViewById(R.id.constraintLayoutButton);
        tableLayoutButton = findViewById(R.id.tableLayoutButton);
        listButton = findViewById(R.id.listButton);
        gridButton = findViewById(R.id.gridButton);

        linearLayoutButton.setOnClickListener(v -> {
            intent = new Intent(this, LinearLayoutActivity.class);
            startActivity(intent);
        });
        constraintLayoutButton.setOnClickListener(v -> {
            intent = new Intent(this, ConstraintLayoutActivity.class);
            startActivity(intent);
        });
        tableLayoutButton.setOnClickListener(v -> {
            intent = new Intent(this, TableLayoutActivity.class);
            startActivity(intent);
        });
        listButton.setOnClickListener(v -> {
            intent = new Intent(this, ListActivity.class);
            intent.putExtra("isGrid", false);
            startActivity(intent);
        });
        gridButton.setOnClickListener(v -> {
            intent = new Intent(this, ListActivity.class);
            intent.putExtra("isGrid", true);
            startActivity(intent);
        });

    }
}