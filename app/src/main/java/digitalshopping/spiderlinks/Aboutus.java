package digitalshopping.spiderlinks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Aboutus extends AppCompatActivity {
    ViewFlipper viewFlipper,viewFlipper1;
    Animation Fade_in,Fade_out;
    TextView abotext,prictext,misstext,vistext;
    String visiontext="We refers to an Design & Development, ability to anticipate possible future technology and developments with imagination and wisdom.";
    String abouttext="SpiderLink is run under the guidance of a group of experienced directors having years of knowledge in IT & Non-IT. Today an industry leader we specialize in website design, development & Hosting, Mobile & Web App, Digital Marketing. We will lead our clients to success our strategic and goal oriented solutions enable and stay ahead of the competition. Our experts connected to deliver excellent support to our clients by collaborating to develop cms generated responsive any kind of websites.";
    String missiontext="Spider Links is dedicated to delivering the most advanced innovation & technology an asset for your business. We work around you and support 24X7 for the growth of your business.";
    String textprin="We' a 100% Indian owned Hyderabad Website Design & Development company with an unlimited new trends you’re guaranteed to have a unique website you love. Outstanding effective performance and delivery support will be provided as we are 24X7.Best quotation will be provided as per the client requirement";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        viewFlipper=(ViewFlipper)findViewById(R.id.lastViewFipper);
        abotext= (TextView) findViewById(R.id.textabout);
        misstext= (TextView) findViewById(R.id.missiontext);
        vistext= (TextView) findViewById(R.id.visiontext);
        prictext= (TextView) findViewById(R.id.textprin);

        abotext.setText(abouttext);
        prictext.setText(textprin);
        misstext.setText(missiontext);
        vistext.setText(visiontext);


      flipper();
        flipper2();
    }
    public void flipper(){
        viewFlipper1= (ViewFlipper) findViewById(R.id.backViewFipper);

        Fade_in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Fade_out= AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        viewFlipper1.setInAnimation(Fade_in);
        viewFlipper1.setOutAnimation(Fade_out);

        viewFlipper1.setAutoStart(true);
        viewFlipper1.setFlipInterval(3000);
        viewFlipper1.startFlipping();

    }

    public void flipper2(){
        viewFlipper= (ViewFlipper) findViewById(R.id.lastViewFipper);

        Fade_in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Fade_out= AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        viewFlipper.setInAnimation(Fade_in);
        viewFlipper.setOutAnimation(Fade_out);


        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();

    }
}

