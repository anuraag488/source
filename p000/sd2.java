package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sd2 {

    /* JADX INFO: renamed from: a */
    public HashMap f30180a;

    /* JADX INFO: renamed from: b */
    public byte f30181b;

    /* JADX INFO: renamed from: c */
    public int f30182c;

    /* JADX INFO: renamed from: a */
    public static String m10686a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m10687b(String str) {
        boolean zEquals;
        String strM10686a = m10686a(this.f30182c, "com.crashlytics.version-control-info");
        if (this.f30180a.size() >= this.f30181b && !this.f30180a.containsKey(strM10686a)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + ((int) this.f30181b), null);
            return false;
        }
        String strM10686a2 = m10686a(this.f30182c, str);
        String str2 = (String) this.f30180a.get(strM10686a);
        if (str2 == null) {
            zEquals = strM10686a2 == null;
        } else {
            zEquals = str2.equals(strM10686a2);
        }
        if (zEquals) {
            return false;
        }
        this.f30180a.put(strM10686a, strM10686a2);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m10688c(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strM10686a = m10686a(this.f30182c, str);
                if (this.f30180a.size() < this.f30181b || this.f30180a.containsKey(strM10686a)) {
                    String str2 = (String) entry.getValue();
                    this.f30180a.put(strM10686a, str2 == null ? "" : m10686a(this.f30182c, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + ((int) this.f30181b), null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
