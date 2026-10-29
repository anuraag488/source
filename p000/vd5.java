package p000;

import ads_mobile_sdk.C0282p9;
import ads_mobile_sdk.dk1;
import ads_mobile_sdk.v01;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vd5 extends v01.AbstractC0369a {
    /* JADX INFO: renamed from: c */
    public final void m11816c(int i) {
        d$4();
        C0282p9 c0282p9 = (C0282p9) this.f12554b;
        c0282p9.getClass();
        if (i == 4) {
            dk1.m702a();
            throw null;
        }
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            if (i == 3) {
                i2 = 2;
            } else {
                if (i != 4) {
                    throw null;
                }
                i2 = -1;
            }
        }
        c0282p9.status_ = i2;
        c0282p9.bitField0_ |= 8;
    }
}
