package comlordsushiphoenix.httpsgithub.hackwestern4demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onOrder1(View view){
        Intent intent = new Intent(this, OrdersDemo1.class);
        startActivity(intent);

    }
}
