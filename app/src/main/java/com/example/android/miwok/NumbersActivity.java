package com.example.android.miwok;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Crea un ArrayList de la clase Word. Crea un objeto word y lo agrega al arreglo words
        ArrayList<Word> words  = new ArrayList<Word>();
//        Word word = new Word("one", "lutti");
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temomokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo'e"));
        words.add(new Word("ten", "na'aacha"));

        Log.v("NumbersActivity", "words: " + words.get(0).getDefaultTranslation() + words.get(0).getMiwokTranslation());
//        words.add("Two");
//        words.add("Three");
//        words.add("Four");
//        words.add("Five");
//        words.add("Six");
//        words.add("Seven");
//        words.add("Eight");
//        words.add("Nine");
//        words.add("Ten");

        //El adaptador utiliza la lista personalizada list_item.xml
//        ArrayAdapter<Word> wordsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item,words);
//        ListView listView = (ListView) findViewById(R.id.rootNumbersView);
//        listView.setAdapter(wordsAdapter);

        //El adaptador utiliza la lista personalizada list_item.xml
        WordAdapter wordAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.listview_numbers);
        listView.setAdapter(wordAdapter);


        //Hacemos referencia al LinearLayout raíz
//        LinearLayout numberRoot = (LinearLayout) findViewById(R.id.rootNumbersView);

//        int index = 0;

        //Crea un TextView y lo agrega al LinearLayout
//        TextView wordView1 = new TextView(this);
//        wordView1.setText(words.get(index));
//        numberRoot.addView(wordView1);
//
//        index+=1;
//        TextView wordView2 = new TextView(this);
//        wordView2.setText(words.get(index));
//        numberRoot.addView(wordView2);
//
//        index+=1;
//        TextView wordView3 = new TextView(this);
//        wordView3.setText(words.get(index));
//        numberRoot.addView(wordView3);

//
//        index = 0;
//        while(index < 4){
//            Log.v("NumbersActivity", "index=" + index + "\nwords(" + index + ")=" + words.get(index));
//            index++;
//        }
//        Log.v("NumbersActivity", "words.size(): " + words.size());
//        Log.v("NumbersActivity", "words: " + words);

        //Ejemplo de while
//            while(index < words.size()){
//                TextView wordTextView = new TextView(this);
//                wordTextView.setText(words.get(index));
//                numberRoot.addView(wordTextView);
//
//                index+=1;
//            }

            //Ejemplo de ciclo for
//            for(int x=0; x < words.size(); x++){
//                TextView wordTextView = new TextView(this);
//                wordTextView.setText(words.get(x));
//                numberRoot.addView(wordTextView);
//
//            }

//        Log.v("NumbersActivity","words.get(0) -> " + words.get(0));
//        Log.v("NumbersActivity","words.get(1) -> " + words.get(1));
//        Log.v("NumbersActivity","words.get(2) -> " + words.get(2));
//        Log.v("NumbersActivity","words.get(3) -> " + words.get(3));
//        Log.v("NumbersActivity","words.get(4) -> " + words.get(4));


//        ArrayList<String> restaurantsToTry = new ArrayList<String>();
//        restaurantsToTry.add("Morning Cafe");
//        restaurantsToTry.add("BBQ Time");
//        Log.v("NumbersActivity","restaurantsToTry.size(): " + restaurantsToTry.size() );
//        Log.v("NumbersActivity","restaurantsToTry: " + restaurantsToTry );
//
//        Log.v("NumbersActivity","restaurantsToTry.get(0): " + restaurantsToTry.get(0) );
//        Log.v("NumbersActivity","restaurantsToTry.get(1): " + restaurantsToTry.get(1) );
//
//        restaurantsToTry.remove("Morning Cafe"); //quitar BBQ Time
//        Log.v("NumbersActivity","restaurantsToTry: " + restaurantsToTry );
//        Log.v("NumbersActivity","restaurantsToTry.size(): " + restaurantsToTry.size() );

    }
}