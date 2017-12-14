package encomplus.com.truckapp;

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
    public void UserRegistation(View view) {
        Intent intent =new Intent(MainActivity.this,UserRegistation.class);
        startActivity(intent);

    }

    public void DriverRegistation(View view) {
        Intent intent =new Intent(MainActivity.this,DriverRegistation.class);
        startActivity(intent);

    }
}
