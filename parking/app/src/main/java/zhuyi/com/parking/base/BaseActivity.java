package zhuyi.com.parking.base;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import zhuyi.com.parking.R;

/**
 * Created by zhu on 2018/1/5.
 */

public abstract class BaseActivity extends SlidingFragmentActivity {
    @BindView(R.id.title)
    public TextView title;
    @BindView(R.id.toolbar)
    public Toolbar toolbar;

    public Bundle mBundle;


    public static final String TAG = "BaseActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBehindContentView(R.layout.holder_left);
        ButterKnife.bind(this);
        mBundle=savedInstanceState;
        initData();
    }


    protected abstract void initData();
}
