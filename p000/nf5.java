package p000;

import ads_mobile_sdk.C0374v9;
import ads_mobile_sdk.ry0;
import ads_mobile_sdk.v01;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nf5 extends v01.AbstractC0369a {
    /* JADX INFO: renamed from: c */
    public final void m8699c(String str) {
        Objects.requireNonNull(str);
        d$4();
        ry0 ry0Var = (ry0) this.f12554b;
        if (!ry0Var.adResponseLists_.m2765d()) {
            ry0Var.adResponseLists_ = ry0Var.adResponseLists_.m2767f();
        }
        ry0Var.adResponseLists_.remove(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m8700d(String str, C0374v9 c0374v9) {
        Objects.requireNonNull(str);
        d$4();
        ry0 ry0Var = (ry0) this.f12554b;
        if (!ry0Var.adResponseLists_.m2765d()) {
            ry0Var.adResponseLists_ = ry0Var.adResponseLists_.m2767f();
        }
        ry0Var.adResponseLists_.put(str, c0374v9);
    }

    /* JADX INFO: renamed from: e */
    public final void m8701e(Map map) {
        d$4();
        ry0 ry0Var = (ry0) this.f12554b;
        if (!ry0Var.adResponseLists_.m2765d()) {
            ry0Var.adResponseLists_ = ry0Var.adResponseLists_.m2767f();
        }
        ry0Var.adResponseLists_.putAll(map);
    }

    /* JADX INFO: renamed from: f */
    public final Map m8702f() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((ry0) this.f12554b).adResponseLists_));
    }
}
