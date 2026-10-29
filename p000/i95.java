package p000;

import ads_mobile_sdk.C0147hl;
import ads_mobile_sdk.o93;
import ads_mobile_sdk.wq1;
import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i95 implements ca5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21196a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ o65 f21197b;

    public /* synthetic */ i95(byte b) {
        this.f21196a = b;
    }

    @Override // p000.ca5
    /* JADX INFO: renamed from: a */
    public final void mo3625a(Context context) {
        byte b = this.f21196a;
        o65 o65Var = this.f21197b;
        switch (b) {
            case 0:
                C0147hl c0147hl = (C0147hl) o65Var;
                if ((context instanceof Activity ? (Activity) context : null) == null) {
                    c0147hl.f4512d.m1247f();
                }
                z62.m13366Y("appOpenAd");
                throw null;
            case 1:
                o93 o93Var = (o93) o65Var;
                if ((context instanceof Activity ? (Activity) context : null) == null) {
                    o93Var.f8012e.m1247f();
                }
                z62.m13366Y("rewardedAd");
                throw null;
            default:
                wq1 wq1Var = (wq1) o65Var;
                if ((context instanceof Activity ? (Activity) context : null) == null) {
                    wq1Var.f13043d.m1247f();
                }
                z62.m13366Y("interstitialAd");
                throw null;
        }
    }
}
