package p000;

/* JADX INFO: renamed from: m7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0899m7 extends tr1 {
    private static final C0899m7 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile l83 PARSER;
    private int bitField0_;
    private int keySize_;
    private C1098r7 params_;

    static {
        C0899m7 c0899m7 = new C0899m7();
        DEFAULT_INSTANCE = c0899m7;
        tr1.m11100v(C0899m7.class, c0899m7);
    }

    /* JADX INFO: renamed from: A */
    public static C0899m7 m8206A(t50 t50Var, qc1 qc1Var) {
        return (C0899m7) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: z */
    public static C0862l7 m8207z() {
        return (C0862l7) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public final void m8208B(int i) {
        this.keySize_ = i;
    }

    /* JADX INFO: renamed from: C */
    public final void m8209C(C1098r7 c1098r7) {
        this.params_ = c1098r7;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
        }
        if (iM4376u == 3) {
            return new C0899m7();
        }
        if (iM4376u == 4) {
            return new C0862l7(DEFAULT_INSTANCE);
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
        synchronized (C0899m7.class) {
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
    public final int m8210x() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: y */
    public final C1098r7 m8211y() {
        C1098r7 c1098r7 = this.params_;
        return c1098r7 == null ? C1098r7.m10226x() : c1098r7;
    }
}
