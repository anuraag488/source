package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u51 extends tr1 {
    private static final u51 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int bitField0_;
    private n51 params_;
    private int version_;

    /* JADX INFO: renamed from: x_ */
    private t50 f31655x_;

    /* JADX INFO: renamed from: y_ */
    private t50 f31656y_;

    static {
        u51 u51Var = new u51();
        DEFAULT_INSTANCE = u51Var;
        tr1.m11100v(u51.class, u51Var);
    }

    public u51() {
        o50 o50Var = t50.f30782b;
        this.f31655x_ = o50Var;
        this.f31656y_ = o50Var;
    }

    /* JADX INFO: renamed from: C */
    public static s51 m11251C() {
        return (s51) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: D */
    public static u51 m11252D(t50 t50Var, qc1 qc1Var) {
        return (u51) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: E */
    public static l83 m11253E() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: x */
    public static u51 m11254x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final t50 m11255A() {
        return this.f31655x_;
    }

    /* JADX INFO: renamed from: B */
    public final t50 m11256B() {
        return this.f31656y_;
    }

    /* JADX INFO: renamed from: F */
    public final void m11257F(n51 n51Var) {
        this.params_ = n51Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: G */
    public final void m11258G(o50 o50Var) {
        this.f31655x_ = o50Var;
    }

    /* JADX INFO: renamed from: H */
    public final void m11259H(o50 o50Var) {
        this.f31656y_ = o50Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
        }
        if (iM4376u == 3) {
            return new u51();
        }
        if (iM4376u == 4) {
            return new s51(DEFAULT_INSTANCE);
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
        synchronized (u51.class) {
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
    public final n51 m11260y() {
        n51 n51Var = this.params_;
        return n51Var == null ? n51.m8529y() : n51Var;
    }

    /* JADX INFO: renamed from: z */
    public final int m11261z() {
        return this.version_;
    }
}
