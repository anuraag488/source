package p000;

/* JADX INFO: renamed from: yu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1381yu {

    /* JADX INFO: renamed from: a */
    public C1418zu f35524a;

    /* JADX INFO: renamed from: b */
    public C0505bv f35525b;

    /* JADX INFO: renamed from: c */
    public C0468av f35526c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1381yu)) {
            return false;
        }
        C1381yu c1381yu = (C1381yu) obj;
        return this.f35524a.equals(c1381yu.f35524a) && this.f35525b.equals(c1381yu.f35525b) && this.f35526c.equals(c1381yu.f35526c);
    }

    public final int hashCode() {
        return this.f35526c.hashCode() ^ ((((this.f35524a.hashCode() ^ 1000003) * 1000003) ^ this.f35525b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f35524a + ", osData=" + this.f35525b + ", deviceData=" + this.f35526c + "}";
    }
}
