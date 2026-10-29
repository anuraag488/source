package p000;

import ads_mobile_sdk.dk1;
import ads_mobile_sdk.v01;
import ads_mobile_sdk.zm2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rj5 extends v01.AbstractC0369a {
    /* JADX INFO: renamed from: c */
    public final void m10346c(int i) {
        int i2;
        d$4();
        zm2 zm2Var = (zm2) this.f12554b;
        zm2Var.getClass();
        if (i == 6) {
            dk1.m702a();
            throw null;
        }
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = -1;
                break;
            default:
                throw null;
        }
        zm2Var.fillDisabledReason_ = i2;
        zm2Var.bitField0_ |= 4;
    }
}
