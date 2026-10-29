package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cs3 extends tr1 {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final cs3 DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile l83 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private t50 crt_;

    /* JADX INFO: renamed from: d_ */
    private t50 f16426d_;
    private t50 dp_;
    private t50 dq_;

    /* JADX INFO: renamed from: p_ */
    private t50 f16427p_;
    private hs3 publicKey_;

    /* JADX INFO: renamed from: q_ */
    private t50 f16428q_;
    private int version_;

    static {
        cs3 cs3Var = new cs3();
        DEFAULT_INSTANCE = cs3Var;
        tr1.m11100v(cs3.class, cs3Var);
    }

    public cs3() {
        o50 o50Var = t50.f30782b;
        this.f16426d_ = o50Var;
        this.f16427p_ = o50Var;
        this.f16428q_ = o50Var;
        this.dp_ = o50Var;
        this.dq_ = o50Var;
        this.crt_ = o50Var;
    }

    /* JADX INFO: renamed from: F */
    public static as3 m4147F() {
        return (as3) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: G */
    public static cs3 m4148G(t50 t50Var, qc1 qc1Var) {
        return (cs3) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: H */
    public static l83 m4149H() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: A */
    public final t50 m4150A() {
        return this.dq_;
    }

    /* JADX INFO: renamed from: B */
    public final t50 m4151B() {
        return this.f16427p_;
    }

    /* JADX INFO: renamed from: C */
    public final hs3 m4152C() {
        hs3 hs3Var = this.publicKey_;
        return hs3Var == null ? hs3.m6495x() : hs3Var;
    }

    /* JADX INFO: renamed from: D */
    public final t50 m4153D() {
        return this.f16428q_;
    }

    /* JADX INFO: renamed from: E */
    public final int m4154E() {
        return this.version_;
    }

    /* JADX INFO: renamed from: I */
    public final void m4155I(o50 o50Var) {
        this.crt_ = o50Var;
    }

    /* JADX INFO: renamed from: J */
    public final void m4156J(o50 o50Var) {
        this.f16426d_ = o50Var;
    }

    /* JADX INFO: renamed from: K */
    public final void m4157K(o50 o50Var) {
        this.dp_ = o50Var;
    }

    /* JADX INFO: renamed from: L */
    public final void m4158L(o50 o50Var) {
        this.dq_ = o50Var;
    }

    /* JADX INFO: renamed from: M */
    public final void m4159M(o50 o50Var) {
        this.f16427p_ = o50Var;
    }

    /* JADX INFO: renamed from: N */
    public final void m4160N(hs3 hs3Var) {
        this.publicKey_ = hs3Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: O */
    public final void m4161O(o50 o50Var) {
        this.f16428q_ = o50Var;
    }

    /* JADX INFO: renamed from: P */
    public final void m4162P() {
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"bitField0_", "version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
        }
        if (iM4376u == 3) {
            return new cs3();
        }
        if (iM4376u == 4) {
            return new as3(DEFAULT_INSTANCE);
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
        synchronized (cs3.class) {
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
    public final t50 m4163x() {
        return this.crt_;
    }

    /* JADX INFO: renamed from: y */
    public final t50 m4164y() {
        return this.f16426d_;
    }

    /* JADX INFO: renamed from: z */
    public final t50 m4165z() {
        return this.dp_;
    }
}
