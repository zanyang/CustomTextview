package com.example.weiget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.textview.R;


/**
 * <pre>
 *     author : lzy
 *     e-mail : zanyang.lin@newbeeair.com
 *     time   : 2017/05/08
 *     desc   :
 * </pre>
 */

public class CustomTextView extends LinearLayout {
    private TextView tv;
    private TextView tvText;

    public CustomTextView(Context context) {
        this(context, null);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }


    private void initView(Context context) {

        LayoutInflater.from(context).inflate(R.layout.custom_textview_layout, this, true);
        tv = (TextView) findViewById(R.id.tv_pm25);
        tvText = (TextView) findViewById(R.id.tv_text);
    }

    public void setText(String text) {
        tv.setText(text);
    }

    public void setTextSize(float size) {
        tv.setTextSize(size);
        tvText.setTextSize(size);
    }

}
