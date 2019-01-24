package com.example.nguyentiendung.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Spinner spnCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnCategory=(Spinner)findViewById(R.id.spnCategory);
        List<String> list =new ArrayList<>();
        list.add("Java");
        list.add("C#");
        list.add("PHP");
        list.add("Android");

        //dua lieu len vào adapter
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        // khi click chọn item sẽ có nút tích vuông màu hồng
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //dua du lieu vào view
        spnCategory.setAdapter(adapter);
        //sử lý sự kiện click item
        spnCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //position vị trí của item đang chọn
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,  spnCategory.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}
