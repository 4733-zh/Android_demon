package com.example.demo3;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        imageView = findViewById(R.id.image_view);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {

            //ProgressDialog
            ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setTitle("This is ProgressDialog");
            progressDialog.setMessage("Loading...");
            progressDialog.setCancelable(true);
            progressDialog.show();


            //AlertDialog
//            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//            dialog.setTitle("This is Dialog");
//            dialog.setMessage("Something important.");
//            dialog.setCancelable(false);
//            dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                }
//            });
//            dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                }
//            });
//            dialog.show();

                //TextView
//            String inputText = editText.getText().toString();
//            Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();

            //ImageView
//            imageView.setImageResource(R.drawable.img_2);

            //ProgressBar
//            if (progressBar.getVisibility() == View.GONE) {
//                progressBar.setVisibility(View.VISIBLE);
//            } else {
//                progressBar.setVisibility(View.GONE);
//            }
//            int progress = progressBar.getProgress();
//            progress = progress + 10;
//            progressBar.setProgress(progress);
        }
    }
}