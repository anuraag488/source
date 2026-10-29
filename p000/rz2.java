package p000;

import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class rz2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f29744a = {new hh3(rz2.class, "LocalRoute", "getLocalRoute()Landroidx/compose/runtime/ProvidableCompositionLocal;"), new hh3(rz2.class, "LocalNavigator", "getLocalNavigator()Landroidx/compose/runtime/ProvidableCompositionLocal;")};

    /* JADX INFO: renamed from: b */
    public static final C1040pn f29745b = hj0.m6413a();

    /* JADX INFO: renamed from: c */
    public static final C1040pn f29746c = hj0.m6413a();

    /* JADX INFO: renamed from: a */
    public static final xh3 m10508a() {
        return (xh3) f29746c.m9574l(null, f29744a[1]);
    }

    /* JADX INFO: renamed from: b */
    public static final pz2 m10509b(wp1 wp1Var, ir1 ir1Var) {
        Object objM6869O = ir1Var.m6869O();
        Object obj = objM6869O;
        if (objM6869O == ki0.f23136a) {
            pz2 pz2Var = new pz2();
            pz2Var.f28104a = k43.m7398w(wp1Var.invoke());
            pz2Var.f28105b = new LinkedHashMap();
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(pz2Var);
            obj = pz2Var;
        }
        return (pz2) obj;
    }

    /* JADX INFO: renamed from: c */
    public static final C1297wl m10510c(pg0 pg0Var, mi0 mi0Var) {
        pz2 pz2Var = (pz2) ((ir1) mi0Var).m6898k(m10508a());
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        if (objM6869O == ki0.f23136a) {
            objM6869O = lb5.m7942w(r71.f29063a, ir1Var);
            ir1Var.m6905n0(objM6869O);
        }
        C1297wl c1297wl = new C1297wl((byte) 5);
        c1297wl.f33457b = (zo0) objM6869O;
        c1297wl.f33458c = pz2Var;
        c1297wl.f33459d = pg0Var;
        VarHandle.storeStoreFence();
        return c1297wl;
    }
}
