package digitalshopping.spiderlinks;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LancherActivity extends AppCompatActivity {
    Handler h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancher);

        final ImageView zoom = (ImageView) findViewById(R.id.ib);
        final Animation zoomAnimation = AnimationUtils.loadAnimation(this, R.anim.zooming);
        zoom.startAnimation(zoomAnimation);
        int delay=4000;
        h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(LancherActivity.this,HomePage.class);
                startActivity(i);
            }
        },delay);


    }
}
