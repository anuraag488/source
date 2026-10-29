package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import p000.C0564d6;
import p000.sy0;
import p000.ur2;
import p000.vr2;
import p000.yr2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
@sy0
public interface MediationBannerAdapter extends vr2 {
    View getBannerView();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, yr2 yr2Var, Bundle bundle, C0564d6 c0564d6, ur2 ur2Var, Bundle bundle2);
}
