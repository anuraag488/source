package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class hz5 {
    /* JADX INFO: renamed from: a */
    public static Intent m6532a(String str, String str2, Map map) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    builderAppendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6533b() {
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    /* JADX INFO: renamed from: c */
    public static Intent m6534c(String str, String str2, String str3, Map map) {
        String str4;
        Intent intent = new Intent("android.intent.action.VIEW", m6535d(str, str2, map));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        if (map != null && (str4 = (String) map.get("catalog_token")) != null) {
            intent.putExtra("catalog_token", str4);
        }
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    /* JADX INFO: renamed from: d */
    public static Uri m6535d(String str, String str2, Map map) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("d").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    builderAppendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        return builderAppendQueryParameter.build();
    }
}
