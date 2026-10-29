package p000;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bb2 extends Number {

    /* JADX INFO: renamed from: a */
    public String f15197a;

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f15197a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bb2) {
            return this.f15197a.equals(((bb2) obj).f15197a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f15197a);
    }

    public final int hashCode() {
        return this.f15197a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f15197a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f15197a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f15197a;
    }
}
