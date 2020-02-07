package com.example.contactslistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;


import com.example.contactslistapp.AdapterClasses.MyAdapter;
import com.example.contactslistapp.ModelClasses.ContactModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView objectListView;
    private ArrayList<ContactModel> objectArrayList;
    private MyAdapter objectMyAdapter;
    private Object MyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initializeObjects();
        createObject();

    }

    private void createObject()
    {
        try
        {
            objectArrayList.add(new ContactModel("Nova","n@yahoo.com"
                    ,R.drawable.human_avatar));
            objectArrayList.add(new ContactModel("Julia","j@yahoo.com"
                    ,R.drawable.human_avatar));
            objectArrayList.add(new ContactModel("Hamza","H@yahoo.com"
                    ,R.drawable.human_avatar));

            objectArrayList.add(new ContactModel("Ali","a@yahoo.com"
                    ,R.drawable.human_avatar));
            objectArrayList.add(new ContactModel("Nova","n@yahoo.com"
                    ,R.drawable.human_avatar));
            objectArrayList.add(new ContactModel("Nova","n@yahoo.com"
                    ,R.drawable.human_avatar));

            objectMyAdapter=new MyAdapter(this,objectArrayList);
      //      objectListView.setAdapter(MyAdapter);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "createObjects:"
                    +
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }


    private void initializeObjects()
    {
        try
        {
            objectListView=findViewById(R.id.LV);
            objectArrayList=new ArrayList<>();
        }
        catch (Exception e)
        {
            Toast.makeText(this, "initializeObjects:"
                    +e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }






}
