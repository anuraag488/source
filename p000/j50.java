package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j50 extends o50 {

    /* JADX INFO: renamed from: e */
    public int f22025e;

    /* JADX INFO: renamed from: f */
    public int f22026f;

    @Override // p000.o50, p000.t50
    /* JADX INFO: renamed from: b */
    public final byte mo7013b(int i) {
        int i2 = this.f22026f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f26351d[this.f22025e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(c75.m3877i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(zi4.m13618r(i, i2, "Index > length: ", ", "));
    }

    @Override // p000.o50, p000.t50
    /* JADX INFO: renamed from: e */
    public final void mo7014e(int i, byte[] bArr) {
        System.arraycopy(this.f26351d, this.f22025e, bArr, 0, i);
    }

    @Override // p000.o50, p000.t50
    /* JADX INFO: renamed from: g */
    public final byte mo7015g(int i) {
        return this.f26351d[this.f22025e + i];
    }

    @Override // p000.o50
    /* JADX INFO: renamed from: m */
    public final int mo7016m() {
        return this.f22025e;
    }

    @Override // p000.o50, p000.t50
    public final int size() {
        return this.f22026f;
    }
}
