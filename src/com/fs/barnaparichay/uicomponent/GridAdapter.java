package com.fs.barnaparichay.uicomponent;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.fs.barnaparichay.R;

public class GridAdapter extends BaseAdapter {

	private Context mContext;
	private ArrayList<Integer> mList;

	public GridAdapter(Context context, ArrayList<Integer> list) {
		mContext = context;
		if (list == null)
			mList = new ArrayList<Integer>();
		else
			mList = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub
		LayoutInflater li = LayoutInflater.from(mContext);
		convertView = li.inflate(R.layout.grid_item, null);
		ImageView iv = (ImageView) convertView.findViewById(R.id.iv_grid_item);
        iv.setImageResource(mList.get(position));
		return convertView;
	}

}
