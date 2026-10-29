package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a54 extends AbstractC1093r2 {

    /* JADX INFO: renamed from: a */
    public long f116a;

    /* JADX INFO: renamed from: b */
    public b70 f117b;

    @Override // p000.AbstractC1093r2
    /* JADX INFO: renamed from: a */
    public final boolean mo92a(AbstractC1056q2 abstractC1056q2) {
        y44 y44Var = (y44) abstractC1056q2;
        if (this.f116a >= 0) {
            return false;
        }
        long j = y44Var.f34874i;
        if (j < y44Var.f34875j) {
            y44Var.f34875j = j;
        }
        this.f116a = j;
        return true;
    }

    @Override // p000.AbstractC1093r2
    /* JADX INFO: renamed from: b */
    public final wm0[] mo93b(AbstractC1056q2 abstractC1056q2) {
        long j = this.f116a;
        this.f116a = -1L;
        this.f117b = null;
        return ((y44) abstractC1056q2).m12891u(j);
    }
}
