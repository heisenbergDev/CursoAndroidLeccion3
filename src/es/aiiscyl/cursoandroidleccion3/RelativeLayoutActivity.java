package es.aiiscyl.cursoandroidleccion3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RelativeLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_relative_layout_0);
//		setContentView(R.layout.activity_relative_layout_1);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.relative_layout, menu);
		return true;
	}

}
