package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i61 extends tr1 {
    private static final i61 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private t50 keyValue_ = t50.f30782b;
    private n61 publicKey_;
    private int version_;

    static {
        i61 i61Var = new i61();
        DEFAULT_INSTANCE = i61Var;
        tr1.m11100v(i61.class, i61Var);
    }

    /* JADX INFO: renamed from: A */
    public static g61 m6674A() {
        return (g61) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public static i61 m6675B(t50 t50Var, qc1 qc1Var) {
        return (i61) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: C */
    public static l83 m6676C() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: D */
    public final void m6677D(o50 o50Var) {
        this.keyValue_ = o50Var;
    }

    /* JADX INFO: renamed from: E */
    public final void m6678E(n61 n61Var) {
        this.publicKey_ = n61Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "publicKey_"});
        }
        if (iM4376u == 3) {
            return new i61();
        }
        if (iM4376u == 4) {
            return new g61(DEFAULT_INSTANCE);
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
        synchronized (i61.class) {
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
    public final t50 m6679x() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: y */
    public final n61 m6680y() {
        n61 n61Var = this.publicKey_;
        return n61Var == null ? n61.m8541x() : n61Var;
    }

    /* JADX INFO: renamed from: z */
    public final int m6681z() {
        return this.version_;
    }
}
