package zz.example.myapplication;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    private int i ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=3;
        final String ifkas = "ifkas";
        getContentResolver().acquireContentProviderClient(Uri.parse(ifkas));
    }
//  (byte,short,int,long,char,float,double,boolean)
    @Override
    protected void onDestroy() {
        super.onDestroy();
        i=4;
//        BitmapFactory.decodeStream(cr.openInputStream(uri), null, options);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}
