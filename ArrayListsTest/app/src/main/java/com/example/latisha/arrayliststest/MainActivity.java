package com.example.latisha.arrayliststest;


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
    EditText name;
    ListView show;
    EditText ingredients;
    EditText recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.Name);
        ingredients = (EditText)findViewById(R.id.ingredients);
        recipe = (EditText)findViewById(R.id.instructions);
        show = (ListView)findViewById(R.id.listView);
        save = (Button)findViewById(R.id.button3);
        save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String getInput = name.getText().toString();
                String getIng = ingredients.getText().toString();
                String getRecipe = recipe.getText().toString();

                if(addArray.contains(getInput)){
                    Toast.makeText(getBaseContext(), "Item already added to Array", Toast.LENGTH_LONG);
                }
                else if (getInput == null || getInput.trim().equals("")){
                    Toast.makeText(getBaseContext(),"Input Field is Empty",Toast.LENGTH_LONG);
                }
                else {
                    addArray.add(getInput);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, addArray);
                    show.setAdapter(adapter);
                    ((EditText)findViewById(R.id.Name)).setText(" ");

                }

                if(addArray.contains(getIng)){
                    Toast.makeText(getBaseContext(), "Item already added to Array", Toast.LENGTH_LONG);
                }
                else if (getIng == null || getIng.trim().equals("")){
                    Toast.makeText(getBaseContext(),"Input Field is Empty",Toast.LENGTH_LONG);
                }
                else {
                    addArray.add(getIng);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, addArray);
                    show.setAdapter(adapter);
                    ((EditText)findViewById(R.id.ingredients)).setText(" ");

                }
                if(addArray.contains(getRecipe)){
                    Toast.makeText(getBaseContext(), "Item already added to Array", Toast.LENGTH_LONG);
                }
                else if (getRecipe == null || getRecipe.trim().equals("")){
                    Toast.makeText(getBaseContext(),"Input Field is Empty",Toast.LENGTH_LONG);
                }
                else {
                    addArray.add(getRecipe);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, addArray);
                    show.setAdapter(adapter);
                    ((EditText)findViewById(R.id.instructions)).setText(" ");

                }
            }
        });

    }
}
