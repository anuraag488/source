package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class aa3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f208a = {new hh3(aa3.class, "LocalPermissionEnsurer", "getLocalPermissionEnsurer()Landroidx/compose/runtime/ProvidableCompositionLocal;")};

    /* JADX INFO: renamed from: b */
    public static final C1040pn f209b = hj0.m6413a();

    /* JADX INFO: renamed from: a */
    public static final z93 m154a(String str, String str2, g12 g12Var, wp1 wp1Var, mq1 mq1Var, mi0 mi0Var) {
        wm0 wm0Var = null;
        ir1 ir1Var = (ir1) mi0Var;
        mq1 mq1Var2 = (mq1) ir1Var.m6898k((xh3) f209b.m9574l(null, f208a[0]));
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        Object obj = objM6869O;
        if (objM6869O == i50Var) {
            z93 z93Var = new z93();
            z93Var.f35882b = str;
            z93Var.f35883c = str2;
            z93Var.f35884d = g12Var;
            z93Var.f35885e = mq1Var;
            z93Var.f35886f = wp1Var;
            z93Var.f35887g = mq1Var2;
            z93Var.f35881a = k43.m7398w(null);
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(z93Var);
            obj = z93Var;
        }
        z93 z93Var2 = (z93) obj;
        Integer numValueOf = Integer.valueOf(ba3.f15189a.m132h());
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == i50Var) {
            objM6869O2 = new C0982og((Object) z93Var2, wm0Var, (byte) 18);
            ir1Var.m6905n0(objM6869O2);
        }
        lb5.m7926g(ir1Var, (mq1) objM6869O2, numValueOf);
        return z93Var2;
    }
}
