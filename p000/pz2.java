package p000;

import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pz2 {

    /* JADX INFO: renamed from: a */
    public d83 f28104a;

    /* JADX INFO: renamed from: b */
    public LinkedHashMap f28105b;

    /* JADX INFO: renamed from: a */
    public final List m9689a() {
        return (List) this.f28104a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m9690b(kr3 kr3Var, Object obj) {
        this.f28104a.setValue(hb0.m6309U0(m9689a(), kr3Var));
        a70 a70Var = (a70) this.f28105b.remove(kr3Var);
        if (a70Var != null) {
            if (!a70Var.mo112b()) {
                a70Var = null;
            }
            if (a70Var != null) {
                a70Var.resumeWith(obj);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m9691c(kr3 kr3Var, of4 of4Var) {
        this.f28104a.setValue(hb0.m6311W0(m9689a(), kr3Var));
        b70 b70Var = new b70(1, C0006a5.m86x(of4Var));
        b70Var.m3497u();
        C0686gf c0686gf = new C0686gf((byte) 11);
        c0686gf.f19762b = this;
        c0686gf.f19763c = kr3Var;
        VarHandle.storeStoreFence();
        b70Var.m3499w(c0686gf);
        this.f28105b.put(kr3Var, b70Var);
        Object objM3495r = b70Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        return objM3495r;
    }
}
