package com.example.android.data;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.data.model.DataItem;
import com.example.android.data.sample.SampleDataProvider;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @SuppressWarnings("FieldCanBeLocal")
    private TextView tvOut;
    List<DataItem> dataItemList = SampleDataProvider.dataItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DataItem item = new DataItem(null, "My menu item", "a category",
//                "a desctiption", 1, 9.95, "apple_pie.jpg");

        DataItem items = new DataItem(null, "something salad", "this is a salad", "a cat", 3, 9.9, "image");


        tvOut = (TextView) findViewById(R.id.out);
        tvOut.setText("");

        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem o1, DataItem o2) {
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });
        for (DataItem item : dataItemList) {
            tvOut.append(item.getItemName()  +"\n");

        }

    }
}
