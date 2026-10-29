package p000;

/* JADX INFO: renamed from: o6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0972o6 {

    /* JADX INFO: renamed from: a */
    @s24("pcc")
    public final Integer f26364a;

    /* JADX INFO: renamed from: b */
    @s24("dload")
    public final Long f26365b;

    public C0972o6(Integer num, Long l) {
        this.f26364a = num;
        this.f26365b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0972o6)) {
            return false;
        }
        C0972o6 c0972o6 = (C0972o6) obj;
        return z62.m13387o(this.f26364a, c0972o6.f26364a) && z62.m13387o(this.f26365b, c0972o6.f26365b);
    }

    public final int hashCode() {
        Integer num = this.f26364a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.f26365b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "AdUnitQualitySignals(priorClickCount=" + this.f26364a + ", loadDuration=" + this.f26365b + ")";
    }
}
