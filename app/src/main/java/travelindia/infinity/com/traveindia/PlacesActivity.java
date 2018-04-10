package travelindia.infinity.com.traveindia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlacesActivity extends AppCompatActivity {

    Button karnataka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        karnataka = (Button)findViewById(R.id.karnatka);
        karnataka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlacesActivity.this,KarnatakaActivity.class);
                startActivity(i);
            }
        });

    }
}
