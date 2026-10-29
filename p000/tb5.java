package p000;

import ads_mobile_sdk.mc0;
import ads_mobile_sdk.v01;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tb5 extends v01.AbstractC0369a {
    /* JADX INFO: renamed from: c */
    public final void m11026c(Map map) {
        d$4();
        mc0 mc0Var = (mc0) this.f12554b;
        if (!mc0Var.concatenatedSignalsMap_.m2765d()) {
            mc0Var.concatenatedSignalsMap_ = mc0Var.concatenatedSignalsMap_.m2767f();
        }
        mc0Var.concatenatedSignalsMap_.putAll(map);
    }
}
