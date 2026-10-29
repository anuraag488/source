package p000;

import android.content.Context;

/* JADX INFO: renamed from: lz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0890lz {

    /* JADX INFO: renamed from: a */
    public volatile i50 f24477a;

    /* JADX INFO: renamed from: b */
    public Context f24478b;

    /* JADX INFO: renamed from: c */
    public volatile C1163sz f24479c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f24480d;

    /* JADX INFO: renamed from: a */
    public final boolean m8155a() {
        try {
            Context context = this.f24478b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            qv5.m10141i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }
}
