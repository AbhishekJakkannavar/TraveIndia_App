package travelindia.infinity.com.traveindia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    ImageButton places,locateme,upcoming,tourism,addplaces,wishlist,about;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        places = (ImageButton)findViewById(R.id.placesbtn);
        locateme = (ImageButton)findViewById(R.id.locatemebtn);
        upcoming = (ImageButton)findViewById(R.id.upcomingbtn);
        tourism = (ImageButton)findViewById(R.id.tourismbtn);
        addplaces = (ImageButton)findViewById(R.id.addplacesbtn);
        wishlist = (ImageButton)findViewById(R.id.wishlistbtn);
        about = (ImageButton)findViewById(R.id.aboutbtn);


        //Send intent to Places Activity

        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PlacesActivity.class);
                startActivity(intent);
            }
        });

        //Send intent to Tourism News Activity
        tourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TourismActivity.class);
                startActivity(intent);
            }
        });






    }





}
