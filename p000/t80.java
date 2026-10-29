package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t80 implements CharSequence {

    /* JADX INFO: renamed from: a */
    public char[] f30984a;

    /* JADX INFO: renamed from: b */
    public int f30985b;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f30984a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f30985b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return od4.m9037R(this.f30984a, i, Math.min(i2, this.f30985b));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f30985b;
        return od4.m9037R(this.f30984a, 0, Math.min(i, i));
    }
}
