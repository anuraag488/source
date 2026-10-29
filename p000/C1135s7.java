package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: s7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1135s7 extends se0 {

    /* JADX INFO: renamed from: u */
    public C1172t7 f29937u;

    /* JADX INFO: renamed from: v */
    public wd3 f29938v;

    /* JADX INFO: renamed from: k0 */
    public static C1135s7 m10545k0(C1172t7 c1172t7, wd3 wd3Var) throws GeneralSecurityException {
        if (c1172t7.f30972a != ((u50) wd3Var.f33259b).f31654a.length) {
            xy4.m12788q("Key size mismatch");
            return null;
        }
        C1135s7 c1135s7 = new C1135s7();
        c1135s7.f29937u = c1172t7;
        c1135s7.f29938v = wd3Var;
        VarHandle.storeStoreFence();
        return c1135s7;
    }

    @Override // p000.se0
    /* JADX INFO: renamed from: B */
    public final t73 mo3664B() {
        return this.f29937u;
    }
}
