package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sw1 extends tr1 {
    private static final sw1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private t50 keyValue_ = t50.f30782b;
    private bx1 params_;
    private int version_;

    static {
        sw1 sw1Var = new sw1();
        DEFAULT_INSTANCE = sw1Var;
        tr1.m11100v(sw1.class, sw1Var);
    }

    /* JADX INFO: renamed from: B */
    public static rw1 m10932B() {
        return (rw1) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: C */
    public static sw1 m10933C(t50 t50Var, qc1 qc1Var) {
        return (sw1) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: D */
    public static l83 m10934D() {
        return DEFAULT_INSTANCE.m11106l();
    }

    /* JADX INFO: renamed from: x */
    public static sw1 m10935x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final int m10936A() {
        return this.version_;
    }

    /* JADX INFO: renamed from: E */
    public final void m10937E(o50 o50Var) {
        this.keyValue_ = o50Var;
    }

    /* JADX INFO: renamed from: F */
    public final void m10938F(bx1 bx1Var) {
        this.params_ = bx1Var;
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
            return new sw1();
        }
        if (iM4376u == 4) {
            return new rw1(DEFAULT_INSTANCE);
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
        synchronized (sw1.class) {
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
    public final t50 m10939y() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: z */
    public final bx1 m10940z() {
        bx1 bx1Var = this.params_;
        return bx1Var == null ? bx1.m3754x() : bx1Var;
    }
}
