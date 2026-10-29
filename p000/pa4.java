package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pa4 implements InterfaceC0728hk {

    /* JADX INFO: renamed from: a */
    public final yk4 f27478a;

    /* JADX INFO: renamed from: b */
    public final long f27479b;

    /* JADX INFO: renamed from: c */
    public final xm1 f27480c;

    /* JADX INFO: renamed from: d */
    public final tm1 f27481d;

    /* JADX INFO: renamed from: e */
    public final um1 f27482e;

    /* JADX INFO: renamed from: f */
    public final bm1 f27483f;

    /* JADX INFO: renamed from: g */
    public final String f27484g;

    /* JADX INFO: renamed from: h */
    public final long f27485h;

    /* JADX INFO: renamed from: i */
    public final C0471ay f27486i;

    /* JADX INFO: renamed from: j */
    public final zk4 f27487j;

    /* JADX INFO: renamed from: k */
    public final zm2 f27488k;

    /* JADX INFO: renamed from: l */
    public final long f27489l;

    /* JADX INFO: renamed from: m */
    public final uj4 f27490m;

    /* JADX INFO: renamed from: n */
    public final m44 f27491n;

    /* JADX INFO: renamed from: o */
    public final qq2 f27492o;

    public pa4(long j, long j2, xm1 xm1Var, tm1 tm1Var, um1 um1Var, bm1 bm1Var, String str, long j3, C0471ay c0471ay, zk4 zk4Var, zm2 zm2Var, long j4, uj4 uj4Var, m44 m44Var, int i) {
        this((i & 1) != 0 ? pb0.f27501h : j, (i & 2) != 0 ? bm4.f15419c : j2, (i & 4) != 0 ? null : xm1Var, (i & 8) != 0 ? null : tm1Var, (i & 16) != 0 ? null : um1Var, (i & 32) != 0 ? null : bm1Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? bm4.f15419c : j3, (i & 256) != 0 ? null : c0471ay, (i & 512) != 0 ? null : zk4Var, (i & 1024) != 0 ? null : zm2Var, (i & 2048) != 0 ? pb0.f27501h : j4, (i & 4096) != 0 ? null : uj4Var, (i & 8192) != 0 ? null : m44Var);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9443a(pa4 pa4Var) {
        if (this == pa4Var) {
            return true;
        }
        if (!bm4.m3632b(this.f27479b, pa4Var.f27479b) || !z62.m13387o(this.f27480c, pa4Var.f27480c) || !z62.m13387o(this.f27481d, pa4Var.f27481d) || !z62.m13387o(this.f27482e, pa4Var.f27482e) || !z62.m13387o(this.f27483f, pa4Var.f27483f) || !z62.m13387o(this.f27484g, pa4Var.f27484g) || !bm4.m3632b(this.f27485h, pa4Var.f27485h) || !z62.m13387o(this.f27486i, pa4Var.f27486i) || !z62.m13387o(this.f27487j, pa4Var.f27487j) || !z62.m13387o(this.f27488k, pa4Var.f27488k)) {
            return false;
        }
        long j = pa4Var.f27489l;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f27489l, j);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9444b(pa4 pa4Var) {
        return z62.m13387o(this.f27478a, pa4Var.f27478a) && z62.m13387o(this.f27490m, pa4Var.f27490m) && z62.m13387o(this.f27491n, pa4Var.f27491n) && z62.m13387o(this.f27492o, pa4Var.f27492o);
    }

    /* JADX INFO: renamed from: c */
    public final pa4 m9445c(pa4 pa4Var) {
        if (pa4Var == null) {
            return this;
        }
        yk4 yk4Var = pa4Var.f27478a;
        return qa4.m9810a(this, yk4Var.mo5689a(), yk4Var.mo5690f(), yk4Var.mo5691h(), pa4Var.f27479b, pa4Var.f27480c, pa4Var.f27481d, pa4Var.f27482e, pa4Var.f27483f, pa4Var.f27484g, pa4Var.f27485h, pa4Var.f27486i, pa4Var.f27487j, pa4Var.f27488k, pa4Var.f27489l, pa4Var.f27490m, pa4Var.f27491n, pa4Var.f27492o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa4)) {
            return false;
        }
        pa4 pa4Var = (pa4) obj;
        return m9443a(pa4Var) && m9444b(pa4Var);
    }

    public final int hashCode() {
        yk4 yk4Var = this.f27478a;
        long jMo5689a = yk4Var.mo5689a();
        int i = pb0.f27502i;
        int iHashCode = Long.hashCode(jMo5689a) * 31;
        t30 t30VarMo5690f = yk4Var.mo5690f();
        int iHashCode2 = (Float.hashCode(yk4Var.mo5691h()) + ((iHashCode + (t30VarMo5690f != null ? t30VarMo5690f.hashCode() : 0)) * 31)) * 31;
        cm4[] cm4VarArr = bm4.f15418b;
        int iM13612l = zi4.m13612l(iHashCode2, this.f27479b, 31);
        xm1 xm1Var = this.f27480c;
        int i2 = (iM13612l + (xm1Var != null ? xm1Var.f34418a : 0)) * 31;
        tm1 tm1Var = this.f27481d;
        int iHashCode3 = (i2 + (tm1Var != null ? Integer.hashCode(tm1Var.f31237a) : 0)) * 31;
        um1 um1Var = this.f27482e;
        int iHashCode4 = (iHashCode3 + (um1Var != null ? Integer.hashCode(um1Var.f31990a) : 0)) * 31;
        bm1 bm1Var = this.f27483f;
        int iHashCode5 = (iHashCode4 + (bm1Var != null ? bm1Var.hashCode() : 0)) * 31;
        String str = this.f27484g;
        int iM13612l2 = zi4.m13612l((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, this.f27485h, 31);
        C0471ay c0471ay = this.f27486i;
        int iHashCode6 = (iM13612l2 + (c0471ay != null ? Float.hashCode(c0471ay.f14938a) : 0)) * 31;
        zk4 zk4Var = this.f27487j;
        int iHashCode7 = (iHashCode6 + (zk4Var != null ? zk4Var.hashCode() : 0)) * 31;
        zm2 zm2Var = this.f27488k;
        int iM13612l3 = zi4.m13612l((iHashCode7 + (zm2Var != null ? zm2Var.f36183a.hashCode() : 0)) * 31, this.f27489l, 31);
        uj4 uj4Var = this.f27490m;
        int i3 = (iM13612l3 + (uj4Var != null ? uj4Var.f31941a : 0)) * 31;
        m44 m44Var = this.f27491n;
        int iHashCode8 = (i3 + (m44Var != null ? m44Var.hashCode() : 0)) * 961;
        qq2 qq2Var = this.f27492o;
        return iHashCode8 + (qq2Var != null ? qq2Var.hashCode() : 0);
    }

    public final String toString() {
        yk4 yk4Var = this.f27478a;
        String strM9470i = pb0.m9470i(yk4Var.mo5689a());
        t30 t30VarMo5690f = yk4Var.mo5690f();
        float fMo5691h = yk4Var.mo5691h();
        String strM3635e = bm4.m3635e(this.f27479b);
        String strM3635e2 = bm4.m3635e(this.f27485h);
        String strM9470i2 = pb0.m9470i(this.f27489l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strM9470i);
        sb.append(", brush=");
        sb.append(t30VarMo5690f);
        sb.append(", alpha=");
        sb.append(fMo5691h);
        sb.append(", fontSize=");
        sb.append(strM3635e);
        sb.append(", fontWeight=");
        sb.append(this.f27480c);
        sb.append(", fontStyle=");
        sb.append(this.f27481d);
        sb.append(", fontSynthesis=");
        sb.append(this.f27482e);
        sb.append(", fontFamily=");
        sb.append(this.f27483f);
        sb.append(", fontFeatureSettings=");
        zi4.m13599B(sb, this.f27484g, ", letterSpacing=", strM3635e2, ", baselineShift=");
        sb.append(this.f27486i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f27487j);
        sb.append(", localeList=");
        sb.append(this.f27488k);
        sb.append(", background=");
        sb.append(strM9470i2);
        sb.append(", textDecoration=");
        sb.append(this.f27490m);
        sb.append(", shadow=");
        sb.append(this.f27491n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f27492o);
        sb.append(")");
        return sb.toString();
    }

    public pa4(yk4 yk4Var, long j, xm1 xm1Var, tm1 tm1Var, um1 um1Var, bm1 bm1Var, String str, long j2, C0471ay c0471ay, zk4 zk4Var, zm2 zm2Var, long j3, uj4 uj4Var, m44 m44Var, qq2 qq2Var) {
        this.f27478a = yk4Var;
        this.f27479b = j;
        this.f27480c = xm1Var;
        this.f27481d = tm1Var;
        this.f27482e = um1Var;
        this.f27483f = bm1Var;
        this.f27484g = str;
        this.f27485h = j2;
        this.f27486i = c0471ay;
        this.f27487j = zk4Var;
        this.f27488k = zm2Var;
        this.f27489l = j3;
        this.f27490m = uj4Var;
        this.f27491n = m44Var;
        this.f27492o = qq2Var;
    }

    public pa4(long j, long j2, xm1 xm1Var, tm1 tm1Var, um1 um1Var, bm1 bm1Var, String str, long j3, C0471ay c0471ay, zk4 zk4Var, zm2 zm2Var, long j4, uj4 uj4Var, m44 m44Var) {
        yk4 yk4Var;
        if (j != 16) {
            fd0 fd0Var = new fd0();
            fd0Var.f18920a = j;
            if (j == 16) {
                r32.m10186a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
            }
            VarHandle.storeStoreFence();
            yk4Var = fd0Var;
        } else {
            yk4Var = ig1.f21365D;
        }
        this(yk4Var, j2, xm1Var, tm1Var, um1Var, bm1Var, str, j3, c0471ay, zk4Var, zm2Var, j4, uj4Var, m44Var, (qq2) null);
    }
}
