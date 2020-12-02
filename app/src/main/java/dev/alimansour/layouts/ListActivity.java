package dev.alimansour.layouts;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListActivity extends AppCompatActivity {
    private List<User> users = new ArrayList<>();
    private RecyclerView recyclerView;
    private boolean isGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        isGrid = getIntent().getBooleanExtra("isGrid", false);

        initializeData();

        recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        UsersAdapter adapter = new UsersAdapter();
        adapter.setDataSource(users);

        if (isGrid) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        } else {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }

        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {
        users.add(new User("Ahmed Said", "ahmed", R.drawable.user));
        users.add(new User("Adel Shahein", "adel", R.drawable.user));
        users.add(new User("Saleh Sami", "saleh", R.drawable.user));
        users.add(new User("Sara Shaker", "sara", R.drawable.user));
        users.add(new User("Mariam Adel", "mariam", R.drawable.user));
        users.add(new User("Emy Mohamed", "ibrahim", R.drawable.user));
        users.add(new User("Saly Ahmed", "saly", R.drawable.user));
        users.add(new User("Saber Adnan", "saber", R.drawable.user));
        users.add(new User("Ahmed Said", "ahmed", R.drawable.user));
        users.add(new User("Adel Shahein", "adel", R.drawable.user));
        users.add(new User("Saleh Sami", "saleh", R.drawable.user));
        users.add(new User("Sara Shaker", "sara", R.drawable.user));
        users.add(new User("Mariam Adel", "mariam", R.drawable.user));
        users.add(new User("Emy Mohamed", "ibrahim", R.drawable.user));
        users.add(new User("Saly Ahmed", "saly", R.drawable.user));
        users.add(new User("Saber Adnan", "saber", R.drawable.user));

    }
}