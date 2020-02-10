package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// TODO: tambahkan callback onStart() di sini
	@Override
	protected void onStart(){
		super.onStart();
		Toast.makeText(this,"App on Start",Toast.LENGTH_SHORT).show();
	}

	// TODO: tambahkan callback onStop() di sini
	@Override
	protected void onStop(){
		super.onStop();
		Toast.makeText(this,"App on Stop",Toast.LENGTH_SHORT).show();
	}
	// TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy()
}
