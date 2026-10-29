package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h61 extends v64 {

    /* JADX INFO: renamed from: u */
    public m61 f20406u;

    /* JADX INFO: renamed from: v */
    public wd3 f20407v;

    /* JADX INFO: renamed from: m0 */
    public static h61 m6235m0(m61 m61Var, wd3 wd3Var) throws GeneralSecurityException {
        u50 u50Var = (u50) wd3Var.f33259b;
        if (u50Var.f31654a.length != 32) {
            throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + u50Var.f31654a.length);
        }
        if (!Arrays.equals(m61Var.f24683v.m11250c(), b61.m3467h(b61.m3463d(u50Var.m11250c())).m7232V())) {
            xy4.m12788q("Ed25519 keys mismatch");
            return null;
        }
        h61 h61Var = new h61();
        h61Var.f20406u = m61Var;
        h61Var.f20407v = wd3Var;
        VarHandle.storeStoreFence();
        return h61Var;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: B */
    public final t73 mo3664B() {
        return this.f20406u.f24682u;
    }

    @Override // p000.v64
    /* JADX INFO: renamed from: l0 */
    public final w64 mo3665l0() {
        return this.f20406u;
    }
}
