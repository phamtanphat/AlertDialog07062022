package com.example.alertdialog07062022;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOpenAlertDialog, btnOpenCustomDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenAlertDialog = findViewById(R.id.button_open_alert_dialog);
        btnOpenCustomDialog = findViewById(R.id.button_open_custom_dialog);

        btnOpenAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông báo");
                builder.setMessage("Ứng dụng cần nâng cấp lên phiên bản mới!!!");
                builder.setCancelable(false);
                builder.setIcon(R.mipmap.ic_launcher);

                // Action
                builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Đồng ý", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Không", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Hủy", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });

        btnOpenCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogUtils.openRatingDialog(MainActivity.this, new DialogUtils.EventListenerRatingDialog() {
                    @Override
                    public void onClickNeverButton() {
                        Toast.makeText(MainActivity.this, "Click Never", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onClickMaybeLaterButton() {
                        Toast.makeText(MainActivity.this, "Click Maybe", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onRatingChanged(float rating) {
                        Toast.makeText(MainActivity.this, "Rating value: " + rating, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
