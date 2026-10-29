package p000;

import ads_mobile_sdk.bp2;
import ads_mobile_sdk.cp2;
import ads_mobile_sdk.v01;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o55 extends v01.AbstractC0369a {
    /* JADX INFO: renamed from: c */
    public final void m8961c(int i) {
        d$4();
        cp2 cp2Var = (cp2) this.f12554b;
        cp2Var.bitField0_ |= 64;
        cp2Var.autoRefreshCount_ = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m8962d(long j) {
        d$4();
        cp2 cp2Var = (cp2) this.f12554b;
        cp2Var.bitField0_ |= 32;
        cp2Var.timeInCacheMs_ = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m8963e(bp2 bp2Var) {
        d$4();
        cp2 cp2Var = (cp2) this.f12554b;
        cp2Var.getClass();
        cp2Var.cacheMissReason_ = bp2Var.getNumber();
        cp2Var.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: f */
    public final void m8964f(boolean z) {
        d$4();
        cp2 cp2Var = (cp2) this.f12554b;
        cp2Var.bitField0_ |= 1;
        cp2Var.cacheHit_ = z;
    }

    /* JADX INFO: renamed from: g */
    public final void m8965g(int i) {
        d$4();
        cp2 cp2Var = (cp2) this.f12554b;
        cp2Var.bitField0_ |= 8;
        cp2Var.numRequestedAds_ = i;
    }
}
