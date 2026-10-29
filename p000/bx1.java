package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bx1 extends tr1 {
    private static final bx1 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile l83 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        bx1 bx1Var = new bx1();
        DEFAULT_INSTANCE = bx1Var;
        tr1.m11100v(bx1.class, bx1Var);
    }

    /* JADX INFO: renamed from: A */
    public static ax1 m3753A() {
        return (ax1) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: x */
    public static bx1 m3754x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m3755B(pv1 pv1Var) {
        this.hash_ = pv1Var.m9681b();
    }

    /* JADX INFO: renamed from: C */
    public final void m3756C(int i) {
        this.tagSize_ = i;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
        }
        if (iM4376u == 3) {
            return new bx1();
        }
        if (iM4376u == 4) {
            return new ax1(DEFAULT_INSTANCE);
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
        synchronized (bx1.class) {
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
    public final pv1 m3757y() {
        pv1 pv1VarM9680a = pv1.m9680a(this.hash_);
        return pv1VarM9680a == null ? pv1.f28025h : pv1VarM9680a;
    }

    /* JADX INFO: renamed from: z */
    public final int m3758z() {
        return this.tagSize_;
    }
}
