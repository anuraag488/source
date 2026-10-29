package p000;

import ads_mobile_sdk.a51;
import ads_mobile_sdk.h51;
import ads_mobile_sdk.s41;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x95 implements jg5 {
    @Override // p000.jg5
    /* JADX INFO: renamed from: a */
    public final Object mo270a(s41 s41Var, Map map, wm0 wm0Var) {
        boolean zContains = map.keySet().contains("start");
        ju4 ju4Var = ju4.f22634a;
        if (zContains) {
            h51 h51VarM2213b = s41Var.m2213b();
            h51VarM2213b.f4311m.incrementAndGet();
            h51VarM2213b.m1143d();
            return ju4Var;
        }
        if (map.keySet().contains("stop")) {
            h51 h51VarM2213b2 = s41Var.m2213b();
            h51VarM2213b2.f4311m.decrementAndGet();
            h51VarM2213b2.m1143d();
            return ju4Var;
        }
        if (map.keySet().contains("cancel")) {
            h51 h51VarM2213b3 = s41Var.m2213b();
            h51VarM2213b3.f4310l.set(true);
            lb5.m7910S(h51VarM2213b3.f4301c, null, null, new a51(h51VarM2213b3, null, (byte) 2), 3);
            h51VarM2213b3.m1143d();
            ap0 ap0Var = ap0.f14763a;
        }
        return ju4Var;
    }

    @Override // p000.jg5
    /* JADX INFO: renamed from: d */
    public final boolean mo802d() {
        return true;
    }

    @Override // p000.jg5
    /* JADX INFO: renamed from: j */
    public final int mo271j() {
        return 8;
    }
}
