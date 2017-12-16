package encomplus.com.truckapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class UserRegistation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registation);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbarUr);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("User Registation");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitleTextColor(Color.BLUE);

    }

    public void Verify(View view) {
        Intent intent =new Intent(UserRegistation.this,Profile.class);
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
