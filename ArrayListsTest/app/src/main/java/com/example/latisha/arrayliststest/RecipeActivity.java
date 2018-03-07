package com.example.latisha.arrayliststest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Latisha on 3/7/18.
 */

public class RecipeActivity extends Activity {
    Button btn1;
    ArrayList<String> addRecipe = new ArrayList<String>();
    ListView recipes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_list);

        btn1 = (Button)findViewById(R.id.backtoAdd);
        recipes = (ListView)findViewById(R.id.recipeList);

        ArrayAdapter<String> recipe = new ArrayAdapter<String>(RecipeActivity.this,android.R.layout.simple_list_item_1, addRecipe);
        recipes.setAdapter(recipe);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(RecipeActivity.this, MainActivity.class));
            }
        });

    }

}

