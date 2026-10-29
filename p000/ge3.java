package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ge3 extends vr1 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final ge3 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile m83 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ge3 ge3Var = new ge3();
        DEFAULT_INSTANCE = ge3Var;
        vr1.m11978j(ge3.class, ge3Var);
    }

    /* JADX INFO: renamed from: o */
    public static ge3 m5981o() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static fe3 m5982w() {
        return (fe3) ((qr1) DEFAULT_INSTANCE.mo3989b(5));
    }

    /* JADX INFO: renamed from: A */
    public final void m5983A(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    /* JADX INFO: renamed from: B */
    public final void m5984B(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m5985C(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: D */
    public final void m5986D(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: renamed from: E */
    public final void m5987E(ee3 ee3Var) {
        this.value_ = ee3Var;
        this.valueCase_ = 6;
    }

    @Override // p000.vr1
    /* JADX INFO: renamed from: b */
    public final Object mo3989b(int i) {
        m83 sr1Var;
        int iM4376u = d55.m4376u(i);
        if (iM4376u == 0) {
            return (byte) 1;
        }
        if (iM4376u == 2) {
            return vr1.m11977h(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", ee3.class});
        }
        if (iM4376u == 3) {
            return new ge3();
        }
        if (iM4376u == 4) {
            return new fe3(DEFAULT_INSTANCE);
        }
        if (iM4376u == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iM4376u != 6) {
            throw null;
        }
        m83 m83Var = PARSER;
        if (m83Var != null) {
            return m83Var;
        }
        synchronized (ge3.class) {
            try {
                sr1Var = PARSER;
                if (sr1Var == null) {
                    sr1Var = new sr1(DEFAULT_INSTANCE);
                    PARSER = sr1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sr1Var;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m5988m() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final n50 m5989n() {
        return this.valueCase_ == 8 ? (n50) this.value_ : n50.f25466b;
    }

    /* JADX INFO: renamed from: p */
    public final double m5990p() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: q */
    public final float m5991q() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: r */
    public final int m5992r() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public final long m5993s() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: t */
    public final String m5994t() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: u */
    public final ee3 m5995u() {
        return this.valueCase_ == 6 ? (ee3) this.value_ : ee3.m5101n();
    }

    /* JADX INFO: renamed from: v */
    public final int m5996v() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5997x(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: y */
    public final void m5998y(p50 p50Var) {
        Objects.requireNonNull(p50Var);
        this.valueCase_ = 8;
        this.value_ = p50Var;
    }

    /* JADX INFO: renamed from: z */
    public final void m5999z(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }
}
