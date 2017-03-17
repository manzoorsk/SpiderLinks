package digitalshopping.spiderlinks;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GalleryTwo extends AppCompatActivity {

    ViewPager vp;
    CustomSwipeAdapter customSwipeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_two);
        vp = (ViewPager) findViewById(R.id.vp);

        customSwipeAdapter= new CustomSwipeAdapter(this);
        vp.setAdapter(customSwipeAdapter);
    }
}
