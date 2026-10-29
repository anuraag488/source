package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zr3 extends tr1 {
    private static final zr3 DEFAULT_INSTANCE;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile l83 PARSER;
    private int hashType_;

    static {
        zr3 zr3Var = new zr3();
        DEFAULT_INSTANCE = zr3Var;
        tr1.m11100v(zr3.class, zr3Var);
    }

    /* JADX INFO: renamed from: x */
    public static zr3 m13729x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static yr3 m13730z() {
        return (yr3) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: A */
    public final void m13731A(pv1 pv1Var) {
        this.hashType_ = pv1Var.m9681b();
    }

    @Override // p000.tr1
    /* JADX INFO: renamed from: i */
    public final Object mo124i(int i) {
        l83 rr1Var;
        int iM4376u = d55.m4376u(i);
        if (iM4376u == 0) {
            return (byte) 1;
        }
        if (iM4376u == 2) {
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"hashType_"});
        }
        if (iM4376u == 3) {
            return new zr3();
        }
        if (iM4376u == 4) {
            return new yr3(DEFAULT_INSTANCE);
        }
        if (iM4376u == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iM4376u != 6) {
            throw null;
        }
        l83 l83Var = PARSER;
        if (l83Var != null) {
            return l83Var;
        }
        synchronized (zr3.class) {
            try {
                rr1Var = PARSER;
                if (rr1Var == null) {
                    rr1Var = new rr1();
                    PARSER = rr1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rr1Var;
    }

    /* JADX INFO: renamed from: y */
    public final pv1 m13732y() {
        pv1 pv1VarM9680a = pv1.m9680a(this.hashType_);
        return pv1VarM9680a == null ? pv1.f28025h : pv1VarM9680a;
    }
}
