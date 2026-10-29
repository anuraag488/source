package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n71 implements c22 {

    /* JADX INFO: renamed from: a */
    public final boolean f25489a;

    public n71(boolean z) {
        this.f25489a = z;
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: b */
    public final boolean mo146b() {
        return this.f25489a;
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: d */
    public final g13 mo148d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f25489a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
