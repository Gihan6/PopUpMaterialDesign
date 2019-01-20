package com.alokda.popup;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    Dialog mDialog;
    TextView tv_close;
    Button btn_show, btn_follow;
    CircleImageView civ_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDialog = new Dialog(this);
        btn_show = (Button) findViewById(R.id.btn_popup);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initViewDialog();

            }
        });
    }

    private void initViewDialog() {
        mDialog.setContentView(R.layout.custom_pop);

        tv_close = (TextView)mDialog. findViewById(R.id.tv_close);
        btn_follow = (Button)mDialog. findViewById(R.id.btn_follow);

        tv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }
}
