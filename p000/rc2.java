package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rc2 extends tr1 {
    private static final rc2 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile l83 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private t50 value_ = t50.f30782b;

    static {
        rc2 rc2Var = new rc2();
        DEFAULT_INSTANCE = rc2Var;
        tr1.m11100v(rc2.class, rc2Var);
    }

    /* JADX INFO: renamed from: B */
    public static pc2 m10285B() {
        return (pc2) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: x */
    public static rc2 m10286x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final t50 m10287A() {
        return this.value_;
    }

    /* JADX INFO: renamed from: C */
    public final void m10288C(qc2 qc2Var) {
        if (qc2Var != qc2.f28380g) {
            this.keyMaterialType_ = qc2Var.f28382a;
        } else {
            C1077qn.m9987m("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m10289D(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: E */
    public final void m10290E(t50 t50Var) {
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
        }
        if (iM4376u == 3) {
            return new rc2();
        }
        if (iM4376u == 4) {
            return new pc2(DEFAULT_INSTANCE);
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
        synchronized (rc2.class) {
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
    public final qc2 m10291y() {
        qc2 qc2Var;
        int i = this.keyMaterialType_;
        if (i == 0) {
            qc2Var = qc2.f28375b;
        } else if (i == 1) {
            qc2Var = qc2.f28376c;
        } else if (i == 2) {
            qc2Var = qc2.f28377d;
        } else if (i != 3) {
            qc2Var = i != 4 ? null : qc2.f28379f;
        } else {
            qc2Var = qc2.f28378e;
        }
        return qc2Var == null ? qc2.f28380g : qc2Var;
    }

    /* JADX INFO: renamed from: z */
    public final String m10292z() {
        return this.typeUrl_;
    }
}
