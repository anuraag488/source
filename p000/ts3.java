package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ts3 extends tr1 {
    private static final ts3 DEFAULT_INSTANCE;
    public static final int MGF1_HASH_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int SALT_LENGTH_FIELD_NUMBER = 3;
    public static final int SIG_HASH_FIELD_NUMBER = 1;
    private int mgf1Hash_;
    private int saltLength_;
    private int sigHash_;

    static {
        ts3 ts3Var = new ts3();
        DEFAULT_INSTANCE = ts3Var;
        tr1.m11100v(ts3.class, ts3Var);
    }

    /* JADX INFO: renamed from: B */
    public static ss3 m11121B() {
        return (ss3) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: x */
    public static ts3 m11122x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final pv1 m11123A() {
        pv1 pv1VarM9680a = pv1.m9680a(this.sigHash_);
        return pv1VarM9680a == null ? pv1.f28025h : pv1VarM9680a;
    }

    /* JADX INFO: renamed from: C */
    public final void m11124C(pv1 pv1Var) {
        this.mgf1Hash_ = pv1Var.m9681b();
    }

    /* JADX INFO: renamed from: D */
    public final void m11125D(int i) {
        this.saltLength_ = i;
    }

    /* JADX INFO: renamed from: E */
    public final void m11126E(pv1 pv1Var) {
        this.sigHash_ = pv1Var.m9681b();
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"sigHash_", "mgf1Hash_", "saltLength_"});
        }
        if (iM4376u == 3) {
            return new ts3();
        }
        if (iM4376u == 4) {
            return new ss3(DEFAULT_INSTANCE);
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
        synchronized (ts3.class) {
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
    public final pv1 m11127y() {
        pv1 pv1VarM9680a = pv1.m9680a(this.mgf1Hash_);
        return pv1VarM9680a == null ? pv1.f28025h : pv1VarM9680a;
    }

    /* JADX INFO: renamed from: z */
    public final int m11128z() {
        return this.saltLength_;
    }
}
