package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tm6 extends ym6 {
    @Override // p000.ym6
    /* JADX INFO: renamed from: b */
    public final byte mo11065b(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.f35340b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(c75.m3877i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c75.m3878j("Index > length: ", i, ", 47"));
    }

    @Override // p000.ym6
    /* JADX INFO: renamed from: c */
    public final byte mo11066c(int i) {
        return this.f35340b[i];
    }

    @Override // p000.ym6
    /* JADX INFO: renamed from: d */
    public final int mo11067d() {
        return 47;
    }
}
