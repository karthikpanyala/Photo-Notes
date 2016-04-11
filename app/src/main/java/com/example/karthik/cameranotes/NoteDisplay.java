package com.example.karthik.cameranotes;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by karthik on 2/21/16.
 */
public class NoteDisplay extends AppCompatActivity {

    private EditText noteText;
    private Button saveButtonVar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note_layout);


        noteText = (EditText) findViewById(R.id.noteTextEdit);
        saveButtonVar = (Button) findViewById(R.id.saveButton);
        Intent intent = getIntent();
        final String fname = intent.getStringExtra("PIC");

        saveButtonVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = noteText.getText().toString();

                Intent mainIntent = new Intent();
                mainIntent.putExtra("MESSAGE",msg.toString());
                mainIntent.putExtra("PICPATH",fname);
                setResult(3, mainIntent);
                finish();
            }
        });

    }



    /*public String getStringNote(){

        String editTextStr = noteText.getText().toString();
        return editTextStr;
    }*/
}
