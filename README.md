# SwitchButton
自带EmptyView的ListView、ExpandableListView
适用于，空数据时友好提示

## 如何使用：

```xml
	<com.lzc.listviewforempty.widget.XListView
        android:id="@+id/lv"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
	
	<com.lzc.listviewforempty.widget.ExpandListView
        android:id="@+id/lv"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
```


## 设置属性：

```java		
		mXListView.setEmptyViewEnable(true);
//		mXListView.setEmptyView(new CustomView(this));
//		mXListView.setEmptyViewImage(R.drawable.record);
//		mXListView.setEmptyViewText(R.string.app_no_data_tips);
//		mXListView.setEmptyViewText("暂无记录哦");
//		mXListView.setEmptyViewUI(R.drawable.record, R.string.app_no_data_tips);

...
 ![image](https://github.com/mvpleung/ListViewForEmpty/blob/master/ListViewForEmpty/listView.gif)
 ![image](https://github.com/mvpleung/ListViewForEmpty/blob/master/ListViewForEmpty/expandlistView.gif)
