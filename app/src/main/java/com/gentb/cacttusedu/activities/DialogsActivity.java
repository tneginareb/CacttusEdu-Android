package com.gentb.cacttusedu.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gentb.cacttusedu.R;

/**
 * Created by gentberani on 12/4/17.
 */

public class DialogsActivity extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        ((Button) findViewById(R.id.buttonTop)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog("Nga lart, pershedetje!");
            }
        });

        ((Button) findViewById(R.id.buttonBottom)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog("Nga poshte, pershedetje!");
            }
        });
    }

    private void showAlertDialog(final String message) {
        AlertDialog.Builder alertDialog =
                new AlertDialog.Builder(DialogsActivity.this);
        alertDialog.setTitle("Cacttus Education");
        alertDialog.setMessage(message);
        alertDialog.setCancelable(false);
        alertDialog.setNegativeButton("Jo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("Eshte shtypur: JO");
            }
        });
        alertDialog.setPositiveButton("Po", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("Eshte shtypur: PO");
            }
        });
        alertDialog.show();
    }

    private void showToast(final String message){
        Toast.makeText(getApplicationContext(),
                message, Toast.LENGTH_SHORT).show();
    }
}
