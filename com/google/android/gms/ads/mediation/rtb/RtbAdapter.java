package com.google.android.gms.ads.mediation.rtb;

import p000.AbstractC1171t6;
import p000.bs2;
import p000.ds2;
import p000.fs2;
import p000.gt3;
import p000.r64;
import p000.tr2;
import p000.wr2;
import p000.xr2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class RtbAdapter extends AbstractC1171t6 {
    public abstract void collectSignals(gt3 gt3Var, r64 r64Var);

    public void loadRtbAppOpenAd(wr2 wr2Var, tr2 tr2Var) {
        loadAppOpenAd(wr2Var, tr2Var);
    }

    public void loadRtbBannerAd(xr2 xr2Var, tr2 tr2Var) {
        loadBannerAd(xr2Var, tr2Var);
    }

    public void loadRtbInterscrollerAd(xr2 xr2Var, tr2 tr2Var) {
        loadInterscrollerAd(xr2Var, tr2Var);
    }

    public void loadRtbInterstitialAd(bs2 bs2Var, tr2 tr2Var) {
        loadInterstitialAd(bs2Var, tr2Var);
    }

    public void loadRtbNativeAd(ds2 ds2Var, tr2 tr2Var) {
        loadNativeAd(ds2Var, tr2Var);
    }

    public void loadRtbNativeAdMapper(ds2 ds2Var, tr2 tr2Var) {
        loadNativeAdMapper(ds2Var, tr2Var);
    }

    public void loadRtbRewardedAd(fs2 fs2Var, tr2 tr2Var) {
        loadRewardedAd(fs2Var, tr2Var);
    }

    public void loadRtbRewardedInterstitialAd(fs2 fs2Var, tr2 tr2Var) {
        loadRewardedInterstitialAd(fs2Var, tr2Var);
    }
}
