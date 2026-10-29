package p000;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class he6 {

    /* JADX INFO: renamed from: a */
    public static final C0805jo f20522a = new C0805jo(0);

    /* JADX INFO: renamed from: a */
    public static synchronized Uri m6365a() {
        C0805jo c0805jo = f20522a;
        Uri uri = (Uri) c0805jo.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c0805jo.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
