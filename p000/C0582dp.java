package p000;

/* JADX INFO: renamed from: dp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0582dp extends AbstractC0696gp {

    /* JADX INFO: renamed from: a */
    public i73 f17249a;

    /* JADX INFO: renamed from: b */
    public ea1 f17250b;

    @Override // p000.AbstractC0696gp
    /* JADX INFO: renamed from: a */
    public final i73 mo4634a() {
        return this.f17249a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0582dp)) {
            return false;
        }
        C0582dp c0582dp = (C0582dp) obj;
        return z62.m13387o(this.f17249a, c0582dp.f17249a) && this.f17250b.equals(c0582dp.f17250b);
    }

    public final int hashCode() {
        i73 i73Var = this.f17249a;
        return this.f17250b.hashCode() + ((i73Var == null ? 0 : i73Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f17249a + ", result=" + this.f17250b + ')';
    }
}
