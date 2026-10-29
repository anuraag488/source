package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ge2 extends tr1 {
    private static final ge2 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile l83 PARSER;
    private String keyUri_ = "";

    static {
        ge2 ge2Var = new ge2();
        DEFAULT_INSTANCE = ge2Var;
        tr1.m11100v(ge2.class, ge2Var);
    }

    /* JADX INFO: renamed from: A */
    public static ge2 m5976A(t50 t50Var, qc1 qc1Var) {
        return (ge2) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: x */
    public static ge2 m5977x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static fe2 m5978z() {
        return (fe2) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public final void m5979B(String str) {
        str.getClass();
        this.keyUri_ = str;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
        }
        if (iM4376u == 3) {
            return new ge2();
        }
        if (iM4376u == 4) {
            return new fe2(DEFAULT_INSTANCE);
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
        synchronized (ge2.class) {
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
    public final String m5980y() {
        return this.keyUri_;
    }
}
