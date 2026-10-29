package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jd2 extends tr1 {
    private static final jd2 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile l83 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private t50 value_ = t50.f30782b;

    static {
        jd2 jd2Var = new jd2();
        DEFAULT_INSTANCE = jd2Var;
        tr1.m11100v(jd2.class, jd2Var);
    }

    /* JADX INFO: renamed from: B */
    public static id2 m7068B() {
        return (id2) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: C */
    public static jd2 m7069C(byte[] bArr, qc1 qc1Var) {
        return (jd2) tr1.m11099u(DEFAULT_INSTANCE, bArr, qc1Var);
    }

    /* JADX INFO: renamed from: x */
    public static jd2 m7070x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final t50 m7071A() {
        return this.value_;
    }

    /* JADX INFO: renamed from: D */
    public final void m7072D(j63 j63Var) {
        this.outputPrefixType_ = j63Var.m7024b();
    }

    /* JADX INFO: renamed from: E */
    public final void m7073E(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: F */
    public final void m7074F(t50 t50Var) {
        t50Var.getClass();
        this.value_ = t50Var;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
        }
        if (iM4376u == 3) {
            return new jd2();
        }
        if (iM4376u == 4) {
            return new id2(DEFAULT_INSTANCE);
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
        synchronized (jd2.class) {
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
    public final j63 m7075y() {
        j63 j63VarM7023a = j63.m7023a(this.outputPrefixType_);
        return j63VarM7023a == null ? j63.f22050h : j63VarM7023a;
    }

    /* JADX INFO: renamed from: z */
    public final String m7076z() {
        return this.typeUrl_;
    }
}
