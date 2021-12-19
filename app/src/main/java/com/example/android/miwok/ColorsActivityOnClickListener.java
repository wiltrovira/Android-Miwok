package com.example.android.miwok;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class ColorsActivityOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),
                "La actividad se abre desde una clase nombrada que implementa OnClickListener",
                Toast.LENGTH_LONG).show();

        Intent colorsActivityIntent = new Intent(v.getContext(), ColorsActivity.class);
        v.getContext().startActivity(colorsActivityIntent);
    }
}
