package com.fs.barnaparichay;

import java.util.Locale;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.fs.barnaparichay.uicomponent.GridAdapter;
import com.fs.barnaparichay.util.Util;

public class MainActivity extends Activity implements
		TextToSpeech.OnInitListener,OnItemClickListener {
	private GridView gv;
	private GridAdapter mAdapter;
	private TextToSpeech tts;
	private String textToSpeech;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tts = new TextToSpeech(this, this);
		initUi();
	}

	private void initUi() {
		gv = (GridView) findViewById(R.id.gv_activity_main);
		mAdapter = new GridAdapter(this, Util.getImageList());
		gv.setAdapter(mAdapter);
		gv.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onInit(int status) {
		// TODO Auto-generated method stub
		if (status == TextToSpeech.SUCCESS) {

			int result = tts.setLanguage(Locale.US);

			if (result == TextToSpeech.LANG_MISSING_DATA
					|| result == TextToSpeech.LANG_NOT_SUPPORTED) {
				Log.e("TTS", "This Language is not supported");
			} else {

				speakOut();
			}

		} else {
			Log.e("TTS", "Initilization Failed!");
		}
	}

	private void speakOut() {
		tts.speak(textToSpeech, TextToSpeech.QUEUE_FLUSH, null);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		// TODO Auto-generated method stub
		/*textToSpeech = Util.getTTSText(position);
		speakOut();*/
		MediaPlayer mPlayer;
		switch (position) {
		case 0:
			mPlayer = MediaPlayer.create(this, R.raw.01);
			break;

		default:
			break;
		}
		
        mPlayer.start();

	}

}
