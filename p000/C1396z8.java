package p000;

/* JADX INFO: renamed from: z8 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1396z8 extends tr1 {
    private static final C1396z8 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile l83 PARSER;
    private int ivSize_;

    static {
        C1396z8 c1396z8 = new C1396z8();
        DEFAULT_INSTANCE = c1396z8;
        tr1.m11100v(C1396z8.class, c1396z8);
    }

    /* JADX INFO: renamed from: x */
    public static C1396z8 m13446x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static C1359y8 m13447z() {
        return (C1359y8) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: A */
    public final void m13448A(int i) {
        this.ivSize_ = i;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
        }
        if (iM4376u == 3) {
            return new C1396z8();
        }
        if (iM4376u == 4) {
            return new C1359y8(DEFAULT_INSTANCE);
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
        synchronized (C1396z8.class) {
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
    public final int m13449y() {
        return this.ivSize_;
    }
}
