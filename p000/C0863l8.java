package p000;

/* JADX INFO: renamed from: l8 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0863l8 extends tr1 {
    private static final C0863l8 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private t50 keyValue_ = t50.f30782b;
    private C1025p8 params_;
    private int version_;

    static {
        C0863l8 c0863l8 = new C0863l8();
        DEFAULT_INSTANCE = c0863l8;
        tr1.m11100v(C0863l8.class, c0863l8);
    }

    /* JADX INFO: renamed from: B */
    public static C0826k8 m7837B() {
        return (C0826k8) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: x */
    public static C0863l8 m7838x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final int m7839A() {
        return this.version_;
    }

    /* JADX INFO: renamed from: C */
    public final void m7840C(o50 o50Var) {
        this.keyValue_ = o50Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m7841D(C1025p8 c1025p8) {
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (iM4376u == 3) {
            return new C0863l8();
        }
        if (iM4376u == 4) {
            return new C0826k8(DEFAULT_INSTANCE);
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
        synchronized (C0863l8.class) {
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
    public final t50 m7842y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final C1025p8 m7843z() {
        C1025p8 c1025p8 = this.params_;
        return c1025p8 == null ? C1025p8.m9374x() : c1025p8;
    }
}
