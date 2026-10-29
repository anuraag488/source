package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e45 extends tr1 {
    private static final e45 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private t50 keyValue_ = t50.f30782b;
    private int version_;

    static {
        e45 e45Var = new e45();
        DEFAULT_INSTANCE = e45Var;
        tr1.m11100v(e45.class, e45Var);
    }

    /* JADX INFO: renamed from: A */
    public static e45 m4920A(t50 t50Var, qc1 qc1Var) {
        return (e45) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: B */
    public static l83 m4921B() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: z */
    public static d45 m4922z() {
        return (d45) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: C */
    public final void m4923C(o50 o50Var) {
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
        }
        if (iM4376u == 3) {
            return new e45();
        }
        if (iM4376u == 4) {
            return new d45(DEFAULT_INSTANCE);
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
        synchronized (e45.class) {
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
    public final t50 m4924x() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: y */
    public final int m4925y() {
        return this.version_;
    }
}
