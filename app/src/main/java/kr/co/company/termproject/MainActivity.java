package kr.co.company.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Daejeon Company App");
    }

    public void onClick(View view){
        Intent intent = null;

        switch (view.getId()){
            case R.id.company:{
                intent = new Intent(getApplicationContext(), CompanyActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.jobs:{
                intent = new Intent(getApplicationContext(), JobsActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.guide:{
                intent = new Intent(getApplicationContext(), GuideActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}