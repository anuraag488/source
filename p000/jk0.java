package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jk0 extends f40 {

    /* JADX INFO: renamed from: s */
    public final y30 f22347s;

    public jk0(int i, y30 y30Var, yp1 yp1Var) {
        super(i, yp1Var);
        this.f22347s = y30Var;
        if (y30Var == y30.f34832a) {
            xy4.m12783l("This implementation does not support suspension for senders, use ", rl3.m10361a(f40.class).m10249b(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        C1077qn.m9988n(c75.m3878j("Buffered channel capacity must be at least 1, but ", i, " was specified"));
        throw null;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: A */
    public final boolean mo5470A() {
        return this.f22347s == y30.f34833b;
    }

    /* JADX INFO: renamed from: O */
    public final Object m7134O(Object obj, boolean z) throws IllegalAccessException, InvocationTargetException {
        Throwable thM5498t;
        m80 m80Var;
        yp1 yp1Var;
        gf0 gf0VarM12847S;
        y30 y30Var = this.f22347s;
        y30 y30Var2 = y30.f34834c;
        ju4 ju4Var = ju4.f22634a;
        yy4 yy4Var = null;
        if (y30Var != y30Var2) {
            Object obj2 = obj;
            Object obj3 = h40.f20363d;
            p80 p80Var = (p80) f40.f18728h.get(this);
            while (true) {
                long andIncrement = f40.f18724d.getAndIncrement(this);
                long j = 1152921504606846975L & andIncrement;
                boolean zM5501x = m5501x(andIncrement, false);
                int i = h40.f20361b;
                long j2 = i;
                long j3 = j / j2;
                yy4 yy4Var2 = yy4Var;
                int i2 = (int) (j % j2);
                if (p80Var.f22d != j3) {
                    p80 p80VarM5491l = m5491l(j3, p80Var);
                    if (p80VarM5491l != null) {
                        p80Var = p80VarM5491l;
                    } else {
                        if (zM5501x) {
                            thM5498t = m5498t();
                            m80Var = new m80();
                            m80Var.f24722a = thM5498t;
                            VarHandle.storeStoreFence();
                            return m80Var;
                        }
                        yy4Var = yy4Var2;
                    }
                }
                int iM5480L = m5480L(p80Var, i2, obj2, j, obj3, zM5501x);
                if (iM5480L == 0) {
                    p80Var.m9128a();
                    return ju4Var;
                }
                if (iM5480L == 1) {
                    break;
                }
                if (iM5480L == 2) {
                    if (!zM5501x) {
                        yy4 yy4Var3 = obj3 instanceof yy4 ? (yy4) obj3 : yy4Var2;
                        if (yy4Var3 != null) {
                            yy4Var3.mo3483a(p80Var, i2 + i);
                        }
                        m5488h((p80Var.f22d * j2) + ((long) i2));
                        break;
                    }
                    p80Var.m7i();
                    thM5498t = m5498t();
                    m80Var = new m80();
                } else {
                    if (iM5480L == 3) {
                        C1077qn.m9989o("unexpected");
                        return yy4Var2;
                    }
                    if (iM5480L != 4) {
                        if (iM5480L == 5) {
                            p80Var.m9128a();
                        }
                        obj2 = obj;
                        yy4Var = yy4Var2;
                    } else {
                        if (j < m5497s()) {
                            p80Var.m9128a();
                        }
                        thM5498t = m5498t();
                        m80Var = new m80();
                    }
                }
                m80Var.f24722a = thM5498t;
                VarHandle.storeStoreFence();
                return m80Var;
            }
        }
        Object objMo5493n = super.mo5493n(obj);
        if (!(objMo5493n instanceof n80) || (objMo5493n instanceof m80)) {
            return objMo5493n;
        }
        if (z && (yp1Var = this.f18740b) != null && (gf0VarM12847S = y42.m12847S(yp1Var, obj, null)) != null) {
            throw gf0VarM12847S;
        }
        return ju4Var;
    }

    @Override // p000.f40, p000.y14
    /* JADX INFO: renamed from: c */
    public final Object mo5484c(wm0 wm0Var, Object obj) throws Throwable {
        gf0 gf0VarM12847S;
        if (!(m7134O(obj, true) instanceof m80)) {
            return ju4.f22634a;
        }
        yp1 yp1Var = this.f18740b;
        if (yp1Var == null || (gf0VarM12847S = y42.m12847S(yp1Var, obj, null)) == null) {
            throw m5498t();
        }
        se0.m10720f(gf0VarM12847S, m5498t());
        throw gf0VarM12847S;
    }

    @Override // p000.f40, p000.y14
    /* JADX INFO: renamed from: n */
    public final Object mo5493n(Object obj) {
        return m7134O(obj, false);
    }
}
