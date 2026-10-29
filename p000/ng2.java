package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ng2 extends Number {

    /* JADX INFO: renamed from: a */
    public final String f25771a;

    public ng2(String str) {
        this.f25771a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f25771a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ng2) {
            return this.f25771a.equals(((ng2) obj).f25771a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f25771a);
    }

    public final int hashCode() {
        return this.f25771a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f25771a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return AbstractC0647fd.m5654L(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f25771a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return AbstractC0647fd.m5654L(str).longValue();
        }
    }

    public final String toString() {
        return this.f25771a;
    }
}
