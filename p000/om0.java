package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class om0 {

    /* JADX INFO: renamed from: a */
    public long f26872a;

    /* JADX INFO: renamed from: b */
    public long f26873b;

    /* JADX INFO: renamed from: c */
    public long f26874c;

    /* JADX INFO: renamed from: d */
    public long f26875d;

    /* JADX INFO: renamed from: e */
    public long f26876e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof om0)) {
            return false;
        }
        long j = this.f26872a;
        om0 om0Var = (om0) obj;
        long j2 = om0Var.f26872a;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && ws4.m12408a(this.f26873b, om0Var.f26873b) && ws4.m12408a(this.f26874c, om0Var.f26874c) && ws4.m12408a(this.f26875d, om0Var.f26875d) && ws4.m12408a(this.f26876e, om0Var.f26876e);
    }

    public final int hashCode() {
        long j = this.f26872a;
        int i = pb0.f27502i;
        return Long.hashCode(this.f26876e) + zi4.m13612l(zi4.m13612l(zi4.m13612l(Long.hashCode(j) * 31, this.f26873b, 31), this.f26874c, 31), this.f26875d, 31);
    }

    public final String toString() {
        String strM9470i = pb0.m9470i(this.f26872a);
        String strM9470i2 = pb0.m9470i(this.f26873b);
        String strM9470i3 = pb0.m9470i(this.f26874c);
        String strM9470i4 = pb0.m9470i(this.f26875d);
        String strM9470i5 = pb0.m9470i(this.f26876e);
        StringBuilder sbM13625y = zi4.m13625y("ContextMenuColors(backgroundColor=", strM9470i, ", textColor=", strM9470i2, ", iconColor=");
        zi4.m13599B(sbM13625y, strM9470i3, ", disabledTextColor=", strM9470i4, ", disabledIconColor=");
        return zi4.m13623w(sbM13625y, strM9470i5, ")");
    }
}
