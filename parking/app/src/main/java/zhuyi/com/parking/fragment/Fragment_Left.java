package zhuyi.com.parking.fragment;

import android.view.LayoutInflater;
import android.view.View;

import zhuyi.com.parking.R;
import zhuyi.com.parking.base.BaseFragment;

/**
 * Created by zhu on 2018/1/5.
 */

public class Fragment_Left extends BaseFragment {


    @Override
    protected View initView() {
        View left = LayoutInflater.from(mActivity).inflate(R.layout.fragment_left, null);
        return left;
    }

    @Override
    protected void initData() {

    }
}
