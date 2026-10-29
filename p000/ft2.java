package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ft2 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public boolean f19274o;

    /* JADX INFO: renamed from: p */
    public boolean f19275p;

    /* JADX INFO: renamed from: q */
    public ag1 f19276q;

    /* JADX INFO: renamed from: r */
    public C0910mi f19277r;

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        float f;
        float f2;
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        if (this.f19274o && this.f19275p) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            float fFloatValue = ((Number) this.f19277r.m8328d()).floatValue();
            int iMo4419e0 = db3VarMo5826e.mo4419e0(f62.f18784a);
            f = iMo4419e0 != Integer.MIN_VALUE ? iMo4419e0 * fFloatValue : 0.0f;
            int iMo4419e1 = db3VarMo5826e.mo4419e0(f62.f18785b);
            f2 = iMo4419e1 != Integer.MIN_VALUE ? iMo4419e1 * fFloatValue : 0.0f;
        }
        int i = db3VarMo5826e.f16899a;
        float f3 = (f - f2) * 2.0f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        int iRound = Math.round(f3) + i;
        float f4 = (f2 - f) * 2.0f;
        int iRound2 = Math.round(f4 >= 0.0f ? f4 : 0.0f) + db3VarMo5826e.f16900b;
        m42 m42Var = new m42((byte) 1);
        m42Var.f24638b = db3VarMo5826e;
        m42Var.f24639c = iRound;
        m42Var.f24640d = iRound2;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(iRound, iRound2, w71.f33134a, m42Var);
    }
}
