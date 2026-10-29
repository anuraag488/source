package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class to5 extends ur1 {
    private static final to5 DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 2;
    private static volatile yu5 PARSER = null;
    public static final int PORT_FIELD_NUMBER = 3;
    public static final int SCHEME_FIELD_NUMBER = 1;
    private int bitField0_;
    private String host_ = "";
    private int port_;
    private int scheme_;

    static {
        to5 to5Var = new to5();
        DEFAULT_INSTANCE = to5Var;
        ur1.m11628e(to5.class, to5Var);
    }

    /* JADX INFO: renamed from: l */
    public static go5 m11083l() {
        return (go5) ((gq5) DEFAULT_INSTANCE.mo5307i(5));
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m11084m(to5 to5Var, String str) {
        str.getClass();
        to5Var.bitField0_ |= 2;
        to5Var.host_ = str;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m11085n(to5 to5Var, int i) {
        to5Var.bitField0_ |= 4;
        to5Var.port_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m11086o(to5 to5Var, int i) {
        to5Var.scheme_ = i - 1;
        to5Var.bitField0_ |= 1;
    }

    @Override // p000.ur1
    /* JADX INFO: renamed from: i */
    public final Object mo5307i(int i) {
        yu5 lq5Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return ur1.m11631k(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"bitField0_", "scheme_", lp5.f24272a, "host_", "port_"});
        }
        if (i2 == 3) {
            return new to5();
        }
        if (i2 == 4) {
            return new go5(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (i2 != 6) {
            throw null;
        }
        yu5 yu5Var = PARSER;
        if (yu5Var != null) {
            return yu5Var;
        }
        synchronized (to5.class) {
            try {
                lq5Var = PARSER;
                if (lq5Var == null) {
                    lq5Var = new lq5(DEFAULT_INSTANCE);
                    PARSER = lq5Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lq5Var;
    }
}
