package p000;

/* JADX INFO: renamed from: o1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0967o1 extends y42 {

    /* JADX INFO: renamed from: k */
    public /* synthetic */ ib2 f26278k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ String f26279l;

    /* JADX INFO: renamed from: N0 */
    public final void m8917N0(String str) {
        this.f26278k.mo6725J(this.f26279l, new na2(str, false, null));
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: h */
    public final void mo5922h(short s) {
        m8917N0(String.valueOf(s & 65535));
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: j */
    public final void mo5923j(byte b) {
        m8917N0(String.valueOf(b & 255));
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: p */
    public final void mo5927p(int i) {
        m8917N0(Integer.toUnsignedString(i));
    }

    @Override // p000.y42, p000.g81
    /* JADX INFO: renamed from: v */
    public final void mo5929v(long j) {
        m8917N0(Long.toUnsignedString(j));
    }
}
