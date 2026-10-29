package p000;

import ads_mobile_sdk.C0445zl;
import ads_mobile_sdk.lb3;
import ads_mobile_sdk.qr1;
import ads_mobile_sdk.va3;
import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf5 implements ca5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22219a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ lb3 f22220b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ o65 f22221c;

    public /* synthetic */ jf5(byte b) {
        this.f22219a = b;
    }

    @Override // p000.ca5
    /* JADX INFO: renamed from: a */
    public final void mo3625a(Context context) {
        switch (this.f22219a) {
            case 0:
                lb3 lb3Var = this.f22220b;
                qr1 qr1Var = (qr1) this.f22221c;
                if ((context instanceof Activity ? (Activity) context : null) == null) {
                    qr1Var.f9082d.m1247f();
                }
                synchronized (lb3Var) {
                    z62.m13366Y("interstitialAd");
                    throw null;
                }
            case 1:
                lb3 lb3Var2 = this.f22220b;
                va3 va3Var = (va3) this.f22221c;
                if ((context instanceof Activity ? (Activity) context : null) == null) {
                    va3Var.f12663e.m1247f();
                }
                synchronized (lb3Var2) {
                    z62.m13366Y("rewardedAd");
                    throw null;
                }
            default:
                lb3 lb3Var3 = this.f22220b;
                C0445zl c0445zl = (C0445zl) this.f22221c;
                if ((context instanceof Activity ? (Activity) context : null) == null) {
                    c0445zl.f14264d.m1247f();
                }
                synchronized (lb3Var3) {
                    z62.m13366Y("appOpenAd");
                    throw null;
                }
        }
    }
}
