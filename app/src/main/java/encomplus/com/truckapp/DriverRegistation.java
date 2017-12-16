package encomplus.com.truckapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import encomplus.com.truckapp.Driver.DriverProfile;

public class DriverRegistation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_registation);
        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbarDr);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Driver Registation");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitleTextColor(Color.BLUE);


    }

    public void Verify2(View view) {
        Intent intent =new Intent(DriverRegistation.this,DriverProfile.class);
        startActivity(intent);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();;
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}
