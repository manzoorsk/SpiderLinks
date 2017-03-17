package digitalshopping.spiderlinks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Serv extends AppCompatActivity {

    String cont_head="We will plan your unique brand and business through our experts  and center of everything we do, we will produce our website designing that supports for the growth of your business .We are 24x7 at your serviceWe specialized in WEB DESIGNING/DEVELOPMENT," +
            " APPS, CMS, DIGITAL MARKETING. We built and deliver with new trends, programming and technology which meets the needs of the clients for the growth of their business";
    Button upbutton,downbutton;
    LinearLayout llp,layout_two,layout_one,flip_id;
    TextView t1,t2,t3,t4,t5,t6,serv,cont_text,text_view2;
    static ViewFlipper viewFlipper1,viewFlipper2,viewFlipper3,viewFlipper4,backViewFipper2;
    Animation Fade_in,Fade_out;

    ImageView i;
    static int count =1;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serv);
        cont_text=(TextView)findViewById(R.id.content);
        serv=(TextView)findViewById(R.id.serv);
        llp=(LinearLayout)findViewById(R.id.llp);
         layout_two=(LinearLayout)findViewById(R.id.layout_two);



        upbutton=(Button)findViewById(R.id.upbutton);
        downbutton=(Button)findViewById(R.id.downbutton);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        t5=(TextView)findViewById(R.id.t5);
        t6=(TextView)findViewById(R.id.t6);
        text_view2=(TextView)findViewById(R.id.text_view2);
        viewFlipper1=(ViewFlipper)findViewById(R.id.backViewFipper11);
        viewFlipper2=(ViewFlipper)findViewById(R.id.viewFipper33);
        viewFlipper3=(ViewFlipper)findViewById(R.id.backViewFipper1);
        viewFlipper4=(ViewFlipper)findViewById(R.id.backViewFipper2);


        cont_text.setText(cont_head);
        flipper();
        flipper2();
        flipper3();
        flipper4();
        settext();
//        btnup.setVisibility(View.INVISIBLE);
//
//        flip_id.removeView(viewFlipper3);
//        layout_two.removeView(backViewFipper2);
//       // layout_two.setVisibility(View.INVISIBLE);
//        layout_two.removeView(viewFlipper2);


//        btndwn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                llp.removeView(cont_text);
//                llp.removeView(serv);
//                btndwn.setVisibility(View.INVISIBLE);
//
//                flip_id.addView(viewFlipper3);
//               // layout_two.setVisibility(View.VISIBLE);
//                layout_two.addView(backViewFipper2);
////                flipper2();
////                flipper3();
////                flipper();
//                settext();
//
//                btnup.setVisibility(View.VISIBLE);
//            }
//        });
//


//        btnup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                llp.addView(serv);
//                llp.addView(cont_text);
//                btnup.setVisibility(View.INVISIBLE);
//                btndwn.setVisibility(View.VISIBLE);
//                flip_id.removeView(viewFlipper3);
////                viewFlipper.stopFlipping();
////                viewFlipper2.stopFlipping();
////                viewFlipper2.setVisibility(View.INVISIBLE);
//                //  layout_two.removeView(viewFlipper2);
//                layout_two.removeView(viewFlipper2);
//                layout_two.removeView(backViewFipper1);
//                layout_two.removeView(backViewFipper2);
//
//            }
//        });
        layout_two.removeView(viewFlipper2);
        layout_two.removeView(viewFlipper3);
        layout_two.removeView(viewFlipper4);
        upbutton.setVisibility(View.INVISIBLE);

        downbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upbutton.setVisibility(View.VISIBLE);
                downbutton.setVisibility(View.INVISIBLE);
                llp.removeView(serv);
                llp.removeView(cont_text);
                llp.removeView(viewFlipper1);
                layout_two.addView(viewFlipper2);
                layout_two.addView(viewFlipper3);
                layout_two.addView(viewFlipper4);
            }
        });
        upbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upbutton.setVisibility(View.INVISIBLE);
                downbutton.setVisibility(View.VISIBLE);

                llp.addView(serv);
                llp.addView(cont_text);
                llp.addView(viewFlipper1);
                layout_two.removeView(viewFlipper2);
                layout_two.removeView(viewFlipper3);
                layout_two.removeView(viewFlipper4);

            }
        });

    }

    public void flipper(){

        Fade_in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Fade_out= AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        viewFlipper1.setInAnimation(Fade_in);
        viewFlipper1.setOutAnimation(Fade_out);

        viewFlipper1.setAutoStart(true);
        viewFlipper1.setFlipInterval(3000);
        viewFlipper1.startFlipping();


    }


    public void flipper2(){

        Fade_in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Fade_out= AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        viewFlipper2.setInAnimation(Fade_in);
        viewFlipper2.setOutAnimation(Fade_out);


        viewFlipper2.setAutoStart(true);
        viewFlipper2.setFlipInterval(4000);
        viewFlipper2.startFlipping();

    }
    public void flipper3(){


        Fade_in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Fade_out= AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        viewFlipper3.setInAnimation(Fade_in);
        viewFlipper3.setOutAnimation(Fade_out);


        viewFlipper3.setAutoStart(true);
        viewFlipper3.setFlipInterval(4000);
        viewFlipper3.startFlipping();
    }
    public void flipper4(){


        Fade_in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Fade_out= AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        viewFlipper4.setInAnimation(Fade_in);
        viewFlipper4.setOutAnimation(Fade_out);


        viewFlipper4.setAutoStart(true);
        viewFlipper4.setFlipInterval(4000);
        viewFlipper4.startFlipping();
    }
    public void settext(){
        t1.setText("•\t  STARTUP WEB  SITE DESIGNING\n" +
                "•\t  STATIC WEB  SITE DESIGNING\n" +
                "•\t  RESPONSIVE WEB  SITE DESIGNING\n" +
                "•\t  CUSTOM WEB  SITE DESIGNING\n" +
                "•\t  MOBILE WEB  SITE DESIGNING\n" +
                "•\t  DYNAMIC WEB  SITE DESIGNING\n" +
                "•\t  E-COMMERCE WEB  SITE DESIGNING\n");
        t2.setText("•\t  PHP WEB SITE DEVELOPMENT\n" +
                "•\t  WORD PRESS WEB SITE DEVELOPMENT\n" +
                "•\t  HTML WEB SITE DEVELOPMENT\n" +
                "•\t  JAVA WEB SITE DEVELOPMENT\n" +
                "•\t  .NET WEB SITE DEVELOPMENT\n");
        t3.setText("•\t  B2B PORTAL DEVELOPMENT\n" +
                "•\t  B2C PORTAL DEVELOPMENT\n" +
                "•\t  JOB PORTAL DEVELOPMENT\n" +
                "•\t  TRAVEL PORTAL DEVELOPMENT\n" +
                "•\t  HOTEL PORTAL DEVELOPMENT\n" +
                "•\t  HOSPITAL PORTAL DEVELOPMENT\n" +
                "•\t  REAL ESTATE PORTAL DEVELOPMENT\n");
        t4.setText("\n\n\n•\t  ANDROID APPS DEVELOPMENT\n" +
                "•\t  IOS APPS DEVELOPMENT\n");

        t5.setText("•\t  AFFILIATE MARKETING\n" +
                "•\t  EMAIL MARKETING\n" +
                "•\t  INTERNTET MARKETING\n" +
                "•\t  PAY PER CLICK MARKETING\n" +
                "•\t  ADDWORDS MARKETING\n" +
                "•\t  ANALYSTICS MARKETING\n" +
                "•\t  ADVERTISING MARKETING\n" +
                "•\t  BLOCK AND ARTICLE POSTING\n");
        t6.setText("•\t  SPOKESPERSONS & MODELING\n" +
                "•\t  ANIMATED CHARACTERS\n" +
                "•\t  ANIMATED LOGOS\n" +
                "•\t  WHITEBOARD EXPLAINER VIDEOS\n" +
                "•\t  PROMOTIONAL & BRAND VIDEOS\n");
    }
}

