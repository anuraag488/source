package p000;

/* JADX INFO: renamed from: fp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0659fp extends AbstractC0696gp {

    /* JADX INFO: renamed from: a */
    public i73 f19210a;

    /* JADX INFO: renamed from: b */
    public me4 f19211b;

    @Override // p000.AbstractC0696gp
    /* JADX INFO: renamed from: a */
    public final i73 mo4634a() {
        return this.f19210a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0659fp)) {
            return false;
        }
        C0659fp c0659fp = (C0659fp) obj;
        return this.f19210a.equals(c0659fp.f19210a) && this.f19211b.equals(c0659fp.f19211b);
    }

    public final int hashCode() {
        return this.f19211b.hashCode() + (this.f19210a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f19210a + ", result=" + this.f19211b + ')';
    }
}
