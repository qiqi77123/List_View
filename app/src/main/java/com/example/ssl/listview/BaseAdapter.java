package com.example.ssl.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseAdapter extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listview;
    private List<Map<String,Object>> datalist;
    private MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);

        initData();
        listview = (ListView)findViewById(R.id.list_view);
        adapter = new MyAdapter(this,datalist);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);

    }

    private void initData() {
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"data:"+parent.getItemAtPosition(position)+"\n id:"+id,Toast.LENGTH_LONG).show();

    }
}
