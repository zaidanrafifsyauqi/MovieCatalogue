package com.example.submissionexpt;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public TextView textTitle, textDetail;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textTitle = findViewById(R.id.tv_lang_title);
        Flim extra = getIntent().getParcelableExtra("flim");
        textTitle.setText(extra.getName());

        imageView = findViewById(R.id.imgphoto);
        imageView.setImageResource(extra.getPhoto());

        textDetail = findViewById(R.id.detail_halaman);
        textDetail.setText(extra.getDetail());


    }
}
