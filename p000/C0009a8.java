package p000;

/* JADX INFO: renamed from: a8 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0009a8 extends tr1 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C0009a8 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile l83 PARSER;
    private C0937n8 aesCtrKeyFormat_;
    private int bitField0_;
    private vw1 hmacKeyFormat_;

    static {
        C0009a8 c0009a8 = new C0009a8();
        DEFAULT_INSTANCE = c0009a8;
        tr1.m11100v(C0009a8.class, c0009a8);
    }

    /* JADX INFO: renamed from: A */
    public static C0009a8 m120A(t50 t50Var, qc1 qc1Var) {
        return (C0009a8) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: z */
    public static C1395z7 m121z() {
        return (C1395z7) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public final void m122B(C0937n8 c0937n8) {
        this.aesCtrKeyFormat_ = c0937n8;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: C */
    public final void m123C(vw1 vw1Var) {
        this.hmacKeyFormat_ = vw1Var;
        this.bitField0_ |= 2;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
        }
        if (iM4376u == 3) {
            return new C0009a8();
        }
        if (iM4376u == 4) {
            return new C1395z7(DEFAULT_INSTANCE);
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
        synchronized (C0009a8.class) {
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
    public final C0937n8 m125x() {
        C0937n8 c0937n8 = this.aesCtrKeyFormat_;
        return c0937n8 == null ? C0937n8.m8588x() : c0937n8;
    }

    /* JADX INFO: renamed from: y */
    public final vw1 m126y() {
        vw1 vw1Var = this.hmacKeyFormat_;
        return vw1Var == null ? vw1.m12003x() : vw1Var;
    }
}
