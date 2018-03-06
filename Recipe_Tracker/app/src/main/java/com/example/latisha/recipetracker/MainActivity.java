package com.example.latisha.recipetracker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Latisha on 3/5/18.
 */

public class MainActivity extends Activity {
    Button save;
    ArrayList<String> addArray = new ArrayList<String>();
    EditText txt;
    ListView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.content_home);

       txt = (EditText)findViewById(R.id.txtInput);
       show = (ListView)findViewById(R.id.listView);
       save = (Button)findViewById(R.id.button3);
       save.setOnClickListener(new onClickListener() {

           @Override
           public void onClick(View v) {
               String getInput = txt.getText().toString();

               if(addArray.contains(getInput)){
                   Toast.makeText(getBaseContext(), "Item already added to Array", Toast.LENGTH_LONG.show());
               }
               else if (getInput == null || getInput.trim().equals("")){
                   Toast.makeText(getBaseContext(),"Input Field is Empty",Toast.LENGTH_LONG.show());
               }
               else {
                   addArray.add(getInput);
                   ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, addArray);
                   show.setAdapter(adapter);
                   ((EditText)findViewById(R.id.txtInput)).setText(" ");

               }
           }
        });

    }
}
