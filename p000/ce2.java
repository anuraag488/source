package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ce2 extends tr1 {
    private static final ce2 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private i62 keyInfo_ = sh3.f30275e;
    private int primaryKeyId_;

    static {
        ce2 ce2Var = new ce2();
        DEFAULT_INSTANCE = ce2Var;
        tr1.m11100v(ce2.class, ce2Var);
    }

    /* JADX INFO: renamed from: y */
    public static zd2 m3984y() {
        return (zd2) DEFAULT_INSTANCE.m11104h();
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", be2.class});
        }
        if (iM4376u == 3) {
            return new ce2();
        }
        if (iM4376u == 4) {
            return new zd2(DEFAULT_INSTANCE);
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
        synchronized (ce2.class) {
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
    public final void m3985x(be2 be2Var) {
        i62 i62VarMo6682n = this.keyInfo_;
        if (!((AbstractC0560d2) i62VarMo6682n).f16738a) {
            i62VarMo6682n = i62VarMo6682n.mo6682n(i62VarMo6682n.size() * 2);
            this.keyInfo_ = i62VarMo6682n;
        }
        i62VarMo6682n.add(be2Var);
    }

    /* JADX INFO: renamed from: z */
    public final void m3986z(int i) {
        this.primaryKeyId_ = i;
    }
}
