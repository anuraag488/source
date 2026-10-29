package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ee2 extends tr1 {
    private static final ee2 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private ge2 params_;
    private int version_;

    static {
        ee2 ee2Var = new ee2();
        DEFAULT_INSTANCE = ee2Var;
        tr1.m11100v(ee2.class, ee2Var);
    }

    /* JADX INFO: renamed from: A */
    public static ee2 m5095A(t50 t50Var, qc1 qc1Var) {
        return (ee2) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: B */
    public static l83 m5096B() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: z */
    public static de2 m5097z() {
        return (de2) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: C */
    public final void m5098C(ge2 ge2Var) {
        this.params_ = ge2Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (iM4376u == 3) {
            return new ee2();
        }
        if (iM4376u == 4) {
            return new de2(DEFAULT_INSTANCE);
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
        synchronized (ee2.class) {
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
    public final ge2 m5099x() {
        ge2 ge2Var = this.params_;
        return ge2Var == null ? ge2.m5977x() : ge2Var;
    }

    /* JADX INFO: renamed from: y */
    public final int m5100y() {
        return this.version_;
    }
}
