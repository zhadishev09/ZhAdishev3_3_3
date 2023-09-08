package com.example.less3_3part_homewor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_btn;
    private ArrayList<String> names = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_btn = findViewById(R.id.rv_button);
        loadData();
        BtnAdapter adapter = new BtnAdapter(names);
        rv_btn.setAdapter(adapter);


    }

    private void loadData() {
        names.add("ne angime");
        names.add("aaaa");
        names.add("bbbb");
        names.add("sss");
        names.add("5");
        names.add("6");
        names.add("7");
        names.add("8");
        names.add("9");
        names.add("20");
        names.add("NAJMI");
        names.add("NE NAJMI");
        names.add("ДЕЛАЙ ЧЕ ХОЧЕШЬ");
    }

}