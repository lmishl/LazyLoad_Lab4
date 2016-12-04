package com.example.notebook.lazyload_lab4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by NoteBook on 03.12.2016.
 */

public class MyArrayAdapter extends ArrayAdapter {


    private final Activity context;
    private final String[] itemname;
    private final int[] imgid;

    public MyArrayAdapter(Activity context, String[] itemname, int[] imgid) {
        super(context, R.layout.mylist, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {

        View resView;
        if(view == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            resView = inflater.inflate(R.layout.mylist, null, true);
        }
        else {
            resView = view;
        }

            TextView txtTitle = (TextView) resView.findViewById(R.id.item);
            ImageView imageView = (ImageView) resView.findViewById(R.id.icon);
            TextView extratxt = (TextView) resView.findViewById(R.id.textView1);

            txtTitle.setText(itemname[position%itemname.length]);
            imageView.setImageResource(imgid[position%imgid.length]);
            extratxt.setText("Description " + itemname[position%itemname.length]);
            return resView;



    };


    @Override
    public int getCount() {
        if (itemname == null) {
            return 0;
        }
        return itemname.length*20;
    }

    static class ViewHolder {
        private ImageView photo;
        private ProgressBar progress;
    }
}
