package zhuyi.com.parking.fragment;

import android.view.LayoutInflater;
import android.view.View;

import com.amap.api.maps.MapView;

import butterknife.BindView;
import zhuyi.com.parking.R;
import zhuyi.com.parking.activity.MainActivity;
import zhuyi.com.parking.base.BaseFragment;

/**
 * Created by zhu on 2018/1/5.
 */

public class Fragment_Content extends BaseFragment {
    @BindView(R.id.map)
    MapView map;


    @Override
    protected View initView() {
//        View view = LayoutInflater.from(this.mActivity).inflate(R.layout.fragment_content, null);
//        map = (MapView) view.findViewById(R.id.map);
        MainActivity activity = (MainActivity) this.mActivity;

        map.onCreate(activity.mBundle);
        return LayoutInflater.from(this.mActivity).inflate(R.layout.fragment_content, null);
    }

    @Override
    protected void initData() {

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
