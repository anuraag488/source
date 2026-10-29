package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zc4 implements CharSequence {

    /* JADX INFO: renamed from: a */
    public char[] f35981a;

    /* JADX INFO: renamed from: b */
    public String f35982b;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f35981a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f35981a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.f35981a, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f35982b;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f35981a);
        this.f35982b = str2;
        return str2;
    }
}
