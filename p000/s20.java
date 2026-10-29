package p000;

import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s20 implements xq2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0520ca f29826a;

    /* JADX INFO: renamed from: b */
    public final boolean f29827b;

    public s20(InterfaceC0520ca interfaceC0520ca, boolean z) {
        this.f29826a = interfaceC0520ca;
        this.f29827b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s20)) {
            return false;
        }
        s20 s20Var = (s20) obj;
        return z62.m13387o(this.f29826a, s20Var.f29826a) && this.f29827b == s20Var.f29827b;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        Map map = w71.f33134a;
        if (zIsEmpty) {
            return zq2Var.mo3583l0(kl0.m7541k(j), kl0.m7540j(j), map, new C0499bp((byte) 6));
        }
        long j2 = this.f29827b ? j : (-8589934589L) & j;
        byte b = 1;
        if (list.size() == 1) {
            sq2 sq2Var = (sq2) list.get(0);
            sq2Var.mo4423m();
            db3 db3VarMo5826e = sq2Var.mo5826e(j2);
            int iMax = Math.max(kl0.m7541k(j), db3VarMo5826e.f16899a);
            int iMax2 = Math.max(kl0.m7540j(j), db3VarMo5826e.f16900b);
            r20 r20Var = new r20();
            r20Var.f28960a = db3VarMo5826e;
            r20Var.f28961b = sq2Var;
            r20Var.f28962c = zq2Var;
            r20Var.f28963d = iMax;
            r20Var.f28964e = iMax2;
            r20Var.f28965f = this;
            VarHandle.storeStoreFence();
            return zq2Var.mo3583l0(iMax, iMax2, map, r20Var);
        }
        db3[] db3VarArr = new db3[list.size()];
        ol3 ol3Var = new ol3();
        ol3Var.f26851a = kl0.m7541k(j);
        ol3 ol3Var2 = new ol3();
        ol3Var2.f26851a = kl0.m7540j(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sq2 sq2Var2 = (sq2) list.get(i);
            sq2Var2.mo4423m();
            db3 db3VarMo5826e2 = sq2Var2.mo5826e(j2);
            db3VarArr[i] = db3VarMo5826e2;
            ol3Var.f26851a = Math.max(ol3Var.f26851a, db3VarMo5826e2.f16899a);
            ol3Var2.f26851a = Math.max(ol3Var2.f26851a, db3VarMo5826e2.f16900b);
        }
        int i2 = ol3Var.f26851a;
        int i3 = ol3Var2.f26851a;
        C0786j5 c0786j5 = new C0786j5(b);
        c0786j5.f22019b = db3VarArr;
        c0786j5.f22020c = list;
        c0786j5.f22021d = zq2Var;
        c0786j5.f22022e = ol3Var;
        c0786j5.f22023f = ol3Var2;
        c0786j5.f22024g = this;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i2, i3, map, c0786j5);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29827b) + (this.f29826a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f29826a + ", propagateMinConstraints=" + this.f29827b + ")";
    }
}
