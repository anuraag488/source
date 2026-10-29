package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import p000.es2;
import p000.px2;
import p000.sy0;
import p000.vr2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
@sy0
public interface MediationNativeAdapter extends vr2 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, es2 es2Var, Bundle bundle, px2 px2Var, Bundle bundle2);
}
