package in.liquidmetal.joesnotes;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class EditorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.editor, menu);
        return true;
    }
    
}
