package digitalshopping.spiderlinks;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Contact_activity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Button call,email;

    String co="Digital Online Shopping Pvt Ltd,H.No.6-3-841/46,SRT-45,1st Floor,CIB Colony,Ameerpet,Hyderbad";
    String address[]={"info@spiderlinks.in"};
    Intent sendIntent;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_activity);
        text=(TextView)findViewById(R.id.content);
        text.setText(co);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        call=(Button)findViewById(R.id.call_btn);
        email=(Button)findViewById(R.id.email_btn);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:(+914040211085"));
                startActivity(i);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendIntent=new Intent(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_EMAIL,address);
                sendIntent.putExtra(Intent.EXTRA_SUBJECT,"Please Call Back");
                sendIntent.putExtra(Intent.EXTRA_TEXT,"Hello Sir/Madam\n\n\n\n"+"\n"+"\n"+"\n\n"+"\n"+"\n"+"\n Best regards\n"+"Digital Online Shopping Pvt Ltd,H.No.6-3-841/46,SRT-45,1st Floor,CIB Colony,Ameerpet,Hyderbad");
                sendIntent.setType("text/html");//MIME TYPE

                Intent i1= Intent.createChooser(sendIntent,"select the best");
                startActivity(sendIntent);

            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng hyderabad = new LatLng(17.433435, 78.449355);
        mMap.addMarker(new MarkerOptions().position(hyderabad).title("SpiderLinks Pvt Ltd"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hyderabad, 10));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}

