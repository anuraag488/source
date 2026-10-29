package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ul4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31972a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wl4 f31973b;

    /* JADX WARN: Code duplicated, block: B:23:0x00c6  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        ky0 ky0Var;
        jl4 jl4Var;
        byte b = this.f31972a;
        jl4 jl4Var2 = null;
        boolean z = true;
        wl4 wl4Var = this.f31973b;
        switch (b) {
            case 0:
                List list = (List) obj;
                q73 q73VarM12325O0 = wl4Var.m12325O0();
                xl4 xl4VarM12709e = xl4.m12709e(wl4Var.f33471p, pb0.f27501h, 0L, null, null, 0L, 0, 0L, 16777214);
                df2 df2Var = q73VarM12325O0.f28259o;
                if (df2Var == null || (ky0Var = q73VarM12325O0.f28253i) == null) {
                    jl4Var = null;
                } else {
                    C0875lk c0875lk = new C0875lk(q73VarM12325O0.f28245a);
                    if (q73VarM12325O0.f28254j == null || q73VarM12325O0.f28258n == null) {
                        jl4Var = null;
                    } else {
                        long j = q73VarM12325O0.f28260p & (-8589934589L);
                        int i = q73VarM12325O0.f28250f;
                        boolean z2 = q73VarM12325O0.f28249e;
                        int i2 = q73VarM12325O0.f28248d;
                        am1 am1Var = q73VarM12325O0.f28247c;
                        v71 v71Var = v71.f32439a;
                        jl4Var = new jl4(new il4(c0875lk, xl4VarM12709e, v71Var, i, z2, i2, ky0Var, df2Var, am1Var, j), new yu2(new C1122rv(c0875lk, ky0Var, am1Var, xl4VarM12709e, v71Var, z2), j, q73VarM12325O0.f28250f, q73VarM12325O0.f28248d), q73VarM12325O0.f28256l);
                    }
                }
                if (jl4Var != null) {
                    list.add(jl4Var);
                    jl4Var2 = jl4Var;
                }
                return Boolean.valueOf(jl4Var2 != null);
            case 1:
                String str = ((C0875lk) obj).f24092b;
                vl4 vl4Var = wl4Var.f33480y;
                if (vl4Var == null) {
                    String str2 = wl4Var.f33470o;
                    vl4 vl4Var2 = new vl4();
                    vl4Var2.f32724a = str2;
                    vl4Var2.f32725b = str;
                    vl4Var2.f32726c = false;
                    vl4Var2.f32727d = null;
                    VarHandle.storeStoreFence();
                    q73 q73Var = new q73(str, wl4Var.f33471p, wl4Var.f33472q, wl4Var.f33473r, wl4Var.f33474s, wl4Var.f33475t, wl4Var.f33476u);
                    q73Var.m9757d(wl4Var.m12325O0().f28253i);
                    vl4Var2.f32727d = q73Var;
                    wl4Var.f33480y = vl4Var2;
                } else if (!z62.m13387o(str, vl4Var.f32725b)) {
                    vl4Var.f32725b = str;
                    q73 q73Var2 = vl4Var.f32727d;
                    if (q73Var2 != null) {
                        xl4 xl4Var = wl4Var.f33471p;
                        am1 am1Var2 = wl4Var.f33472q;
                        int i3 = wl4Var.f33473r;
                        boolean z3 = wl4Var.f33474s;
                        int i4 = wl4Var.f33475t;
                        int i5 = wl4Var.f33476u;
                        q73Var2.f28245a = str;
                        q73Var2.f28246b = xl4Var;
                        q73Var2.f28247c = am1Var2;
                        q73Var2.f28248d = i3;
                        q73Var2.f28249e = z3;
                        q73Var2.f28250f = i4;
                        q73Var2.f28251g = i5;
                        q73Var2.f28263s = (q73Var2.f28263s << 2) | 2;
                        q73Var2.m9756c();
                    }
                }
                y70.m13004E(wl4Var);
                z62.m13349H(wl4Var);
                z62.m13348G(wl4Var);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                vl4 vl4Var3 = wl4Var.f33480y;
                if (vl4Var3 == null) {
                    z = false;
                } else {
                    vl4Var3.f32726c = zBooleanValue;
                    y70.m13004E(wl4Var);
                    z62.m13349H(wl4Var);
                    z62.m13348G(wl4Var);
                }
                return Boolean.valueOf(z);
        }
    }
}
