package p000;

import android.content.Context;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class fw4 {

    /* JADX INFO: renamed from: a */
    public static final long f19356a = ll0.m8016h(0, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    public static final sk3 f19357b;

    static {
        g74 g74Var = g74.f19639c;
        sk3 sk3Var = new sk3();
        VarHandle.storeStoreFence();
        f19357b = sk3Var;
    }

    /* JADX INFO: renamed from: a */
    public static final b12 m5838a(Object obj, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6887e0(1087186730);
        if (obj instanceof b12) {
            b12 b12Var = (b12) obj;
            ir1Var.m6912r(false);
            return b12Var;
        }
        Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
        ir1Var.m6887e0(-1245195153);
        boolean zM6890g = ir1Var.m6890g(context) | ir1Var.m6890g(obj);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            a12 a12Var = new a12(context);
            a12Var.f39c = obj;
            objM6869O = a12Var.m16a();
            ir1Var.m6905n0(objM6869O);
        }
        b12 b12Var2 = (b12) objM6869O;
        ir1Var.m6912r(false);
        ir1Var.m6912r(false);
        return b12Var2;
    }

    /* JADX INFO: renamed from: b */
    public static final b12 m5839b(C0532cm c0532cm, jm0 jm0Var, mi0 mi0Var) {
        Object obj;
        p74 p74Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6887e0(1677680258);
        ir1Var.m6887e0(408306591);
        jm0.f22418cp.getClass();
        boolean zM13387o = z62.m13387o(jm0Var, im0.f21549d);
        i50 i50Var = ki0.f23136a;
        if (zM13387o) {
            p74Var = f19357b;
        } else {
            ir1Var.m6887e0(408309406);
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == i50Var) {
                obj = objM6869O;
                nl0 nl0Var = new nl0();
                nl0Var.f25926a = bc4.m3547a(kl0.m7531a(f19356a));
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(nl0Var);
                obj = nl0Var;
            }
            obj = objM6869O;
            p74Var = (nl0) obj;
            ir1Var.m6912r(false);
        }
        ir1Var.m6912r(false);
        ir1Var.m6887e0(-227066702);
        Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
        ir1Var.m6887e0(408319118);
        boolean zM6890g = ir1Var.m6890g(context) | ir1Var.m6890g(c0532cm) | ir1Var.m6890g(p74Var);
        Object objM6869O2 = ir1Var.m6869O();
        if (zM6890g || objM6869O2 == i50Var) {
            a12 a12Var = new a12(context);
            a12Var.f39c = c0532cm;
            a12Var.f48l = p74Var;
            a12Var.f50n = null;
            a12Var.f51o = null;
            a12Var.f52p = null;
            objM6869O2 = a12Var.m16a();
            ir1Var.m6905n0(objM6869O2);
        }
        b12 b12Var = (b12) objM6869O2;
        ir1Var.m6912r(false);
        ir1Var.m6912r(false);
        ir1Var.m6912r(false);
        return b12Var;
    }
}
