package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ff4 extends gf4 {

    /* JADX INFO: renamed from: d */
    public bp1 f18952d;

    @Override // p000.gf4
    /* JADX INFO: renamed from: E */
    public final void mo5108E(int i, byte[] bArr) {
        m6000j();
        this.f18952d.mo3103E(i, bArr);
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: a */
    public final void mo5109a(int i, String str) {
        m6000j();
        this.f18952d.mo3104h(i, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18952d.close();
        this.f19771c = true;
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: g */
    public final boolean mo5112g() {
        m6000j();
        this.f18952d.f15477b.execute();
        return false;
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: m */
    public final void mo5115m(int i) {
        m6000j();
        this.f18952d.mo3105m(i);
    }

    @Override // p000.gf4
    /* JADX INFO: renamed from: z */
    public final void mo5117z(int i, long j) {
        m6000j();
        this.f18952d.mo3107z(i, j);
    }
}
