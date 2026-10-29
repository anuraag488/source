package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vw1 extends tr1 {
    private static final vw1 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private bx1 params_;
    private int version_;

    static {
        vw1 vw1Var = new vw1();
        DEFAULT_INSTANCE = vw1Var;
        tr1.m11100v(vw1.class, vw1Var);
    }

    /* JADX INFO: renamed from: B */
    public static uw1 m12001B() {
        return (uw1) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: C */
    public static vw1 m12002C(t50 t50Var, qc1 qc1Var) {
        return (vw1) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: x */
    public static vw1 m12003x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final int m12004A() {
        return this.version_;
    }

    /* JADX INFO: renamed from: D */
    public final void m12005D(int i) {
        this.keySize_ = i;
    }

    /* JADX INFO: renamed from: E */
    public final void m12006E(bx1 bx1Var) {
        this.params_ = bx1Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
        }
        if (iM4376u == 3) {
            return new vw1();
        }
        if (iM4376u == 4) {
            return new uw1(DEFAULT_INSTANCE);
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
        synchronized (vw1.class) {
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
    public final int m12007y() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: z */
    public final bx1 m12008z() {
        bx1 bx1Var = this.params_;
        return bx1Var == null ? bx1.m3754x() : bx1Var;
    }
}
