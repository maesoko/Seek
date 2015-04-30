package jp.ac.it_college.std.seek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridItemAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private int[] itemResNumbers;

    private static class ViewHolder {
        public ImageView imageView;
    }

    public GridItemAdapter(Context context) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        GridItemData gridItemData = new GridItemData();
        itemResNumbers = gridItemData.getItemResNumbers();
    }

    @Override
    public int getCount() {
        return itemResNumbers.length;
    }

    @Override
    public Object getItem(int position) {
        return itemResNumbers[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.grid_item, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView)convertView.findViewById(R.id.itemImageView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.imageView.setImageResource(itemResNumbers[position]);

        return convertView;
    }

}
