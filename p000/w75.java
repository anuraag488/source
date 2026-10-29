package p000;

import ads_mobile_sdk.C0123ft;
import ads_mobile_sdk.v01;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w75 extends v01.AbstractC0369a {
    /* JADX INFO: renamed from: c */
    public final void m12153c(Map map) {
        d$4();
        C0123ft c0123ft = (C0123ft) this.f12554b;
        if (!c0123ft.serverParameters_.m2765d()) {
            c0123ft.serverParameters_ = c0123ft.serverParameters_.m2767f();
        }
        c0123ft.serverParameters_.putAll(map);
    }
}
