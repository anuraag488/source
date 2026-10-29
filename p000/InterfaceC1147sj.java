package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: sj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1147sj {
    /* JADX INFO: renamed from: a */
    default nt2 mo2996a(nt2 nt2Var, p91 p91Var, mc1 mc1Var) {
        C1110rj c1110rj = new C1110rj(this, p91Var, mc1Var);
        ji0 ji0Var = new ji0();
        ji0Var.f22297r = c1110rj;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(ji0Var);
    }

    /* JADX INFO: renamed from: b */
    dp4 mo2997b();
}
