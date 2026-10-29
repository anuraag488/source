package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class h44 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f20386a = {new hh3(h44.class, "LocalSettings", "getLocalSettings()Landroidx/compose/runtime/ProvidableCompositionLocal;")};

    /* JADX INFO: renamed from: b */
    public static final C1040pn f20387b = hj0.m6413a();

    /* JADX INFO: renamed from: a */
    public static final xh3 m6217a() {
        return (xh3) f20387b.m9574l(null, f20386a[0]);
    }

    /* JADX INFO: renamed from: b */
    public static final g44 m6218b(String str, wp1 wp1Var, a44 a44Var, wp1 wp1Var2, mi0 mi0Var) {
        Object obj;
        boolean zM6890g = ((ir1) mi0Var).m6890g(a44Var);
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            obj = objM6869O;
            sw2 sw2VarMo44a = a44Var.mo44a(str, (jc2) wp1Var.invoke());
            g44 g44Var = new g44();
            g44Var.f19611a = sw2VarMo44a;
            g44Var.f19612b = wp1Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(g44Var);
            obj = g44Var;
        }
        obj = objM6869O;
        return (g44) obj;
    }

    /* JADX INFO: renamed from: c */
    public static final tt2 m6219c(String str, Object obj, jc2 jc2Var) {
        tt2 tt2Var = new tt2((byte) 12, false);
        tt2Var.f31428b = str;
        tt2Var.f31429c = jc2Var;
        tt2Var.f31430d = obj;
        VarHandle.storeStoreFence();
        return tt2Var;
    }
}
