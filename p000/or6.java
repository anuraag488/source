package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class or6 extends ur1 {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    private static final or6 DEFAULT_INSTANCE;
    private static volatile yu5 PARSER;
    private gr5 constrainedValues_ = wv5.f33790e;

    static {
        or6 or6Var = new or6();
        DEFAULT_INSTANCE = or6Var;
        ur1.m11628e(or6.class, or6Var);
    }

    /* JADX INFO: renamed from: m */
    public static or6 m9244m() {
        return DEFAULT_INSTANCE;
    }

    @Override // p000.ur1
    /* JADX INFO: renamed from: i */
    public final Object mo5307i(int i) {
        yu5 lq5Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return ur1.m11631k(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", er6.class});
        }
        if (i2 == 3) {
            return new or6();
        }
        if (i2 == 4) {
            return new iq6(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (i2 != 6) {
            throw null;
        }
        yu5 yu5Var = PARSER;
        if (yu5Var != null) {
            return yu5Var;
        }
        synchronized (or6.class) {
            try {
                lq5Var = PARSER;
                if (lq5Var == null) {
                    lq5Var = new lq5(DEFAULT_INSTANCE);
                    PARSER = lq5Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lq5Var;
    }

    /* JADX INFO: renamed from: l */
    public final gr5 m9245l() {
        return this.constrainedValues_;
    }
}
