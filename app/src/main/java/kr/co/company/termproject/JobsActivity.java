package kr.co.company.termproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class JobsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jobs);
        setTitle("채용정보");
    }

    public void onClick(@NonNull View view){
        Intent intent = null;

        switch (view.getId()){
            case R.id.seeAll:{
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(("https://www.jobkorea.co.kr/recruit/joblist?menucode=local&localorder=1")));
                startActivity(intent);
                break;
            }
            case R.id.seeDuty:{
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(("https://www.jobkorea.co.kr/recruit/joblist?menucode=duty")));
                startActivity(intent);
                break;
            }
            case R.id.seeIndustry:{
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(("https://www.jobkorea.co.kr/recruit/joblist?menucode=industry")));
                startActivity(intent);
                break;
            }
        }
    }
}
