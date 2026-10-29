package p000;

/* JADX INFO: renamed from: j7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0788j7 extends tr1 {
    private static final C0788j7 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private t50 keyValue_ = t50.f30782b;
    private C1098r7 params_;
    private int version_;

    static {
        C0788j7 c0788j7 = new C0788j7();
        DEFAULT_INSTANCE = c0788j7;
        tr1.m11100v(C0788j7.class, c0788j7);
    }

    /* JADX INFO: renamed from: A */
    public static C0752i7 m7025A() {
        return (C0752i7) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public static C0788j7 m7026B(t50 t50Var, qc1 qc1Var) {
        return (C0788j7) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: C */
    public static l83 m7027C() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: D */
    public final void m7028D(o50 o50Var) {
        this.keyValue_ = o50Var;
    }

    /* JADX INFO: renamed from: E */
    public final void m7029E(C1098r7 c1098r7) {
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
        }
        if (iM4376u == 3) {
            return new C0788j7();
        }
        if (iM4376u == 4) {
            return new C0752i7(DEFAULT_INSTANCE);
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
        synchronized (C0788j7.class) {
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
    public final t50 m7030x() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: y */
    public final C1098r7 m7031y() {
        C1098r7 c1098r7 = this.params_;
        return c1098r7 == null ? C1098r7.m10226x() : c1098r7;
    }

    /* JADX INFO: renamed from: z */
    public final int m7032z() {
        return this.version_;
    }
}
