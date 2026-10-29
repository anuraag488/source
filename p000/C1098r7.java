package p000;

/* JADX INFO: renamed from: r7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1098r7 extends tr1 {
    private static final C1098r7 DEFAULT_INSTANCE;
    private static volatile l83 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        C1098r7 c1098r7 = new C1098r7();
        DEFAULT_INSTANCE = c1098r7;
        tr1.m11100v(C1098r7.class, c1098r7);
    }

    /* JADX INFO: renamed from: x */
    public static C1098r7 m10226x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static C1061q7 m10227z() {
        return (C1061q7) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: A */
    public final void m10228A(int i) {
        this.tagSize_ = i;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
        }
        if (iM4376u == 3) {
            return new C1098r7();
        }
        if (iM4376u == 4) {
            return new C1061q7(DEFAULT_INSTANCE);
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
        synchronized (C1098r7.class) {
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
    public final int m10229y() {
        return this.tagSize_;
    }
}
