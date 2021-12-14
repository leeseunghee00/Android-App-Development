package kr.co.company.termproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide);
        setTitle("취업 가이드");
    }


    public void onClick(View view){
        Intent intent = null;

        switch (view.getId()){
            case R.id.trend:{
                intent = new Intent(getApplicationContext(), TrendActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.interview:{
                intent = new Intent(getApplicationContext(), InterviewActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.schedule:{
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jobkorea.co.kr/starter/calendar/"));
                startActivity(intent);
                break;
            }
            case R.id.resume:{
                intent = new Intent(getApplicationContext(), ResumeActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.site:{
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jobkorea.co.kr/"));
                startActivity(intent);
                break;
            }
        }
    }
}
