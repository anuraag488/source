package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n61 extends tr1 {
    private static final n61 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private t50 keyValue_ = t50.f30782b;
    private int version_;

    static {
        n61 n61Var = new n61();
        DEFAULT_INSTANCE = n61Var;
        tr1.m11100v(n61.class, n61Var);
    }

    /* JADX INFO: renamed from: A */
    public static l61 m8538A() {
        return (l61) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public static n61 m8539B(t50 t50Var, qc1 qc1Var) {
        return (n61) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: C */
    public static l83 m8540C() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: x */
    public static n61 m8541x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final void m8542D(o50 o50Var) {
        this.keyValue_ = o50Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
        }
        if (iM4376u == 3) {
            return new n61();
        }
        if (iM4376u == 4) {
            return new l61(DEFAULT_INSTANCE);
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
        synchronized (n61.class) {
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
    public final t50 m8543y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final int m8544z() {
        return this.version_;
    }
}
