package p000;

/* JADX INFO: renamed from: n8 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0937n8 extends tr1 {
    private static final C0937n8 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile l83 PARSER;
    private int bitField0_;
    private int keySize_;
    private C1025p8 params_;

    static {
        C0937n8 c0937n8 = new C0937n8();
        DEFAULT_INSTANCE = c0937n8;
        tr1.m11100v(C0937n8.class, c0937n8);
    }

    /* JADX INFO: renamed from: A */
    public static C0900m8 m8587A() {
        return (C0900m8) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: x */
    public static C0937n8 m8588x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m8589B(int i) {
        this.keySize_ = i;
    }

    /* JADX INFO: renamed from: C */
    public final void m8590C(C1025p8 c1025p8) {
        this.params_ = c1025p8;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
        }
        if (iM4376u == 3) {
            return new C0937n8();
        }
        if (iM4376u == 4) {
            return new C0900m8(DEFAULT_INSTANCE);
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
        synchronized (C0937n8.class) {
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
    public final int m8591y() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: z */
    public final C1025p8 m8592z() {
        C1025p8 c1025p8 = this.params_;
        return c1025p8 == null ? C1025p8.m9374x() : c1025p8;
    }
}
