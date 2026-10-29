package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q51 extends tr1 {
    private static final q51 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile l83 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private t50 keyValue_ = t50.f30782b;
    private u51 publicKey_;
    private int version_;

    static {
        q51 q51Var = new q51();
        DEFAULT_INSTANCE = q51Var;
        tr1.m11100v(q51.class, q51Var);
    }

    /* JADX INFO: renamed from: A */
    public static o51 m9733A() {
        return (o51) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public static q51 m9734B(t50 t50Var, qc1 qc1Var) {
        return (q51) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: C */
    public static l83 m9735C() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: D */
    public final void m9736D(o50 o50Var) {
        this.keyValue_ = o50Var;
    }

    /* JADX INFO: renamed from: E */
    public final void m9737E(u51 u51Var) {
        this.publicKey_ = u51Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "keyValue_"});
        }
        if (iM4376u == 3) {
            return new q51();
        }
        if (iM4376u == 4) {
            return new o51(DEFAULT_INSTANCE);
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
        synchronized (q51.class) {
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
    public final t50 m9738x() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: y */
    public final u51 m9739y() {
        u51 u51Var = this.publicKey_;
        return u51Var == null ? u51.m11254x() : u51Var;
    }

    /* JADX INFO: renamed from: z */
    public final int m9740z() {
        return this.version_;
    }
}
