package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class p96 {
    /* JADX INFO: renamed from: a */
    public static String m9440a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C0995R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9441b(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("hsdp_feature_cache", 0).edit();
        boolean z = false;
        for (String str : bundle.keySet()) {
            if (str != null && str.startsWith("flag_") && !"last_sync_timestamp".equals(str)) {
                Object obj = bundle.get(str);
                if (obj instanceof Boolean) {
                    editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    editorEdit.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    editorEdit.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    editorEdit.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof String[]) {
                    HashSet hashSet = new HashSet();
                    for (String str2 : (String[]) obj) {
                        if (str2 != null) {
                            hashSet.add(str2);
                        }
                    }
                    editorEdit.putStringSet(str, hashSet);
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    HashSet hashSet2 = new HashSet();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        Object obj2 = arrayList.get(i);
                        if (obj2 instanceof String) {
                            hashSet2.add((String) obj2);
                        }
                    }
                    editorEdit.putStringSet(str, hashSet2);
                } else if (obj instanceof String) {
                    editorEdit.putString(str, (String) obj);
                }
                z = true;
            }
        }
        if (z) {
            editorEdit.putLong("last_sync_timestamp", System.currentTimeMillis());
            editorEdit.apply();
            Log.i("HsdpFeatureCache", "Saved HSDP flags from bundle.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9442c(Context context, String str) {
        long j;
        SharedPreferences sharedPreferences = context.getSharedPreferences("hsdp_feature_cache", 0);
        try {
            j = sharedPreferences.getLong("last_sync_timestamp", 0L);
        } catch (ClassCastException e) {
            Log.w("HsdpFeatureCache", "Corrupted last sync timestamp in cache.", e);
            j = 0;
        }
        if (j != 0) {
            try {
                if (!sharedPreferences.getBoolean(str, false)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis >= j && jCurrentTimeMillis - j <= 14400000) {
                        return false;
                    }
                }
            } catch (ClassCastException e2) {
                Log.w("HsdpFeatureCache", "Feature key '" + str + "' is not a boolean in cache.", e2);
                return true;
            }
        }
        return true;
    }
}
