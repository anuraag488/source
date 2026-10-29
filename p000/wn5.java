package p000;

import ads_mobile_sdk.C0200km;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wn5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f33523a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f33524b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C0200km f33525c;

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        bundle.putInt("errorCode", this.f33523a);
        bundle.putString("errorMessage", this.f33524b);
        this.f33525c.onError(bundle);
    }
}
