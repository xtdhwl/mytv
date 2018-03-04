package net.shenru.tv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by xtdhwl on 04/03/2018.
 */

public class TvActivity extends Activity {

    private EditText urlView;
    private Button openView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);
        urlView = findViewById(R.id.urlView);
        openView = findViewById(R.id.openView);
        openView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = urlView.getText().toString();
                SpUtil.putString(TvActivity.this, "url", url);
                Intent it = new Intent(TvActivity.this, TvWebViewActivity.class);
                it.putExtra("url", url);
                startActivity(it);

            }
        });

        urlView.setText(SpUtil.getString(this, "sp", ""));
    }
}
