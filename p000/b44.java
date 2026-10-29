package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b44 {

    /* JADX INFO: renamed from: a */
    public int f15078a;

    /* JADX INFO: renamed from: b */
    public final int[] f15079b = new int[10];

    /* JADX INFO: renamed from: a */
    public final int m3433a() {
        if ((this.f15078a & 128) != 0) {
            return this.f15079b[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: b */
    public final void m3434b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f15079b;
            if (i >= iArr.length) {
                return;
            }
            this.f15078a = (1 << i) | this.f15078a;
            iArr[i] = i2;
        }
    }
}
