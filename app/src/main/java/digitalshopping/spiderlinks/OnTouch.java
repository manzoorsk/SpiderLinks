package digitalshopping.spiderlinks;

import android.util.Log;
import android.util.TypedValue;
import android.view.ScaleGestureDetector;

/**
 * Created by vidya on 18-12-2016.
 */
public class OnTouch extends ScaleGestureDetector.SimpleOnScaleGestureListener{
    private float safe;
    @Override
    public boolean onScale(ScaleGestureDetector detector) {

        // TODO Auto-generated method stub
        float size = HomePage.tv.getTextSize();
        //  float size2=MainActivity.scaleGesture1.getTextSize();
        Log.d("TextSizeStart", String.valueOf(size));

        //float factor = detector.getScaleFactor();
        float factor = Math.max(0.5f, Math.min(detector.getScaleFactor(), 2f));
        Log.d("Factor", String.valueOf(factor));


        float product = size*factor;
        //  float product2= size2*factor;
        Log.d("TextSize", String.valueOf(product));

        safe = Math.abs(product - size);
        // safe2 =Math.abs(product2-size2);


        if(product <= 100 && product >= 20 && safe < 3){
            //tv.setText("factor= " +factor + "\n" +  "product = \n" + size + " * " + factor + " \n= " + product +"\n" + getString(R.string.hello_world));
            HomePage.tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, product);
        }

//
        //       if(product2 <= 100 && product2 >= 20 && safe2 < 2){
//            //tv.setText("factor= " +factor + "\n" +  "product = \n" + size + " * " + factor + " \n= " + product +"\n" + getString(R.string.hello_world));
//            MainActivity.scaleGesture1.setTextSize(TypedValue.COMPLEX_UNIT_PX, product2);
        //   }
        size = HomePage.tv.getTextSize();
        Log.d("TextSizeEnd", String.valueOf(size));
        return true;
    }
}
