package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hp5 extends ur1 {
    private static final hp5 DEFAULT_INSTANCE;
    private static volatile yu5 PARSER = null;
    public static final int PROXIES_FIELD_NUMBER = 1;
    private gr5 proxies_ = wv5.f33790e;

    static {
        hp5 hp5Var = new hp5();
        DEFAULT_INSTANCE = hp5Var;
        ur1.m11628e(hp5.class, hp5Var);
    }

    /* JADX INFO: renamed from: l */
    public static bp5 m6470l() {
        return (bp5) ((gq5) DEFAULT_INSTANCE.mo5307i(5));
    }

    /* JADX INFO: renamed from: m */
    public static void m6471m(hp5 hp5Var, to5 to5Var) {
        gr5 gr5VarM12430b = hp5Var.proxies_;
        if (!((z06) gr5VarM12430b).f35688a) {
            int size = gr5VarM12430b.size();
            gr5VarM12430b = ((wv5) gr5VarM12430b).m12430b(size + size);
            hp5Var.proxies_ = gr5VarM12430b;
        }
        gr5VarM12430b.add(to5Var);
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
            return ur1.m11631k(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"proxies_", to5.class});
        }
        if (i2 == 3) {
            return new hp5();
        }
        if (i2 == 4) {
            return new bp5(DEFAULT_INSTANCE);
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
        synchronized (hp5.class) {
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
}
