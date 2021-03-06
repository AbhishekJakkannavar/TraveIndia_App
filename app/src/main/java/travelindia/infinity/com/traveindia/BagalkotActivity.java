package travelindia.infinity.com.traveindia;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class BagalkotActivity extends AppCompatActivity {

    private RecyclerView mBlogList;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagalkot);
        mBlogList = findViewById(R.id.blog_listbagalkot);

        mBlogList.setHasFixedSize(true);
        mBlogList.setLayoutManager(new LinearLayoutManager(this));
        mDatabase = FirebaseDatabase.getInstance().getReference().child("karnataka").child("bagalkot");
    }


    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<Bagalkot, BagalkotActivity.OngoingViewHolder> FirebaseAdapter = new FirebaseRecyclerAdapter<Bagalkot, BagalkotActivity.OngoingViewHolder>(
                Bagalkot.class,
                R.layout.design_row,
                BagalkotActivity.OngoingViewHolder.class,
                mDatabase

        ) {
            @Override
            protected void populateViewHolder(BagalkotActivity.OngoingViewHolder viewHolder, Bagalkot model, int position) {

                viewHolder.setTitle(model.getTitle());
                viewHolder.setDesc(model.getDescription());
                viewHolder.setImage(getApplicationContext(), model.getImage());
                viewHolder.setHistory(model.getHistory());
               viewHolder.setSpeciality(model.getSpeciality());
                viewHolder.setTime(model.getTime());
                viewHolder.setFees(model.getFees());


            }
        };

        mBlogList.setAdapter(FirebaseAdapter);
    }

    public static class OngoingViewHolder extends RecyclerView.ViewHolder {
        View mView;

        public OngoingViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

        }

        public void setTitle(String title) {

            TextView post_title = mView.findViewById(R.id.post_title);
            post_title.setText(title);
        }

        public void setDesc(String desc) {

            TextView post_desc = mView.findViewById(R.id.post_description);
            post_desc.setText(desc);
        }


        public void setImage(Context ctx, String image) {
            ImageView post_image = mView.findViewById(R.id.post_image);
            Picasso.with(ctx).load(image).into(post_image);

        }

        public void setHistory(String history) {

            TextView post_history = mView.findViewById(R.id.post_histoy);
            post_history.setText(history);
        }


        public void setSpeciality(String speciality) {

            TextView post_speciality = mView.findViewById(R.id.post_specality);
            post_speciality.setText(speciality);
        }

        public void setTime(String time) {

            TextView post_time = mView.findViewById(R.id.post_time);
            post_time.setText(time);
        }

        public void setFees(String fees) {

            TextView post_fees = mView.findViewById(R.id.post_fees);
            post_fees.setText(fees);
        }

    }
}
