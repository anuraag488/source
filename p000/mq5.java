package p000;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mq5 {

    /* JADX INFO: renamed from: d */
    public static final p06 f25150d = p06.m9349q(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* JADX INFO: renamed from: a */
    public Application f25151a;

    /* JADX INFO: renamed from: b */
    public SharedPreferences f25152b;

    /* JADX INFO: renamed from: c */
    public HashSet f25153c;

    /* JADX INFO: renamed from: a */
    public final HashMap m8377a() {
        String string;
        SharedPreferences sharedPreferences = this.f25152b;
        int i = p06.f27266e;
        Set<String> stringSet = sharedPreferences.getStringSet("stored_info", v06.f32295l);
        if (stringSet.isEmpty()) {
            stringSet = f25150d;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.f25151a;
            a52 a52VarM4233a = cy5.m4233a(application, str);
            if (a52VarM4233a == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str)));
            } else {
                Object obj = application.getSharedPreferences(a52VarM4233a.f109a, 0).getAll().get(a52VarM4233a.f110b);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str)));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str)));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }
}
