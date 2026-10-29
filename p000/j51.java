package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j51 extends tr1 {
    private static final j51 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private n51 params_;
    private int version_;

    static {
        j51 j51Var = new j51();
        DEFAULT_INSTANCE = j51Var;
        tr1.m11100v(j51.class, j51Var);
    }

    /* JADX INFO: renamed from: y */
    public static i51 m7017y() {
        return (i51) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: z */
    public static j51 m7018z(t50 t50Var, qc1 qc1Var) {
        return (j51) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: A */
    public final void m7019A(n51 n51Var) {
        this.params_ = n51Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"bitField0_", "params_", "version_"});
        }
        if (iM4376u == 3) {
            return new j51();
        }
        if (iM4376u == 4) {
            return new i51(DEFAULT_INSTANCE);
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
        synchronized (j51.class) {
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
    public final n51 m7020x() {
        n51 n51Var = this.params_;
        return n51Var == null ? n51.m8529y() : n51Var;
    }
}
