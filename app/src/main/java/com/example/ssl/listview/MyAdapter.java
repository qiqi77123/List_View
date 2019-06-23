package com.example.ssl.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by ssl on 2019/6/23.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<Map<String,Object>> dataList;
    public MyAdapter(Context context,List<Map<String,Object>> dataList) {
        this.context = context;
        this.dataList = dataList;
    }
    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item,null);
            
            viewHolder.images=(ImageView)convertView.findViewById(R.id.images);
            viewHolder.titles=(TextView)convertView.findViewById(R.id.titles);
            viewHolder.prices=(TextView)convertView.findViewById(R.id.prices);

            convertView.setTag(viewHolder);
            
        }
        else{
            viewHolder=(ViewHolder)convertView.getTag();
        }

        viewHolder.images.setImageResource((int)dataList.get(position).get("imgs"));
        viewHolder.titles.setText((String)dataList.get(position).get("titles"));
        viewHolder.prices.setText((String)dataList.get(position).get("prices"));

        return convertView;
    }

    private class ViewHolder {
        public ImageView images;
        public TextView titles;
        public TextView prices;
    }
}
