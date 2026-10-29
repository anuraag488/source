package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class er6 extends ur1 {
    public static final int APPLY_EVEN_IF_CRONET_TELEMETRY_DISABLED_FIELD_NUMBER = 8;
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BOOL_VALUE_FIELD_NUMBER = 3;
    public static final int BYTES_VALUE_FIELD_NUMBER = 7;
    private static final er6 DEFAULT_INSTANCE;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
    public static final int INT_VALUE_FIELD_NUMBER = 4;
    public static final int MIN_VERSION_FIELD_NUMBER = 2;
    private static volatile yu5 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 6;
    private boolean applyEvenIfCronetTelemetryDisabled_;
    private int bitField0_;
    private Object value_;
    private int valueCase_ = 0;
    private String appId_ = "";
    private String minVersion_ = "";

    static {
        er6 er6Var = new er6();
        DEFAULT_INSTANCE = er6Var;
        ur1.m11628e(er6.class, er6Var);
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
            return ur1.m11631k(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000\bဇ\u0002", new Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_", "applyEvenIfCronetTelemetryDisabled_"});
        }
        if (i2 == 3) {
            return new er6();
        }
        if (i2 == 4) {
            return new iq6(DEFAULT_INSTANCE);
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
        synchronized (er6.class) {
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

    /* JADX INFO: renamed from: l */
    public final float m5308l() {
        if (this.valueCase_ == 5) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: m */
    public final long m5309m() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: n */
    public final String m5310n() {
        return this.appId_;
    }

    /* JADX INFO: renamed from: o */
    public final String m5311o() {
        return this.minVersion_;
    }

    /* JADX INFO: renamed from: p */
    public final String m5312p() {
        return this.valueCase_ == 6 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: q */
    public final aj6 m5313q() {
        return this.valueCase_ == 7 ? (aj6) this.value_ : aj6.f14569b;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5314r() {
        return this.applyEvenIfCronetTelemetryDisabled_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5315s() {
        if (this.valueCase_ == 3) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5316t() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5317u() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final int m5318v() {
        int i = this.valueCase_;
        if (i == 0) {
            return 6;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 5) {
            return 3;
        }
        if (i != 6) {
            return i != 7 ? 0 : 5;
        }
        return 4;
    }
}
