package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: v */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1238v {

    /* JADX INFO: renamed from: a */
    public static final pg2 f32279a = AbstractC0647fd.m5647E("M11,17h2V11H11v6ZM12.71,8.71Q13,8.42,13,8Q13,7.57,12.71,7.29T12,7T11.29,7.29T11,8q0,0.42,0.29,0.71T12,9T12.71,8.71ZM12,22Q8.53,21.13,6.26,18.01T4,11.1V5L12,2l8,3v6.1q0,3.8,-2.26,6.91T12,22Z");

    /* JADX INFO: renamed from: a */
    public static final void m11688a(C0950nl c0950nl, mi0 mi0Var, int i) {
        boolean z;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(215684704);
        int i2 = i | 2;
        byte b = 0;
        byte b2 = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                c0950nl = (C0950nl) ir1Var.m6898k(AbstractC0987ol.m9168a());
            } else {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            List listMo9875h = ((qe3) ir1Var.m6898k(ze3.f36022a)).mo9875h();
            if (!(listMo9875h instanceof Collection) || !listMo9875h.isEmpty()) {
                Iterator it = listMo9875h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (((d00) it.next()).f16662f.f26682b == ng3.Subs) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            boolean zM6894i = ir1Var.m6894i(c0950nl) | ir1Var.m6892h(z);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C1090r c1090r = new C1090r(b);
                c1090r.f28913c = c0950nl;
                c1090r.f28912b = z;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1090r);
                obj = c1090r;
            }
            obj = objM6869O;
            AbstractC0647fd.m5668f(null, "About", false, null, (yp1) obj, ir1Var, 48, 13);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1016p c1016p = new C1016p(b2);
            c1016p.f27252b = c0950nl;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1016p;
        }
    }
}
