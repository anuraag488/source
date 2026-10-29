package p000;

/* JADX INFO: renamed from: am */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0459am {

    /* JADX INFO: renamed from: a */
    public ro0 f14619a;

    /* JADX INFO: renamed from: b */
    public so0 f14620b;

    /* JADX INFO: renamed from: c */
    public so0 f14621c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0459am)) {
            return false;
        }
        C0459am c0459am = (C0459am) obj;
        return z62.m13387o(this.f14619a, c0459am.f14619a) && z62.m13387o(this.f14620b, c0459am.f14620b) && z62.m13387o(this.f14621c, c0459am.f14621c);
    }

    public final int hashCode() {
        return this.f14621c.hashCode() + ((this.f14620b.hashCode() + (this.f14619a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AppDispatchers(main=" + this.f14619a + ", computation=" + this.f14620b + ", io=" + this.f14621c + ")";
    }
}
