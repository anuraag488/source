package p000;

/* JADX INFO: renamed from: av */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0468av {

    /* JADX INFO: renamed from: a */
    public int f14887a;

    /* JADX INFO: renamed from: b */
    public String f14888b;

    /* JADX INFO: renamed from: c */
    public int f14889c;

    /* JADX INFO: renamed from: d */
    public long f14890d;

    /* JADX INFO: renamed from: e */
    public long f14891e;

    /* JADX INFO: renamed from: f */
    public boolean f14892f;

    /* JADX INFO: renamed from: g */
    public int f14893g;

    /* JADX INFO: renamed from: h */
    public String f14894h;

    /* JADX INFO: renamed from: i */
    public String f14895i;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0468av) {
            C0468av c0468av = (C0468av) obj;
            if (this.f14887a == c0468av.f14887a && this.f14888b.equals(c0468av.f14888b) && this.f14889c == c0468av.f14889c && this.f14890d == c0468av.f14890d && this.f14891e == c0468av.f14891e && this.f14892f == c0468av.f14892f && this.f14893g == c0468av.f14893g && this.f14894h.equals(c0468av.f14894h) && this.f14895i.equals(c0468av.f14895i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f14887a ^ 1000003) * 1000003) ^ this.f14888b.hashCode()) * 1000003) ^ this.f14889c) * 1000003;
        long j = this.f14890d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f14891e;
        return this.f14895i.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f14892f ? 1231 : 1237)) * 1000003) ^ this.f14893g) * 1000003) ^ this.f14894h.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f14887a);
        sb.append(", model=");
        sb.append(this.f14888b);
        sb.append(", availableProcessors=");
        sb.append(this.f14889c);
        sb.append(", totalRam=");
        sb.append(this.f14890d);
        sb.append(", diskSpace=");
        sb.append(this.f14891e);
        sb.append(", isEmulator=");
        sb.append(this.f14892f);
        sb.append(", state=");
        sb.append(this.f14893g);
        sb.append(", manufacturer=");
        sb.append(this.f14894h);
        sb.append(", modelClass=");
        return zi4.m13623w(sb, this.f14895i, "}");
    }
}
