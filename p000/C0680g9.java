package p000;

/* JADX INFO: renamed from: g9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0680g9 extends tr1 {
    private static final C0680g9 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        C0680g9 c0680g9 = new C0680g9();
        DEFAULT_INSTANCE = c0680g9;
        tr1.m11100v(C0680g9.class, c0680g9);
    }

    /* JADX INFO: renamed from: A */
    public static C0680g9 m5932A(t50 t50Var, qc1 qc1Var) {
        return (C0680g9) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: z */
    public static C0642f9 m5933z() {
        return (C0642f9) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public final void m5934B(int i) {
        this.keySize_ = i;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
        }
        if (iM4376u == 3) {
            return new C0680g9();
        }
        if (iM4376u == 4) {
            return new C0642f9(DEFAULT_INSTANCE);
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
        synchronized (C0680g9.class) {
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
    public final int m5935x() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: y */
    public final int m5936y() {
        return this.version_;
    }
}
