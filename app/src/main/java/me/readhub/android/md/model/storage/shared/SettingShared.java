package me.readhub.android.md.model.storage.shared;

import android.content.Context;
import android.support.annotation.NonNull;

public final class SettingShared {

    private SettingShared() {}

    private static final String TAG = "SettingShared";

    private static final String KEY_OPEN_ARTICLE_IN_APP = "openArticleInApp";
    private static final String KEY_SHOW_OPEN_ARTICLE_ADVICE = "showOpenArticleAdvice";

    public static boolean isOpenArticleInApp(@NonNull Context context) {
        return context.getSharedPreferences(TAG, Context.MODE_PRIVATE).getBoolean(KEY_OPEN_ARTICLE_IN_APP, true);
    }

    public static void setOpenArticleInApp(@NonNull Context context, boolean enable) {
        context.getSharedPreferences(TAG, Context.MODE_PRIVATE).edit().putBoolean(KEY_OPEN_ARTICLE_IN_APP, enable).apply();
    }

    public static boolean isShowOpenArticleAdvice(@NonNull Context context) {
        return context.getSharedPreferences(TAG, Context.MODE_PRIVATE).getBoolean(KEY_SHOW_OPEN_ARTICLE_ADVICE, true);
    }

    public static void markShowOpenArticleAdvice(@NonNull Context context) {
        context.getSharedPreferences(TAG, Context.MODE_PRIVATE).edit().putBoolean(KEY_SHOW_OPEN_ARTICLE_ADVICE, false).apply();
    }

}
