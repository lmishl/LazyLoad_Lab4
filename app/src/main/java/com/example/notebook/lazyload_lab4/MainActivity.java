package com.example.notebook.lazyload_lab4;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {



    ListView listView;
    String[] itemname ={
          //  "wheel",
            "Safari",
            "Camera",
            "Global",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player",
            "Cold War",
            "house",
            "lamp",
            "mobile",
            "paper",
            "wifi",
            "worker"
//            ,
//            "bmw",
//            "kalina",
//            "range"
    };

    int[] imgid={
           // R.drawable.wheel,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.house,
            R.drawable.lamp,
            R.drawable.mobile,
            R.drawable.paper,
            R.drawable.wifi,
            R.drawable.worker
//            ,
//            R.drawable.bmw,
//            R.drawable.kalina,
//            R.drawable.range,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyArrayAdapter adapter=new MyArrayAdapter(this, itemname, imgid);
        listView =(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Selecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
