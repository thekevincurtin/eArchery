package edu.gatech.earchery.earchery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class PracticeSession extends AppCompatActivity {
    ListView listView;
    private List<String> myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_session);
        ListView listView = (ListView) findViewById(R.id.listView);
        CreateListView();
    }
    private void CreateListView(){
        myList.add("Coderzheaven");
        myList.add("Google");
        myList.add("Android");
        myList.add("iPhone");
        myList.add("Apple");
        //Create an adapter for the listView and add the ArrayList to the adapter.
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                //args2 is the listViews Selected index
                Toast toast = new Toast(getApplicationContext());
                toast.setText("hello");
                toast.show();
            }
        });
    }
}
