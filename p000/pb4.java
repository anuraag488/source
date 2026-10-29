package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pb4 implements yw4 {

    /* JADX INFO: renamed from: a */
    public yw4 f27512a;

    /* JADX INFO: renamed from: b */
    public long f27513b;

    @Override // p000.yw4
    /* JADX INFO: renamed from: a */
    public final boolean mo3759a() {
        return this.f27512a.mo3759a();
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: c */
    public final long mo3358c(AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return this.f27512a.mo3358c(abstractC0654fk, abstractC0654fk2, abstractC0654fk3) + this.f27513b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pb4)) {
            return false;
        }
        pb4 pb4Var = (pb4) obj;
        return pb4Var.f27513b == this.f27513b && z62.m13387o(pb4Var.f27512a, this.f27512a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f27513b) + (this.f27512a.hashCode() * 31);
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: p */
    public final AbstractC0654fk mo4794p(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        long j2 = this.f27513b;
        return j < j2 ? abstractC0654fk3 : this.f27512a.mo4794p(j - j2, abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: s */
    public final AbstractC0654fk mo4795s(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        long j2 = this.f27513b;
        return j < j2 ? abstractC0654fk : this.f27512a.mo4795s(j - j2, abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
    }
}
