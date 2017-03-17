package digitalshopping.spiderlinks;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by vidya on 18-12-2016.
 */
public class CustomSwipeAdapter extends PagerAdapter
{
    private int[] img = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p1,R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p1};

    private Context context;
    private LayoutInflater inflater;


    public CustomSwipeAdapter(Context context)
    {
        this.context = context;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (LinearLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.swipe, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv);
        PhotoViewAttacher photoViewAttacher=new PhotoViewAttacher(imageView);
        photoViewAttacher.update();



        imageView.setImageResource(img[position]);

        container.addView(view);



        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout) object);

    }

}
