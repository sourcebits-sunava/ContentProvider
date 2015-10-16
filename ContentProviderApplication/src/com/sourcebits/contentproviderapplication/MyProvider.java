package com.sourcebits.contentproviderapplication;

import java.util.ArrayList;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

public class MyProvider extends ContentProvider {
	ArrayList<Collection1> arrayList = new ArrayList<Collection1>();
	Collection1 collect1 = new Collection1(1, "Moon");
	Collection1 collect2 = new Collection1(1, "Sun");
	Collection1 collect3 = new Collection1(1, "Earth");
	static final String PROVIDER_NAME = "com.sourcebits.contentproviderapplication";

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		int i = Integer.parseInt(selection.trim());
		arrayList.remove(i);

		System.out.println("ondelete on position" + i);
		return 0;
	}

	@Override
	public String getType(Uri uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onCreate() {
		arrayList.add(collect1);
		arrayList.add(collect2);
		arrayList.add(collect3);
		Log.i("OnCreate", "oncreate is created");
		System.out.println("Oncreate");

		return false;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		for (int i = 0; i < arrayList.size(); ++i) {
			System.out.println(arrayList.get(i).getId() + "     "
					+ arrayList.get(i).getName());
		}
		return null;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {

		return 0;
	}

}
