package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x35 extends tr1 {
    private static final x35 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private b45 params_;
    private int version_;

    static {
        x35 x35Var = new x35();
        DEFAULT_INSTANCE = x35Var;
        tr1.m11100v(x35.class, x35Var);
    }

    /* JADX INFO: renamed from: A */
    public static x35 m12470A(t50 t50Var, qc1 qc1Var) {
        return (x35) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: z */
    public static w35 m12471z() {
        return (w35) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public final void m12472B(b45 b45Var) {
        this.params_ = b45Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (iM4376u == 3) {
            return new x35();
        }
        if (iM4376u == 4) {
            return new w35(DEFAULT_INSTANCE);
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
        synchronized (x35.class) {
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
    public final b45 m12473x() {
        b45 b45Var = this.params_;
        return b45Var == null ? b45.m3435x() : b45Var;
    }

    /* JADX INFO: renamed from: y */
    public final int m12474y() {
        return this.version_;
    }
}
