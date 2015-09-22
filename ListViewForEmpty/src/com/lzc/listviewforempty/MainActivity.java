package com.lzc.listviewforempty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout);
		ListView mList = (ListView) findViewById(R.id.listView1);
		mList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				switch (position) {
				case 0:
					startActivity(new Intent(MainActivity.this,
							ListViewActivity.class));
					break;

				case 1:
					startActivity(new Intent(MainActivity.this,
							ExpandListViewActivity.class));
					break;
				}
			}
		});
	}
}
