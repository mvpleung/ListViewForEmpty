package com.lzc.listviewforempty;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.lzc.listviewforempty.widget.XListView;

public class ListViewActivity extends Activity {

	XListView mXListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout1);
		mXListView = (XListView) findViewById(R.id.lv);
		
		
		mXListView.setEmptyViewEnable(true);
//		mXListView.setEmptyView(new CustomView(this));
//		mXListView.setEmptyViewImage(R.drawable.record);
//		mXListView.setEmptyViewText(R.string.app_no_data_tips);
//		mXListView.setEmptyViewText("暂无记录哦");
//		mXListView.setEmptyViewUI(R.drawable.record, R.string.app_no_data_tips);
	}

	public void notify(View mView) {
		mXListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.index_list)));
	}
}
