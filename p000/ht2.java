package p000;

import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ht2 extends mt2 implements bj0, lf2 {

    /* JADX INFO: renamed from: o */
    public LinkedHashMap f20846o;

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        float f = ((p11) sj3.m10825u(this, f62.f18786c)).f27285a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        boolean z = this.f25208n && !Float.isNaN(f) && p11.m9351b(f, 0.0f) > 0;
        int iMo3579U = !Float.isNaN(f) ? zq2Var.mo3579U(f) : 0;
        int iMax = db3VarMo5826e.f16899a;
        if (z) {
            iMax = Math.max(iMax, iMo3579U);
        }
        int iMax2 = db3VarMo5826e.f16900b;
        if (z) {
            iMax2 = Math.max(iMax2, iMo3579U);
        }
        byte b = 2;
        if (z) {
            LinkedHashMap linkedHashMap = this.f20846o;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f20846o = linkedHashMap;
            }
            tx4 tx4Var = f62.f18785b;
            int iRound = Math.round((iMo3579U - db3VarMo5826e.f16899a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(tx4Var, Integer.valueOf(iRound));
            dx1 dx1Var = f62.f18784a;
            int iRound2 = Math.round((iMo3579U - db3VarMo5826e.f16900b) / 2.0f);
            linkedHashMap.put(dx1Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.f20846o;
        if (map == null) {
            map = w71.f33134a;
        }
        m42 m42Var = new m42(b);
        m42Var.f24639c = iMax;
        m42Var.f24638b = db3VarMo5826e;
        m42Var.f24640d = iMax2;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(iMax, iMax2, map, m42Var);
    }
}
