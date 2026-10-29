package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sn0 {
    public static final rn0 Companion = new rn0();

    /* JADX INFO: renamed from: a */
    public String f30400a;

    /* JADX INFO: renamed from: b */
    public String f30401b;

    public sn0(String str, String str2) {
        this.f30400a = str;
        this.f30401b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn0)) {
            return false;
        }
        sn0 sn0Var = (sn0) obj;
        return z62.m13387o(this.f30400a, sn0Var.f30400a) && z62.m13387o(this.f30401b, sn0Var.f30401b);
    }

    public final int hashCode() {
        return this.f30401b.hashCode() + (this.f30400a.hashCode() * 31);
    }

    public final String toString() {
        return zi4.m13622v("ControlToken(type=", this.f30400a, ", id=", this.f30401b, ")");
    }
}
