package p000;

import java.util.List;

/* JADX INFO: renamed from: ls */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0883ls extends vp0 {

    /* JADX INFO: renamed from: a */
    public int f24321a;

    /* JADX INFO: renamed from: b */
    public String f24322b;

    /* JADX INFO: renamed from: c */
    public int f24323c;

    /* JADX INFO: renamed from: d */
    public int f24324d;

    /* JADX INFO: renamed from: e */
    public long f24325e;

    /* JADX INFO: renamed from: f */
    public long f24326f;

    /* JADX INFO: renamed from: g */
    public long f24327g;

    /* JADX INFO: renamed from: h */
    public String f24328h;

    /* JADX INFO: renamed from: i */
    public List f24329i;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vp0) {
            C0883ls c0883ls = (C0883ls) ((vp0) obj);
            if (this.f24321a == c0883ls.f24321a && this.f24322b.equals(c0883ls.f24322b) && this.f24323c == c0883ls.f24323c && this.f24324d == c0883ls.f24324d && this.f24325e == c0883ls.f24325e && this.f24326f == c0883ls.f24326f && this.f24327g == c0883ls.f24327g) {
                String str = this.f24328h;
                String str2 = c0883ls.f24328h;
                if (str != null ? str.equals(str2) : str2 == null) {
                    List list = this.f24329i;
                    List list2 = c0883ls.f24329i;
                    if (list != null ? list.equals(list2) : list2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f24321a ^ 1000003) * 1000003) ^ this.f24322b.hashCode()) * 1000003) ^ this.f24323c) * 1000003) ^ this.f24324d) * 1000003;
        long j = this.f24325e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f24326f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f24327g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f24328h;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f24329i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f24321a + ", processName=" + this.f24322b + ", reasonCode=" + this.f24323c + ", importance=" + this.f24324d + ", pss=" + this.f24325e + ", rss=" + this.f24326f + ", timestamp=" + this.f24327g + ", traceFile=" + this.f24328h + ", buildIdMappingForArch=" + this.f24329i + "}";
    }
}
