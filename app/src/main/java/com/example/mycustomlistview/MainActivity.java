package com.example.mycustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] maintitle ={
            "Ali","Hassan",
            "Reza","Mohammad",
            "Hossein",
            "Javad",
            "Person 1","Person 2",
            "Person 3","Person 4",
            "Person 5","Person 6",
            "Person 7","Person 8",
            "Person 9","Person 10",
            "Person 11","Person 12",


    };

    String[] subtitle ={
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
            "Term 3",
    };

    Integer[] imgid={
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
            R.drawable.simgae1,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);



    }
}