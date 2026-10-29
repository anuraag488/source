package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class me2 extends tr1 {
    private static final me2 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile l83 PARSER;
    private int bitField0_;
    private jd2 dekTemplate_;
    private String kekUri_ = "";

    static {
        me2 me2Var = new me2();
        DEFAULT_INSTANCE = me2Var;
        tr1.m11100v(me2.class, me2Var);
    }

    /* JADX INFO: renamed from: A */
    public static le2 m8287A() {
        return (le2) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: B */
    public static me2 m8288B(t50 t50Var, qc1 qc1Var) {
        return (me2) tr1.m11098t(DEFAULT_INSTANCE, t50Var, qc1Var);
    }

    /* JADX INFO: renamed from: x */
    public static me2 m8289x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public final void m8290C(jd2 jd2Var) {
        jd2Var.getClass();
        this.dekTemplate_ = jd2Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: D */
    public final void m8291D(String str) {
        str.getClass();
        this.kekUri_ = str;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
        }
        if (iM4376u == 3) {
            return new me2();
        }
        if (iM4376u == 4) {
            return new le2(DEFAULT_INSTANCE);
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
        synchronized (me2.class) {
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
    public final jd2 m8292y() {
        jd2 jd2Var = this.dekTemplate_;
        return jd2Var == null ? jd2.m7070x() : jd2Var;
    }

    /* JADX INFO: renamed from: z */
    public final String m8293z() {
        return this.kekUri_;
    }
}
