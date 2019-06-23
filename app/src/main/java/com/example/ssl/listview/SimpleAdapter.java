package com.example.ssl.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapter extends AppCompatActivity {
    private ListView listview;
    private List<Map<String, Object>> datalist;

    public SimpleAdapter(SimpleAdapter simpleAdapter, List<Map<String, Object>> datalist, int list_item,
                         String[] strings, int[] ints) {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        listview = (ListView) findViewById(R.id.list_view);
        initdata();
        SimpleAdapter adapter = new SimpleAdapter(this, datalist, R.layout.list_item,
                new String[]{"img", "title", "price"}, new int[]{R.id.images, R.id.titles, R.id.prices});
        listview.setAdapter((ListAdapter) adapter);


    }

    private void initdata() {
        int[] imgs = {R.drawable.gongbaojiding, R.drawable.shuizhuroupian, R.drawable.suanlajidantang
                , R.drawable.xihucuyu, R.drawable.yuxiangrousi};
        String[] titles = {"宫保鸡丁", "水煮肉片", "酸辣鸡蛋汤", "西湖醋鱼", "鱼香肉丝"};
        String[] prices = {"￥85.5", "￥45.6", "￥21.3", "￥67.1", "￥45.4"};
        datalist = new ArrayList<>();
        for (int i = 0; i < imgs.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("img", imgs[i]);
            map.put("title", titles[i]);
            map.put("price", prices[i]);
            datalist.add(map);
        }
    }
}
