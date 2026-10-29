package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bg6 extends ig6 {

    /* JADX INFO: renamed from: d */
    public int f15260d;

    @Override // p000.ig6
    /* JADX INFO: renamed from: b */
    public final byte mo3591b(int i) {
        int i2 = this.f15260d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f21414b[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // p000.ig6
    /* JADX INFO: renamed from: c */
    public final byte mo3592c(int i) {
        return this.f21414b[i];
    }

    @Override // p000.ig6
    /* JADX INFO: renamed from: d */
    public final int mo3593d() {
        return this.f15260d;
    }
}
