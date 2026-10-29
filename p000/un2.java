package p000;

import java.lang.invoke.VarHandle;
import java.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class un2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f32012a = {new hh3(un2.class, "LocalLogcatState", "getLocalLogcatState()Landroidx/compose/runtime/ProvidableCompositionLocal;")};

    /* JADX INFO: renamed from: b */
    public static final C1040pn f32013b = hj0.m6413a();

    /* JADX INFO: renamed from: c */
    public static final DateTimeFormatter f32014c = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    /* JADX INFO: renamed from: a */
    public static final void m11586a(int i, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-635410547);
        if (ir1Var.m6871T(i & 1, i != 0)) {
            xj3 xj3Var = ((tn2) ir1Var.m6898k((xh3) f32013b.m9574l(null, f32012a[0]))).f31260a;
            sw2 sw2VarM10028l = qq2.m10028l(xj3Var, xj3Var.getValue(), ir1Var, 0, 0);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = k43.m7398w(new xk4(7, 0L, (String) null));
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) objM6869O;
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                ld1 ld1Var = new ld1((byte) 2);
                ld1Var.f23961b = sw2VarM10028l;
                ld1Var.f23962c = sw2Var;
                VarHandle.storeStoreFence();
                objM6869O2 = s94.m10566b(ld1Var);
                ir1Var.m6905n0(objM6869O2);
            }
            xb4 xb4Var = (xb4) objM6869O2;
            vf1 vf1Var = n74.f25506c;
            Object objM6869O3 = ir1Var.m6869O();
            Object obj = objM6869O3;
            if (objM6869O3 == i50Var) {
                na1 na1Var = new na1((byte) 11);
                na1Var.f25596c = sw2Var;
                na1Var.f25595b = xb4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(na1Var);
                obj = na1Var;
            }
            AbstractC0647fd.m5668f(vf1Var, "Logcat", false, null, (yp1) obj, ir1Var, 24630, 12);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            en0 en0Var = new en0((byte) 24);
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = en0Var;
        }
    }
}
