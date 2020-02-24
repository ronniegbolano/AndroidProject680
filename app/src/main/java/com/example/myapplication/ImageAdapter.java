package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c, String urls[]) {
        mContext = c;
        mThumbIds = urls;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return position;
        //return 0;
    }

    public String getURL(int position){
        return mThumbIds[position];
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.image_view, parent, false);
        imageView = (ImageView) itemView.findViewById(R.id.imageView1);


        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView.setLayoutParams(new GridView.LayoutParams(400, 400));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5, 5, 5, 5);
            imageView.setAdjustViewBounds(true);
        } else {
            imageView = (ImageView) convertView;
        }


        String image = mThumbIds[position];
        image = image.substring(0, image.lastIndexOf('.'));
        int resId = mContext.getResources().getIdentifier(image, "drawable",  mContext.getPackageName());

        Picasso.get()
                .load(resId)
                .fit()
                .into(imageView);

        return imageView;
    }

    //private ArrayList<String> myurls = new ArrayList<String>();

    // references to our images
    private String[] mThumbIds = {

    };
}