package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pi0 extends li0 {

    /* JADX INFO: renamed from: d */
    public boolean f27630d;

    @Override // p000.li0
    /* JADX INFO: renamed from: c */
    public final void mo7975c(byte b) {
        if (this.f27630d) {
            mo7981j(String.valueOf(b & 255));
        } else {
            m7979h(String.valueOf(b & 255));
        }
    }

    @Override // p000.li0
    /* JADX INFO: renamed from: e */
    public final void mo7977e(int i) {
        boolean z = this.f27630d;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            mo7981j(unsignedString);
        } else {
            m7979h(unsignedString);
        }
    }

    @Override // p000.li0
    /* JADX INFO: renamed from: g */
    public final void mo7978g(long j) {
        boolean z = this.f27630d;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            mo7981j(unsignedString);
        } else {
            m7979h(unsignedString);
        }
    }

    @Override // p000.li0
    /* JADX INFO: renamed from: i */
    public final void mo7980i(short s) {
        if (this.f27630d) {
            mo7981j(String.valueOf(s & 65535));
        } else {
            m7979h(String.valueOf(s & 65535));
        }
    }
}
