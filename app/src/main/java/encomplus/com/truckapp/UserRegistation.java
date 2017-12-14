package encomplus.com.truckapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserRegistation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registation);
    }

    public void Verify(View view) {
        Intent intent =new Intent(UserRegistation.this,Profile.class);
        startActivity(intent);
    }
}
