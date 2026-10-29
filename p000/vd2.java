package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vd2 extends tr1 {
    private static final vd2 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile l83 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private rc2 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        vd2 vd2Var = new vd2();
        DEFAULT_INSTANCE = vd2Var;
        tr1.m11100v(vd2.class, vd2Var);
    }

    /* JADX INFO: renamed from: C */
    public static ud2 m11805C() {
        return (ud2) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: A */
    public final hd2 m11806A() {
        hd2 hd2Var;
        int i = this.status_;
        if (i == 0) {
            hd2Var = hd2.f20488b;
        } else if (i == 1) {
            hd2Var = hd2.f20489c;
        } else if (i != 2) {
            hd2Var = i != 3 ? null : hd2.f20491e;
        } else {
            hd2Var = hd2.f20490d;
        }
        return hd2Var == null ? hd2.f20492f : hd2Var;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m11807B() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final void m11808D(rc2 rc2Var) {
        this.keyData_ = rc2Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: E */
    public final void m11809E(int i) {
        this.keyId_ = i;
    }

    /* JADX INFO: renamed from: F */
    public final void m11810F(j63 j63Var) {
        this.outputPrefixType_ = j63Var.m7024b();
    }

    /* JADX INFO: renamed from: G */
    public final void m11811G(hd2 hd2Var) {
        this.status_ = hd2Var.m6334a();
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (iM4376u == 3) {
            return new vd2();
        }
        if (iM4376u == 4) {
            return new ud2(DEFAULT_INSTANCE);
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
        synchronized (vd2.class) {
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
    public final rc2 m11812x() {
        rc2 rc2Var = this.keyData_;
        return rc2Var == null ? rc2.m10286x() : rc2Var;
    }

    /* JADX INFO: renamed from: y */
    public final int m11813y() {
        return this.keyId_;
    }

    /* JADX INFO: renamed from: z */
    public final j63 m11814z() {
        j63 j63VarM7023a = j63.m7023a(this.outputPrefixType_);
        return j63VarM7023a == null ? j63.f22050h : j63VarM7023a;
    }
}
