/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Esta es una forma de asignar un listener a un botón
        TextView colorsTextView = (TextView) findViewById(R.id.colors);
        ColorsActivityOnClickListener colorsActivityOnClickListener = new ColorsActivityOnClickListener();
        colorsTextView.setOnClickListener(colorsActivityOnClickListener);


        //Busca la vista que abre la categoría de números
        TextView numbersTextView = (TextView) findViewById(R.id.numbers);
        //Implementación de un listener en una sola línea para llamar a la actividad NumbersActivity
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(),
                        "La actividad se abre desde un listener anónimo creado en MainActivity",
                        Toast.LENGTH_LONG).show();

                Intent numbersActivityIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersActivityIntent);
            }
        });

        //Implementación en línea del OnClickListener para FamilyMembersActiviy
        TextView familyMembersTextView = (TextView) findViewById(R.id.family);
        familyMembersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "La actividad se abre desde un listener anónimo creado en MainActivity",
                        Toast.LENGTH_LONG).show();

                Intent familyMembersActivityIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(familyMembersActivityIntent);
            }
        });
    }



    //Esta es una forma de abrir una actividad desde la vista
    public void abrirPhrasesActivity(View v){
        Toast.makeText(v.getContext(),
                "La actividad se abre desde un método que se llama desde el layout (Fácil, pero menos control)",
                Toast.LENGTH_LONG).show();

        Intent phrasesActiviyIntent = new Intent(this,PhrasesActivity.class);
        startActivity(phrasesActiviyIntent);
    }
}
