package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t70 extends tr1 {
    private static final t70 DEFAULT_INSTANCE;
    private static volatile l83 PARSER;

    static {
        t70 t70Var = new t70();
        DEFAULT_INSTANCE = t70Var;
        tr1.m11100v(t70.class, t70Var);
    }

    /* JADX INFO: renamed from: x */
    public static t70 m10986x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static void m10987y(t50 t50Var, qc1 qc1Var) {
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iM4376u == 3) {
            return new t70();
        }
        if (iM4376u == 4) {
            return new s70(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (t70.class) {
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
}
