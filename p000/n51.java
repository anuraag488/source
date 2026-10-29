package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n51 extends tr1 {
    public static final int CURVE_FIELD_NUMBER = 2;
    private static final n51 DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile l83 PARSER;
    private int curve_;
    private int encoding_;
    private int hashType_;

    static {
        n51 n51Var = new n51();
        DEFAULT_INSTANCE = n51Var;
        tr1.m11100v(n51.class, n51Var);
    }

    /* JADX INFO: renamed from: B */
    public static m51 m8528B() {
        return (m51) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: y */
    public static n51 m8529y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final pv1 m8530A() {
        pv1 pv1VarM9680a = pv1.m9680a(this.hashType_);
        return pv1VarM9680a == null ? pv1.f28025h : pv1VarM9680a;
    }

    /* JADX INFO: renamed from: C */
    public final void m8531C(g71 g71Var) {
        this.curve_ = g71Var.m5908a();
    }

    /* JADX INFO: renamed from: D */
    public final void m8532D(x51 x51Var) {
        this.encoding_ = x51Var.m12483a();
    }

    /* JADX INFO: renamed from: E */
    public final void m8533E(pv1 pv1Var) {
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"hashType_", "curve_", "encoding_"});
        }
        if (iM4376u == 3) {
            return new n51();
        }
        if (iM4376u == 4) {
            return new m51(DEFAULT_INSTANCE);
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
        synchronized (n51.class) {
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

    /* JADX INFO: renamed from: x */
    public final g71 m8534x() {
        g71 g71Var;
        int i = this.curve_;
        if (i == 0) {
            g71Var = g71.f19627b;
        } else if (i == 2) {
            g71Var = g71.f19628c;
        } else if (i == 3) {
            g71Var = g71.f19629d;
        } else if (i != 4) {
            g71Var = i != 5 ? null : g71.f19631f;
        } else {
            g71Var = g71.f19630e;
        }
        return g71Var == null ? g71.f19632g : g71Var;
    }

    /* JADX INFO: renamed from: z */
    public final x51 m8535z() {
        x51 x51Var;
        int i = this.encoding_;
        if (i == 0) {
            x51Var = x51.f34007b;
        } else if (i != 1) {
            x51Var = i != 2 ? null : x51.f34009d;
        } else {
            x51Var = x51.f34008c;
        }
        return x51Var == null ? x51.f34010e : x51Var;
    }
}
