package travelindia.infinity.com.traveindia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KarnatakaActivity extends AppCompatActivity {

    Button bagalkot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka);

        bagalkot = (Button)findViewById(R.id.bagalkot);
        bagalkot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(KarnatakaActivity.this,BagalkotActivity.class);
                startActivity(i);
            }
        });
    }
}
