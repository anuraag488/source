package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tr3 extends tr1 {
    private static final tr3 DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile l83 PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int modulusSizeInBits_;
    private zr3 params_;
    private t50 publicExponent_ = t50.f30782b;

    static {
        tr3 tr3Var = new tr3();
        DEFAULT_INSTANCE = tr3Var;
        tr1.m11100v(tr3.class, tr3Var);
    }

    /* JADX INFO: renamed from: A */
    public static sr3 m11112A() {
        return (sr3) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public static tr3 m11113B(t50 t50Var, qc1 qc1Var) {
        return (tr3) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: C */
    public final void m11114C(int i) {
        this.modulusSizeInBits_ = i;
    }

    /* JADX INFO: renamed from: D */
    public final void m11115D(zr3 zr3Var) {
        this.params_ = zr3Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: E */
    public final void m11116E(o50 o50Var) {
        this.publicExponent_ = o50Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"bitField0_", "params_", "modulusSizeInBits_", "publicExponent_"});
        }
        if (iM4376u == 3) {
            return new tr3();
        }
        if (iM4376u == 4) {
            return new sr3(DEFAULT_INSTANCE);
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
        synchronized (tr3.class) {
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
    public final int m11117x() {
        return this.modulusSizeInBits_;
    }

    /* JADX INFO: renamed from: y */
    public final zr3 m11118y() {
        zr3 zr3Var = this.params_;
        return zr3Var == null ? zr3.m13729x() : zr3Var;
    }

    /* JADX INFO: renamed from: z */
    public final t50 m11119z() {
        return this.publicExponent_;
    }
}
