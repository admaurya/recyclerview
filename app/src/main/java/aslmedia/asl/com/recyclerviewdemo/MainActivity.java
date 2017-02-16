package aslmedia.asl.com.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import aslmedia.asl.com.recyclerviewdemo.adapter.RecyclerAdapter;
import aslmedia.asl.com.recyclerviewdemo.model.StudentRecord;

public class MainActivity extends AppCompatActivity {

    private ArrayList<StudentRecord> arrayRecords;
    private RecyclerAdapter recyclerAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SET RECORD in the list before passing it to the adapter.
        setData();

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerAdapter=new RecyclerAdapter(arrayRecords, MainActivity.this);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerAdapter);

    }

    private void setData()
    {
        arrayRecords=new ArrayList<>();
        StudentRecord record=new StudentRecord("Amardeep", "Male", "Delhi", 26);
        arrayRecords.add(record);

        record=new StudentRecord("Dev Kumar", "Male", "Lucknow", 12);
        arrayRecords.add(record);
        record=new StudentRecord("Anjali", "Female", "Allahabad", 22);
        arrayRecords.add(record);
        record=new StudentRecord("Alok", "Male", "Agra", 20);
        arrayRecords.add(record);
        record=new StudentRecord("Surya", "Male", "Chennai", 21);
        arrayRecords.add(record);
        record=new StudentRecord("Pooja", "Female", "Kolkata", 18);
        arrayRecords.add(record);
        record=new StudentRecord("Pavan", "Male", "Mumbai", 19);
        arrayRecords.add(record);
        record=new StudentRecord("Ravi", "Male", "Guwahati", 20);
        arrayRecords.add(record);
        record=new StudentRecord("Anju", "Female", "Banglore", 20);
        arrayRecords.add(record);
        record=new StudentRecord("Gaurav", "Male", "Patna", 15);
        arrayRecords.add(record);
        record=new StudentRecord("Deepak", "Male", "Chandigarh", 24);
        arrayRecords.add(record);
    }
}
