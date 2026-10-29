package p000;

import ads_mobile_sdk.C0307r1;
import ads_mobile_sdk.ry0;
import ads_mobile_sdk.v01;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xe5 extends v01.AbstractC0369a {
    /* JADX INFO: renamed from: c */
    public final void m12679c(String str) {
        Objects.requireNonNull(str);
        d$4();
        C0307r1 c0307r1 = (C0307r1) this.f12554b;
        if (!c0307r1.pools_.m2765d()) {
            c0307r1.pools_ = c0307r1.pools_.m2767f();
        }
        c0307r1.pools_.remove(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m12680d(String str, ry0 ry0Var) {
        Objects.requireNonNull(str);
        d$4();
        C0307r1 c0307r1 = (C0307r1) this.f12554b;
        if (!c0307r1.pools_.m2765d()) {
            c0307r1.pools_ = c0307r1.pools_.m2767f();
        }
        c0307r1.pools_.put(str, ry0Var);
    }

    /* JADX INFO: renamed from: e */
    public final Map m12681e() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((C0307r1) this.f12554b).pools_));
    }
}
