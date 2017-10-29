package com.gentb.cacttusedu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by gentberani on 10/12/17.
 */

public class MainActivity extends Activity {

    Button b1;

    private static final int MAIN_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.clickMeButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("itsMonday", true);
                intent.putExtra("titulli", "Aktiviteti Sekondar");
                //startActivity(intent);
                startActivityForResult(intent, MAIN_REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK) {
            return;
        }

        if (requestCode == MAIN_REQUEST_CODE) {
            if (data == null) {
                return;
            }
            boolean eenjte = data.getBooleanExtra("eenjte", false);

            System.out.println("E Enjte: " + eenjte);
        }
    }

    private void buttoniInstancues(Button b1) {
        b1 = b1;
    }

}
