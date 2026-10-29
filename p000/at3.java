package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class at3 extends tr1 {
    private static final at3 DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;

    /* JADX INFO: renamed from: e_ */
    private t50 f14860e_;

    /* JADX INFO: renamed from: n_ */
    private t50 f14861n_;
    private ts3 params_;
    private int version_;

    static {
        at3 at3Var = new at3();
        DEFAULT_INSTANCE = at3Var;
        tr1.m11100v(at3.class, at3Var);
    }

    public at3() {
        o50 o50Var = t50.f30782b;
        this.f14861n_ = o50Var;
        this.f14860e_ = o50Var;
    }

    /* JADX INFO: renamed from: C */
    public static ys3 m3296C() {
        return (ys3) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: D */
    public static at3 m3297D(t50 t50Var, qc1 qc1Var) {
        return (at3) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: E */
    public static l83 m3298E() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: x */
    public static at3 m3299x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final ts3 m3300A() {
        ts3 ts3Var = this.params_;
        return ts3Var == null ? ts3.m11122x() : ts3Var;
    }

    /* JADX INFO: renamed from: B */
    public final int m3301B() {
        return this.version_;
    }

    /* JADX INFO: renamed from: F */
    public final void m3302F(o50 o50Var) {
        this.f14860e_ = o50Var;
    }

    /* JADX INFO: renamed from: G */
    public final void m3303G(o50 o50Var) {
        this.f14861n_ = o50Var;
    }

    /* JADX INFO: renamed from: H */
    public final void m3304H(ts3 ts3Var) {
        this.params_ = ts3Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: I */
    public final void m3305I() {
        this.version_ = 0;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "n_", "e_"});
        }
        if (iM4376u == 3) {
            return new at3();
        }
        if (iM4376u == 4) {
            return new ys3(DEFAULT_INSTANCE);
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
        synchronized (at3.class) {
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
    public final t50 m3306y() {
        return this.f14860e_;
    }

    /* JADX INFO: renamed from: z */
    public final t50 m3307z() {
        return this.f14861n_;
    }
}
