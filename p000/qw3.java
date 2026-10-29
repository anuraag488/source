package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qw3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f28850a = {new hh3(qw3.class, "LocalScope", "getLocalScope()Landroidx/compose/runtime/ProvidableCompositionLocal;"), new hh3(qw3.class, "LocalAppScope", "getLocalAppScope()Landroidx/compose/runtime/ProvidableCompositionLocal;")};

    /* JADX INFO: renamed from: b */
    public static final C1040pn f28851b = hj0.m6413a();

    /* JADX INFO: renamed from: c */
    public static final C1040pn f28852c = hj0.m6413a();

    /* JADX INFO: renamed from: d */
    public static final Object f28853d = new Object();

    /* JADX INFO: renamed from: a */
    public static final xh3 m10145a() {
        return (xh3) f28852c.m9574l(null, f28850a[1]);
    }

    /* JADX INFO: renamed from: b */
    public static final xh3 m10146b() {
        return (xh3) f28851b.m9574l(null, f28850a[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, ow3] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX INFO: renamed from: c */
    public static final Object m10147c(Object[] objArr, mw3 mw3Var, wp1 wp1Var, mi0 mi0Var, int i) {
        if ((i & 4) != 0) {
            mw3Var = (mw3) ((ir1) mi0Var).m6898k(m10146b());
        }
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(1614254535);
        long j = ir1Var.f21683T;
        ir1Var.m6912r(false);
        Long lValueOf = Long.valueOf(j);
        boolean zM6890g = ((ir1) mi0Var).m6890g(mw3Var);
        ir1 ir1Var2 = (ir1) mi0Var;
        boolean zM6890g2 = zM6890g | ir1Var2.m6890g(lValueOf);
        Object objM6869O = ir1Var2.m6869O();
        Object obj = f28853d;
        if (zM6890g2 || objM6869O == ki0.f23136a) {
            Object obj2 = mw3Var.f25263a.get(lValueOf);
            ?? ow3Var = obj2;
            if (obj2 == null) {
                ow3Var = obj;
            }
            if (ow3Var == obj) {
                ow3Var = new ow3();
                ow3Var.f27176a = obj;
                mw3Var.f25263a.put(lValueOf, ow3Var);
            }
            objM6869O = (ow3) ow3Var;
            ir1Var2.m6905n0(objM6869O);
        }
        ow3 ow3Var2 = (ow3) objM6869O;
        ql3 ql3Var = new ql3();
        Object obj3 = Arrays.equals(objArr, ow3Var2.f27177b) ? ow3Var2.f27176a : obj;
        ql3Var.f28555a = obj3;
        if (obj3 == obj) {
            ql3Var.f28555a = wp1Var.invoke();
        }
        C1048pv c1048pv = new C1048pv((byte) 15);
        c1048pv.f28016b = ow3Var2;
        c1048pv.f28017c = ql3Var;
        c1048pv.f28018d = objArr;
        VarHandle.storeStoreFence();
        lb5.m7914W(ir1Var2, c1048pv);
        return ql3Var.f28555a;
    }

    /* JADX INFO: renamed from: d */
    public static final pw3 m10148d(mi0 mi0Var) {
        mw3 mw3Var = (mw3) ((ir1) mi0Var).m6898k(m10146b());
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        byte b = 2;
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = new nu3(b);
            ir1Var.m6905n0(objM6869O);
        }
        wp1 wp1Var = (wp1) objM6869O;
        ro0 ro0Var = ((ir1) mi0Var).f21681R;
        Object[] objArr = new Object[0];
        ir1 ir1Var2 = (ir1) mi0Var;
        boolean zM6894i = ir1Var2.m6894i(ro0Var) | ir1Var2.m6890g(wp1Var);
        Object objM6869O2 = ir1Var2.m6869O();
        Object obj = objM6869O2;
        if (zM6894i || objM6869O2 == i50Var) {
            jp1 jp1Var = new jp1((byte) 16);
            jp1Var.f22485b = ro0Var;
            jp1Var.f22486c = wp1Var;
            VarHandle.storeStoreFence();
            ir1Var2.m6905n0(jp1Var);
            obj = jp1Var;
        }
        return (pw3) m10147c(objArr, mw3Var, (wp1) obj, mi0Var, 2);
    }
}
