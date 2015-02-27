package com.frederick.listviewwithadapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	private List<ListItemClass> itemList;
	private ArrayAdapter<ListItemClass> mAdapter;
	private ListView list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		list = (ListView) findViewById(R.id.list);
		itemList = new ArrayList<ListItemClass>();
		initializeAdapter();
	}

	
	private void initializeAdapter() {
		
		// fill the list
		ListItemClass item1 = new ListItemClass("Elza","Pato",20);
		ListItemClass item2 = new ListItemClass("Elza","Peroco",20);
		ListItemClass item3 = new ListItemClass("Elza","Muro",20);
		ListItemClass item4 = new ListItemClass("Elza","Dico",20);
		
		// add to array
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		
		mAdapter = new Adapter(MainActivity.this, android.R.layout.simple_list_item_1, (ArrayList<ListItemClass>) itemList);
		list.setAdapter(mAdapter);
		
	} 
}
