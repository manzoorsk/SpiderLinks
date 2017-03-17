package digitalshopping.spiderlinks;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    static TextView tv;
    ScaleGestureDetector scaleGestureDetector;
    String spidertext="SpiderLink is run under the guidance of a group of experienced directors having years of knowledge in IT & Non-IT. Today an industry leader we specialize in web site design, development & Hosting, Mobile & Web App, Digital Marketing. We will lead our clients to success our strategic & goal oriented solutions enable & stay ahead of the competition. Our experts connected to deliver excellent support to our clients by collaborating to develop cms generated responsive any kind of websites. ";
    Button about,service,gallery,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        tv= (TextView) findViewById(R.id.tv1);
        about= (Button) findViewById(R.id.about_btn);
        service= (Button) findViewById(R.id.serv_btn);
        gallery= (Button) findViewById(R.id.gallary);
        contact= (Button) findViewById(R.id.contact);

        tv.setText(spidertext);
        scaleGestureDetector=new ScaleGestureDetector(this,new OnTouch());

        tv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getPointerCount() == 1) {
                    //stuff for 1 pointer
                } else { //when 2 pointers are present
                    switch (motionEvent.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            // Disallow ScrollView to intercept touch events.
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                            scaleGestureDetector.onTouchEvent(motionEvent);
                            break;

                        case MotionEvent.ACTION_MOVE:
                            // Disallow ScrollView to intercept touch events.
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                            scaleGestureDetector.onTouchEvent(motionEvent);
                            break;

                        case MotionEvent.ACTION_UP:
                            // Allow ScrollView to intercept touch events.
                            view.getParent().requestDisallowInterceptTouchEvent(false);
                            break;
                    }

                }
                return true;
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomePage.this,Aboutus.class);
                startActivity(intent);

            }
        });
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HomePage.this,Serv.class);
                startActivity(intent);
            }

        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HomePage.this,Portfolio.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HomePage.this,Contact_activity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder ad=new AlertDialog.Builder(this);
        ad.setView(R.layout.backpress);
        ad.setPositiveButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        ad.setNegativeButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        ad.setCancelable(false);
        ad.show();

    }

}

