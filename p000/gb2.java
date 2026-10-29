package p000;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gb2 extends ba2 {

    /* JADX INFO: renamed from: a */
    public Serializable f19705a;

    public gb2(String str) {
        Objects.requireNonNull(str);
        this.f19705a = str;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m5950u(gb2 gb2Var) {
        Serializable serializable = gb2Var.f19705a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: b */
    public final boolean mo3523b() {
        Serializable serializable = this.f19705a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(mo3532s());
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: c */
    public final double mo3524c() {
        return this.f19705a instanceof Number ? mo3531r().doubleValue() : Double.parseDouble(mo3532s());
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: d */
    public final float mo3525d() {
        return this.f19705a instanceof Number ? mo3531r().floatValue() : Float.parseFloat(mo3532s());
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: e */
    public final int mo3526e() {
        return this.f19705a instanceof Number ? mo3531r().intValue() : Integer.parseInt(mo3532s());
    }

    public final boolean equals(Object obj) {
        Serializable serializable = this.f19705a;
        if (this == obj) {
            return true;
        }
        if (obj == null || gb2.class != obj.getClass()) {
            return false;
        }
        gb2 gb2Var = (gb2) obj;
        Serializable serializable2 = gb2Var.f19705a;
        if (m5950u(this) && m5950u(gb2Var)) {
            if ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) {
                return m5951t().equals(gb2Var.m5951t());
            }
            return mo3531r().longValue() == gb2Var.mo3531r().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC0647fd.m5654L(mo3532s())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC0647fd.m5654L(gb2Var.mo3532s())) == 0;
        }
        double dMo3524c = mo3524c();
        double dMo3524c2 = gb2Var.mo3524c();
        if (dMo3524c != dMo3524c2) {
            return Double.isNaN(dMo3524c) && Double.isNaN(dMo3524c2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f19705a;
        if (m5950u(this)) {
            jDoubleToLongBits = mo3531r().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(mo3531r().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: q */
    public final long mo3530q() {
        return this.f19705a instanceof Number ? mo3531r().longValue() : Long.parseLong(mo3532s());
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: r */
    public final Number mo3531r() {
        Serializable serializable = this.f19705a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new ng2((String) serializable);
        }
        qm5.m9919j("Primitive is neither a number nor a string");
        return null;
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: s */
    public final String mo3532s() {
        Serializable serializable = this.f19705a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return mo3531r().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    /* JADX INFO: renamed from: t */
    public final BigInteger m5951t() {
        Serializable serializable = this.f19705a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m5950u(this)) {
            return BigInteger.valueOf(mo3531r().longValue());
        }
        String strMo3532s = mo3532s();
        AbstractC0647fd.m5682u(strMo3532s);
        return new BigInteger(strMo3532s);
    }

    @Override // p000.ba2
    /* JADX INFO: renamed from: a */
    public final ba2 mo3522a() {
        return this;
    }
}
