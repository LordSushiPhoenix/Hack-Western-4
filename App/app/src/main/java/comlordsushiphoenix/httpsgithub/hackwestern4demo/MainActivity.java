package comlordsushiphoenix.httpsgithub.hackwestern4demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //Opens a page to make a new order
    public void onDemo1(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }

    public void onDemo2(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);

    }

    public void onDemo3(View view){
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);

    }

}
