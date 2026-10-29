package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nc3 {

    /* JADX INFO: renamed from: a */
    public long f25673a;

    /* JADX INFO: renamed from: b */
    public long f25674b;

    /* JADX INFO: renamed from: c */
    public long f25675c;

    /* JADX INFO: renamed from: d */
    public long f25676d;

    /* JADX INFO: renamed from: e */
    public boolean f25677e;

    /* JADX INFO: renamed from: f */
    public float f25678f;

    /* JADX INFO: renamed from: g */
    public int f25679g;

    /* JADX INFO: renamed from: h */
    public boolean f25680h;

    /* JADX INFO: renamed from: i */
    public ArrayList f25681i;

    /* JADX INFO: renamed from: j */
    public long f25682j;

    /* JADX INFO: renamed from: k */
    public float f25683k;

    /* JADX INFO: renamed from: l */
    public long f25684l;

    /* JADX INFO: renamed from: m */
    public long f25685m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc3)) {
            return false;
        }
        nc3 nc3Var = (nc3) obj;
        return c20.m3818m(this.f25673a, nc3Var.f25673a) && this.f25674b == nc3Var.f25674b && b33.m3425c(this.f25675c, nc3Var.f25675c) && b33.m3425c(this.f25676d, nc3Var.f25676d) && this.f25677e == nc3Var.f25677e && Float.compare(this.f25678f, nc3Var.f25678f) == 0 && this.f25679g == nc3Var.f25679g && this.f25680h == nc3Var.f25680h && this.f25681i.equals(nc3Var.f25681i) && b33.m3425c(this.f25682j, nc3Var.f25682j) && Float.compare(this.f25683k, nc3Var.f25683k) == 0 && b33.m3425c(this.f25684l, nc3Var.f25684l) && b33.m3425c(this.f25685m, nc3Var.f25685m);
    }

    public final int hashCode() {
        return Long.hashCode(this.f25685m) + zi4.m13612l(c75.m3874f(this.f25683k, zi4.m13612l(c75.m3876h(this.f25681i, zi4.m13611k(zi4.m13609i(this.f25679g, c75.m3874f(this.f25678f, zi4.m13611k(zi4.m13612l(zi4.m13612l(zi4.m13612l(Long.hashCode(this.f25673a) * 31, this.f25674b, 31), this.f25675c, 31), this.f25676d, 31), 31, this.f25677e), 31), 31), 31, this.f25680h), 31), this.f25682j, 31), 31), this.f25684l, 31);
    }

    public final String toString() {
        String strM3802G = c20.m3802G(this.f25673a);
        long j = this.f25674b;
        String strM3432j = b33.m3432j(this.f25675c);
        String strM3432j2 = b33.m3432j(this.f25676d);
        boolean z = this.f25677e;
        float f = this.f25678f;
        String strM11030a = tc3.m11030a(this.f25679g);
        boolean z2 = this.f25680h;
        ArrayList arrayList = this.f25681i;
        String strM3432j3 = b33.m3432j(this.f25682j);
        float f2 = this.f25683k;
        String strM3432j4 = b33.m3432j(this.f25684l);
        String strM3432j5 = b33.m3432j(this.f25685m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strM3802G);
        sb.append(", uptime=");
        sb.append(j);
        zi4.m13599B(sb, ", positionOnScreen=", strM3432j, ", position=", strM3432j2);
        sb.append(", down=");
        sb.append(z);
        sb.append(", pressure=");
        sb.append(f);
        sb.append(", type=");
        sb.append(strM11030a);
        sb.append(", activeHover=");
        sb.append(z2);
        sb.append(", historical=");
        sb.append(arrayList);
        sb.append(", scrollDelta=");
        sb.append(strM3432j3);
        sb.append(", scaleGestureFactor=");
        sb.append(f2);
        sb.append(", panGestureOffset=");
        sb.append(strM3432j4);
        return c75.m3881m(sb, ", originalEventPosition=", strM3432j5, ")");
    }
}
