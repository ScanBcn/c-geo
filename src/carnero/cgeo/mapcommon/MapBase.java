package carnero.cgeo.mapcommon;

import carnero.cgeo.mapinterfaces.ActivityBase;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MapBase {

	ActivityBase mapActivity;
	
	public MapBase(ActivityBase activity) {
		mapActivity = activity;
	}
	
	public Resources getResources() {
		return mapActivity.getResources();
	}
	
	public Activity getActivity() {
		return mapActivity.getActivity();
	}

	public void onCreate(Bundle savedInstanceState) {
		mapActivity.superOnCreate(savedInstanceState);
	}
	
	public void onResume() {
		mapActivity.superOnResume();
	}

	public void onStop() {
		mapActivity.superOnResume();
	}

	public void onPause() {
		mapActivity.superOnResume();
	}

	public void onDestroy() {
		mapActivity.superOnDestroy();
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		return mapActivity.superOnCreateOptionsMenu(menu);
	}

	public boolean onPrepareOptionsMenu(Menu menu) {
		return mapActivity.superOnonPrepareOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		return mapActivity.superOnOptionsItemSelected(item);
	}
	
}
