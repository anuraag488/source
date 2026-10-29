package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wd2 extends tr1 {
    private static final wd2 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile l83 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private i62 key_ = sh3.f30275e;
    private int primaryKeyId_;

    static {
        wd2 wd2Var = new wd2();
        DEFAULT_INSTANCE = wd2Var;
        tr1.m11100v(wd2.class, wd2Var);
    }

    /* JADX INFO: renamed from: C */
    public static td2 m12226C() {
        return (td2) DEFAULT_INSTANCE.m11104h();
    }

    /* JADX INFO: renamed from: D */
    public static wd2 m12227D(byte[] bArr, qc1 qc1Var) {
        return (wd2) tr1.m11099u(DEFAULT_INSTANCE, bArr, qc1Var);
    }

    /* JADX INFO: renamed from: A */
    public final i62 m12228A() {
        return this.key_;
    }

    /* JADX INFO: renamed from: B */
    public final int m12229B() {
        return this.primaryKeyId_;
    }

    /* JADX INFO: renamed from: E */
    public final void m12230E(int i) {
        this.primaryKeyId_ = i;
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
            return tr1.m11097r(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", vd2.class});
        }
        if (iM4376u == 3) {
            return new wd2();
        }
        if (iM4376u == 4) {
            return new td2(DEFAULT_INSTANCE);
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
        synchronized (wd2.class) {
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
    public final void m12231x(vd2 vd2Var) {
        i62 i62VarMo6682n = this.key_;
        if (!((AbstractC0560d2) i62VarMo6682n).f16738a) {
            i62VarMo6682n = i62VarMo6682n.mo6682n(i62VarMo6682n.size() * 2);
            this.key_ = i62VarMo6682n;
        }
        i62VarMo6682n.add(vd2Var);
    }

    /* JADX INFO: renamed from: y */
    public final vd2 m12232y(int i) {
        return (vd2) this.key_.get(i);
    }

    /* JADX INFO: renamed from: z */
    public final int m12233z() {
        return this.key_.size();
    }
}
