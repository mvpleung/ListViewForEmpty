package com.lzc.listviewforempty;

import android.app.Activity;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ExpandableListAdapter;
import android.widget.TextView;

import com.lzc.listviewforempty.widget.ExpandListView;

public class ExpandListViewActivity extends Activity {

	ExpandListView mXListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout2);
		mXListView = (ExpandListView) findViewById(R.id.lv);
		mXListView.setEmptyViewEnable(true);
	}

	public void notify(View mView) {
		mXListView.setAdapter(new ExpandableListAdapter() {

			@Override
			public void unregisterDataSetObserver(DataSetObserver observer) {
				// TODO Auto-generated method stub

			}

			@Override
			public void registerDataSetObserver(DataSetObserver observer) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onGroupExpanded(int groupPosition) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onGroupCollapsed(int groupPosition) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isChildSelectable(int groupPosition,
					int childPosition) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean hasStableIds() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public View getGroupView(int groupPosition, boolean isExpanded,
					View convertView, ViewGroup parent) {
				if (convertView == null) {
					TextView mView = new TextView(ExpandListViewActivity.this);
					mView.setTextColor(Color.BLACK);
					mView.setText("This is Parent");
					mView.setLayoutParams(new AbsListView.LayoutParams(
							AbsListView.LayoutParams.MATCH_PARENT, 100));
					mView.setBackgroundColor(Color.parseColor("#ff0000"));
					convertView = mView;
				}
				return convertView;
			}

			@Override
			public long getGroupId(int groupPosition) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getGroupCount() {
				// TODO Auto-generated method stub
				return 3;
			}

			@Override
			public Object getGroup(int groupPosition) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public long getCombinedGroupId(long groupId) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public long getCombinedChildId(long groupId, long childId) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getChildrenCount(int groupPosition) {
				// TODO Auto-generated method stub
				return 2;
			}

			@Override
			public View getChildView(int groupPosition, int childPosition,
					boolean isLastChild, View convertView, ViewGroup parent) {
				if (convertView == null) {
					TextView mView = new TextView(ExpandListViewActivity.this);
					mView.setTextColor(Color.BLACK);
					mView.setText("This is Child");
					mView.setBackgroundColor(Color.GREEN);
					convertView = mView;
				}
				return convertView;
			}

			@Override
			public long getChildId(int groupPosition, int childPosition) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Object getChild(int groupPosition, int childPosition) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean areAllItemsEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
		});
	}
}
