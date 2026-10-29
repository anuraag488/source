package p000;

import ads_mobile_sdk.dk1;
import ads_mobile_sdk.v01;
import ads_mobile_sdk.v81;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bh5 extends v01.AbstractC0369a {
    /* JADX INFO: renamed from: c */
    public final void m3594c(String str) {
        d$4();
        ((v81) this.f12554b).m2540b(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m3595d(int i) {
        int i2;
        d$4();
        v81 v81Var = (v81) this.f12554b;
        v81Var.getClass();
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
        v81Var.action_ = i2;
    }
}
