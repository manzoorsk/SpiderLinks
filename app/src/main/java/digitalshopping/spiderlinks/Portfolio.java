package digitalshopping.spiderlinks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class Portfolio extends AppCompatActivity implements View.OnClickListener {
    ScrollView scrollView;
    ImageView iv,iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12,iv13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        iv = (ImageView) findViewById(R.id.i1);
        iv1 = (ImageView) findViewById(R.id.i2);
        iv2 = (ImageView) findViewById(R.id.i3);
        iv3 = (ImageView) findViewById(R.id.i4);
        iv4 = (ImageView) findViewById(R.id.i5);
        iv5 = (ImageView) findViewById(R.id.i6);
        iv6 = (ImageView) findViewById(R.id.i7);
        iv7 = (ImageView) findViewById(R.id.i8);

        iv.setOnClickListener(this);
        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv4.setOnClickListener(this);
        iv5.setOnClickListener(this);
        iv6.setOnClickListener(this);
        iv7.setOnClickListener(this);


        //  iv.setImageResource(R.drawable.icon);

    }


    @Override
    public void onClick(View v) {

        // Toast.makeText(MainActivity.this, "ok"+""+v.getId(), Toast.LENGTH_SHORT).show();
        Intent i=new Intent(Portfolio.this,GalleryTwo.class);
        startActivity(i);

    }



}
