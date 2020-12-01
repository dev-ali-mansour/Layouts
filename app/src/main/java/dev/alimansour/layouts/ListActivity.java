package dev.alimansour.layouts;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListActivity extends AppCompatActivity {
    private List<User> users;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        initializeData();

        recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        UsersAdapter adapter = new UsersAdapter();
        adapter.setDataSource(users);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void initializeData() {
        users = new ArrayList<>();
        users.add(new User("Ahmed Said", "ahmed", "a.said@site.com",R.drawable.user));
        users.add(new User("Adel Shahein", "adel", "a.shahein@site.com",R.drawable.user));
        users.add(new User("Saleh Sami", "saleh", "s.sami@site.com",R.drawable.user));
        users.add(new User("Sara Shaker", "sara", "s.shaker@site.com",R.drawable.user));
        users.add(new User("Mariam Adel", "mariam", "m.adel@site.com",R.drawable.user));
        users.add(new User("Ibrahim Mohamed", "ibrahim", "i.mohamed@site.com",R.drawable.user));
        users.add(new User("Mustafa Ahmed", "mustafa", "mustafa@site.com",R.drawable.user));
        users.add(new User("Saber Adnan", "saber", "saber@site.com",R.drawable.user));
    }
}