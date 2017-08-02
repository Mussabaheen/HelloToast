    package mussabaheen.example.com.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
         int mCount = 0;
         TextView mShowCount;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mShowCount = (TextView) findViewById(R.id.s1);
        }
        public void countup(View view) {
            mCount++;
            if (mShowCount != null)
                mShowCount.setText(Integer.toString(mCount));
        }

        public void showtoast(View view) {
            Toast toast = Toast.makeText(this, R.string.toast_button_snackbr, Toast.LENGTH_LONG);
            toast.show();

        }
    }