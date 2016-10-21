package com.traciing.common;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Author: Carl_yang on 2016/10/21
 * Email : 464479297@qq.com
 */
public class TextViewFronts extends TextView {

    private String mCurrentText;

    public TextViewFronts(Context context) {
        super(context);
    }

    public TextViewFronts(Context context, AttributeSet attrs) {
        super(context,attrs);
        setTextSize(55);
        mCurrentText = getText().toString();
    }

    /**
     * 文本变更
     * @param order 指令 1 颜色 2字体 3字体大小
     * @param str 需要变更的字符串
     * @param code 变更的参数
     * @return
     */
    public TextViewFronts findAndSetStrColor(int order, String str, String code) {
        System.out.println("----------------"+order);
        if (!TextUtils.isEmpty(mCurrentText)) {
            switch (order) {
                //color
                case 1:
                    mCurrentText = mCurrentText.replaceAll(str, color(code, str));
                    break;
                //字体
                case 2:
                    mCurrentText = mCurrentText.replaceAll(str, special(code, str));
                    break;
                //size
                case 3:
                    mCurrentText = mCurrentText.replaceAll(str, size(code, str));
                    break;
            }
            setText(Html.fromHtml(mCurrentText));
        }
        return this;
    }

    /**
     * 改变文本中字符串的颜色
     *
     * @param colorCode
     * @param str
     * @return
     */
    private String color(String colorCode, String str) {
        return "<font color=\"" + colorCode + "\">" + str + "</font>";
    }

    /**
     * 改变文本中字符串的字体
     * @param specialCode
     * @param str      //srong 字体加粗 u 下划线 i斜体 tt创建打字机风格的字体
     * @return
     */
    private String special(String specialCode, String str) {
        return "<font><"+specialCode+">" + str + "</"+specialCode+"></font>";
    }

    /**
     * 改变文本中字符串的字体大小，目前html中不支持front中的size和style 暂时用big和small代替。
     *
     * @param sizeCode
     * @param str  例:big small
     * @return
     */
    private String size(String sizeCode, String str) {
//        return "<p style=\"font-size:"+sizeCode+"\"></p>";
//        return  "<p style=\"font-size:5px\">This</p>";
//        return "<font size=\"" + sizeCode + "\">" + str + "</font>";
        return "<font><"+sizeCode+">" + str + "</"+sizeCode+"></font>";
    }
}
