package p000;

import java.util.List;

/* JADX INFO: renamed from: et */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0625et extends dq0 {

    /* JADX INFO: renamed from: a */
    public String f18456a;

    /* JADX INFO: renamed from: b */
    public String f18457b;

    /* JADX INFO: renamed from: c */
    public List f18458c;

    /* JADX INFO: renamed from: d */
    public dq0 f18459d;

    /* JADX INFO: renamed from: e */
    public int f18460e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dq0) {
            C0625et c0625et = (C0625et) ((dq0) obj);
            if (this.f18456a.equals(c0625et.f18456a)) {
                String str = this.f18457b;
                String str2 = c0625et.f18457b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    if (this.f18458c.equals(c0625et.f18458c)) {
                        dq0 dq0Var = this.f18459d;
                        dq0 dq0Var2 = c0625et.f18459d;
                        if (dq0Var != null ? dq0Var.equals(dq0Var2) : dq0Var2 == null) {
                            if (this.f18460e == c0625et.f18460e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f18456a.hashCode() ^ 1000003) * 1000003;
        String str = this.f18457b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f18458c.hashCode()) * 1000003;
        dq0 dq0Var = this.f18459d;
        return this.f18460e ^ ((iHashCode2 ^ (dq0Var != null ? dq0Var.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f18456a);
        sb.append(", reason=");
        sb.append(this.f18457b);
        sb.append(", frames=");
        sb.append(this.f18458c);
        sb.append(", causedBy=");
        sb.append(this.f18459d);
        sb.append(", overflowCount=");
        return c75.m3880l(sb, this.f18460e, "}");
    }
}
