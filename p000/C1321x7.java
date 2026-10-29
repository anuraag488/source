package p000;

/* JADX INFO: renamed from: x7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1321x7 extends tr1 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C1321x7 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0863l8 aesCtrKey_;
    private int bitField0_;
    private sw1 hmacKey_;
    private int version_;

    static {
        C1321x7 c1321x7 = new C1321x7();
        DEFAULT_INSTANCE = c1321x7;
        tr1.m11100v(C1321x7.class, c1321x7);
    }

    /* JADX INFO: renamed from: A */
    public static C1246v7 m12508A() {
        return (C1246v7) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public static C1321x7 m12509B(t50 t50Var, qc1 qc1Var) {
        return (C1321x7) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: C */
    public static l83 m12510C() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: D */
    public final void m12511D(C0863l8 c0863l8) {
        this.aesCtrKey_ = c0863l8;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: E */
    public final void m12512E(sw1 sw1Var) {
        this.hmacKey_ = sw1Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
        }
        if (iM4376u == 3) {
            return new C1321x7();
        }
        if (iM4376u == 4) {
            return new C1246v7(DEFAULT_INSTANCE);
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
        synchronized (C1321x7.class) {
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
    public final C0863l8 m12513x() {
        C0863l8 c0863l8 = this.aesCtrKey_;
        return c0863l8 == null ? C0863l8.m7838x() : c0863l8;
    }

    /* JADX INFO: renamed from: y */
    public final sw1 m12514y() {
        sw1 sw1Var = this.hmacKey_;
        return sw1Var == null ? sw1.m10935x() : sw1Var;
    }

    /* JADX INFO: renamed from: z */
    public final int m12515z() {
        return this.version_;
    }
}
