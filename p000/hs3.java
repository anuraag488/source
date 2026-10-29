package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hs3 extends tr1 {
    private static final hs3 DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;

    /* JADX INFO: renamed from: e_ */
    private t50 f20828e_;

    /* JADX INFO: renamed from: n_ */
    private t50 f20829n_;
    private zr3 params_;
    private int version_;

    static {
        hs3 hs3Var = new hs3();
        DEFAULT_INSTANCE = hs3Var;
        tr1.m11100v(hs3.class, hs3Var);
    }

    public hs3() {
        o50 o50Var = t50.f30782b;
        this.f20829n_ = o50Var;
        this.f20828e_ = o50Var;
    }

    /* JADX INFO: renamed from: C */
    public static fs3 m6492C() {
        return (fs3) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: D */
    public static hs3 m6493D(t50 t50Var, qc1 qc1Var) {
        return (hs3) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: E */
    public static l83 m6494E() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: x */
    public static hs3 m6495x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final zr3 m6496A() {
        zr3 zr3Var = this.params_;
        return zr3Var == null ? zr3.m13729x() : zr3Var;
    }

    /* JADX INFO: renamed from: B */
    public final int m6497B() {
        return this.version_;
    }

    /* JADX INFO: renamed from: F */
    public final void m6498F(o50 o50Var) {
        this.f20828e_ = o50Var;
    }

    /* JADX INFO: renamed from: G */
    public final void m6499G(o50 o50Var) {
        this.f20829n_ = o50Var;
    }

    /* JADX INFO: renamed from: H */
    public final void m6500H(zr3 zr3Var) {
        this.params_ = zr3Var;
        this.bitField0_ |= 1;
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
            return new hs3();
        }
        if (iM4376u == 4) {
            return new fs3(DEFAULT_INSTANCE);
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
        synchronized (hs3.class) {
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
    public final t50 m6501y() {
        return this.f20828e_;
    }

    /* JADX INFO: renamed from: z */
    public final t50 m6502z() {
        return this.f20829n_;
    }
}
