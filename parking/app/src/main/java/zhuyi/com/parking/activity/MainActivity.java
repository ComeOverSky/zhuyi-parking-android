package zhuyi.com.parking.activity;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.vondear.rxtools.RxDeviceTool;

import butterknife.BindDrawable;
import butterknife.BindString;
import zhuyi.com.parking.R;
import zhuyi.com.parking.base.BaseActivity;
import zhuyi.com.parking.fragment.Fragment_Content;
import zhuyi.com.parking.fragment.Fragment_Left;

public class MainActivity extends BaseActivity {

    SlidingMenu slidingMenu;
    @BindDrawable(R.drawable.user)
    Drawable user;
    @BindString(R.string.app_name)
    String appName;
    @Override
    protected void initData() {
        initSlidingMenu();
        initToolBar();
        getSupportFragmentManager().beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fr_page,new Fragment_Content());
    }
    private void initSlidingMenu() {
        slidingMenu = getSlidingMenu();
        slidingMenu.setMode(SlidingMenu.LEFT);//设定模式，SlidingMenu在左边
//        slidingMenu.setBehindOffsetRes(RxDeviceTool.getScreenHeights(this)/3);//配置slidingmenu偏移出来的尺寸
        slidingMenu.setBehindWidth(RxDeviceTool.getScreenWidth(this));
        Log.i(TAG, "获取当前屏幕的宽度"+RxDeviceTool.getScreenWidth(this));
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);//全屏都可以拖拽触摸，打开slidingmenu

    }

    private void initToolBar() {
        toolbar.setNavigationIcon(user);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slidingMenu.showMenu();
            }
        });
        title.setText(appName);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fr_page,new Fragment_Left())
                .commit();
    }


}
