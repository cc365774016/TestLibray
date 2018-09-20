package factorgene.hsgene.com.mylibray;//package com.ysy.lifetime.commonutils.util;

import android.content.Context;
import android.widget.Toast;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2016/9/29
 *     desc  : 吐司相关工具类
 * </pre>
 */
public class ToastUtils {

    public static void showShortToast(Context context,String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
    public static void showLongToast(Context context,String text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}