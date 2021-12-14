package kr.co.company.termproject;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class TrendActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trend_item);
        setTitle("2021 채용트렌드");
    }
}