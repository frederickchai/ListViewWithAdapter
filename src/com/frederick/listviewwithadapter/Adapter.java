package com.frederick.listviewwithadapter;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Adapter extends ArrayAdapter<ListItemClass> {
	
	private ArrayList<ListItemClass> objects;
	public Adapter(Activity act, int resource, ArrayList<ListItemClass> objects) {
      super(act, resource, objects);
      this.objects = objects;
      
	}

	protected void prepareSections(int sectionsNumber) { }
	protected void onSectionAdded(ListItemClass section, int sectionPosition) { }

	@Override 
	  public View getView(int position, View convertView, ViewGroup parent) {
		  View v = convertView;
		  ListItemClass i = objects.get(position);
		  
		  if (i != null) {
			  LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    	 //listview content
			  v = inflater.inflate(R.layout.list_item, null);
			  TextView c_age = (TextView) v.findViewById(R.id.textAge);
			  TextView c_name = (TextView) v.findViewById(R.id.textName);
			  TextView c_lname = (TextView) v.findViewById(R.id.textLname);
			  
			  c_age.setText(String.valueOf(i.getAge()));
			  c_name.setText(i.getName());
			  c_lname.setText(i.getLName());
			  
		  }
		  // the view must be returned to our activity
		  return v;
	  	}
	
}
