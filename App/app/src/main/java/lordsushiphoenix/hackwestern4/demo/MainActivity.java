package lordsushiphoenix.hackwestern4.demo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
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
    public void createOrder(View view){
        //TODO

    }

    //Opens a page to show available orders
    public void viewOrder(View view){
        //TODO

    }

    public void onViewMap(View view){
        Intent intent = new Intent(this,ShowMapActivity.class );
        startActivity(intent);

    }

}
