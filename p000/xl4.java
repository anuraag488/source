package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xl4 {

    /* JADX INFO: renamed from: d */
    public static final xl4 f34388d = new xl4(0, 0, null, 0, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a */
    public final pa4 f34389a;

    /* JADX INFO: renamed from: b */
    public final r73 f34390b;

    /* JADX INFO: renamed from: c */
    public final zb3 f34391c;

    public xl4(long j, long j2, xm1 xm1Var, long j3, long j4, int i, long j5, int i2) {
        this(new pa4((i2 & 1) != 0 ? pb0.f27501h : j, (i2 & 2) != 0 ? bm4.f15419c : j2, (i2 & 4) != 0 ? null : xm1Var, null, null, null, null, (i2 & 128) != 0 ? bm4.f15419c : j3, null, null, null, (i2 & 2048) != 0 ? pb0.f27501h : j4, null, null), new r73((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? bm4.f15419c : j5, null, null, null, 0, 0, null), null);
    }

    /* JADX INFO: renamed from: a */
    public static xl4 m12708a(xl4 xl4Var, long j, long j2, xm1 xm1Var, bm1 bm1Var, long j3, long j4, dl2 dl2Var, int i) {
        yk4 yk4Var;
        zb3 zb3Var = mw0.f25251a;
        long jMo5689a = (i & 1) != 0 ? xl4Var.f34389a.f27478a.mo5689a() : j;
        long j5 = (i & 2) != 0 ? xl4Var.f34389a.f27479b : j2;
        xm1 xm1Var2 = (i & 4) != 0 ? xl4Var.f34389a.f27480c : xm1Var;
        pa4 pa4Var = xl4Var.f34389a;
        tm1 tm1Var = pa4Var.f27481d;
        um1 um1Var = pa4Var.f27482e;
        bm1 bm1Var2 = (i & 32) != 0 ? pa4Var.f27483f : bm1Var;
        String str = pa4Var.f27484g;
        long j6 = (i & 128) != 0 ? pa4Var.f27485h : j3;
        C0471ay c0471ay = pa4Var.f27486i;
        zk4 zk4Var = pa4Var.f27487j;
        zm2 zm2Var = pa4Var.f27488k;
        long j7 = pa4Var.f27489l;
        uj4 uj4Var = pa4Var.f27490m;
        m44 m44Var = pa4Var.f27491n;
        qq2 qq2Var = pa4Var.f27492o;
        r73 r73Var = xl4Var.f34390b;
        int i2 = r73Var.f29064a;
        int i3 = (i & 65536) != 0 ? r73Var.f29065b : 1;
        long j8 = (i & 131072) != 0 ? r73Var.f29066c : j4;
        al4 al4Var = r73Var.f29067d;
        zb3 zb3Var2 = (i & 524288) != 0 ? xl4Var.f34391c : zb3Var;
        dl2 dl2Var2 = (i & 1048576) != 0 ? r73Var.f29069f : dl2Var;
        int i4 = r73Var.f29070g;
        int i5 = i3;
        int i6 = r73Var.f29071h;
        ol4 ol4Var = r73Var.f29072i;
        long jMo5689a2 = pa4Var.f27478a.mo5689a();
        int i7 = pb0.f27502i;
        if (ws4.m12408a(jMo5689a, jMo5689a2)) {
            yk4Var = pa4Var.f27478a;
        } else if (jMo5689a != 16) {
            fd0 fd0Var = new fd0();
            fd0Var.f18920a = jMo5689a;
            if (jMo5689a == 16) {
                r32.m10186a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
            }
            VarHandle.storeStoreFence();
            yk4Var = fd0Var;
        } else {
            yk4Var = ig1.f21365D;
        }
        return new xl4(new pa4(yk4Var, j5, xm1Var2, tm1Var, um1Var, bm1Var2, str, j6, c0471ay, zk4Var, zm2Var, j7, uj4Var, m44Var, qq2Var), new r73(i2, i5, j8, al4Var, zb3Var2 != null ? zb3Var2.f35919a : null, dl2Var2, i4, i6, ol4Var), zb3Var2);
    }

    /* JADX INFO: renamed from: e */
    public static xl4 m12709e(xl4 xl4Var, long j, long j2, xm1 xm1Var, bm1 bm1Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? bm4.f15419c : j2;
        xm1 xm1Var2 = (i2 & 4) != 0 ? null : xm1Var;
        bm1 bm1Var2 = (i2 & 32) != 0 ? null : bm1Var;
        long j6 = (i2 & 128) != 0 ? bm4.f15419c : j3;
        long j7 = pb0.f27501h;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? bm4.f15419c : j4;
        pa4 pa4VarM9810a = qa4.m9810a(xl4Var.f34389a, j, null, Float.NaN, j5, xm1Var2, null, null, bm1Var2, null, j6, null, null, null, j7, null, null, null);
        r73 r73VarM10546a = s73.m10546a(xl4Var.f34390b, i3, 0, j8, null, null, null, 0, 0, null);
        return (xl4Var.f34389a == pa4VarM9810a && xl4Var.f34390b == r73VarM10546a) ? xl4Var : new xl4(pa4VarM9810a, r73VarM10546a);
    }

    /* JADX INFO: renamed from: b */
    public final long m12710b() {
        return this.f34389a.f27478a.mo5689a();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12711c(xl4 xl4Var) {
        if (this != xl4Var) {
            return z62.m13387o(this.f34390b, xl4Var.f34390b) && this.f34389a.m9443a(xl4Var.f34389a);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final xl4 m12712d(xl4 xl4Var) {
        return (xl4Var == null || xl4Var.equals(f34388d)) ? this : new xl4(this.f34389a.m9445c(xl4Var.f34389a), this.f34390b.m10231a(xl4Var.f34390b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl4)) {
            return false;
        }
        xl4 xl4Var = (xl4) obj;
        return z62.m13387o(this.f34389a, xl4Var.f34389a) && z62.m13387o(this.f34390b, xl4Var.f34390b) && z62.m13387o(this.f34391c, xl4Var.f34391c);
    }

    public final int hashCode() {
        int iHashCode = (this.f34390b.hashCode() + (this.f34389a.hashCode() * 31)) * 31;
        zb3 zb3Var = this.f34391c;
        return iHashCode + (zb3Var != null ? zb3Var.hashCode() : 0);
    }

    public final String toString() {
        String strM9470i = pb0.m9470i(m12710b());
        pa4 pa4Var = this.f34389a;
        t30 t30VarMo5690f = pa4Var.f27478a.mo5690f();
        float fMo5691h = pa4Var.f27478a.mo5691h();
        String strM3635e = bm4.m3635e(pa4Var.f27479b);
        xm1 xm1Var = pa4Var.f27480c;
        tm1 tm1Var = pa4Var.f27481d;
        um1 um1Var = pa4Var.f27482e;
        bm1 bm1Var = pa4Var.f27483f;
        String str = pa4Var.f27484g;
        String strM3635e2 = bm4.m3635e(pa4Var.f27485h);
        C0471ay c0471ay = pa4Var.f27486i;
        zk4 zk4Var = pa4Var.f27487j;
        zm2 zm2Var = pa4Var.f27488k;
        String strM9470i2 = pb0.m9470i(pa4Var.f27489l);
        uj4 uj4Var = pa4Var.f27490m;
        m44 m44Var = pa4Var.f27491n;
        qq2 qq2Var = pa4Var.f27492o;
        r73 r73Var = this.f34390b;
        String strM12307a = wi4.m12307a(r73Var.f29064a);
        String strM12698a = xj4.m12698a(r73Var.f29065b);
        String strM3635e3 = bm4.m3635e(r73Var.f29066c);
        al4 al4Var = r73Var.f29067d;
        dl2 dl2Var = r73Var.f29069f;
        String strM13151a = yk2.m13151a(r73Var.f29070g);
        String strM5863a = fz1.m5863a(r73Var.f29071h);
        ol4 ol4Var = r73Var.f29072i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strM9470i);
        sb.append(", brush=");
        sb.append(t30VarMo5690f);
        sb.append(", alpha=");
        sb.append(fMo5691h);
        sb.append(", fontSize=");
        sb.append(strM3635e);
        sb.append(", fontWeight=");
        sb.append(xm1Var);
        sb.append(", fontStyle=");
        sb.append(tm1Var);
        sb.append(", fontSynthesis=");
        sb.append(um1Var);
        sb.append(", fontFamily=");
        sb.append(bm1Var);
        sb.append(", fontFeatureSettings=");
        zi4.m13599B(sb, str, ", letterSpacing=", strM3635e2, ", baselineShift=");
        sb.append(c0471ay);
        sb.append(", textGeometricTransform=");
        sb.append(zk4Var);
        sb.append(", localeList=");
        sb.append(zm2Var);
        sb.append(", background=");
        sb.append(strM9470i2);
        sb.append(", textDecoration=");
        sb.append(uj4Var);
        sb.append(", shadow=");
        sb.append(m44Var);
        sb.append(", drawStyle=");
        sb.append(qq2Var);
        sb.append(", textAlign=");
        sb.append(strM12307a);
        sb.append(", textDirection=");
        zi4.m13599B(sb, strM12698a, ", lineHeight=", strM3635e3, ", textIndent=");
        sb.append(al4Var);
        sb.append(", platformStyle=");
        sb.append(this.f34391c);
        sb.append(", lineHeightStyle=");
        sb.append(dl2Var);
        sb.append(", lineBreak=");
        sb.append(strM13151a);
        sb.append(", hyphens=");
        sb.append(strM5863a);
        sb.append(", textMotion=");
        sb.append(ol4Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xl4(pa4 pa4Var, r73 r73Var) {
        pa4Var.getClass();
        mb3 mb3Var = r73Var.f29068e;
        this(pa4Var, r73Var, mb3Var == null ? null : new zb3(mb3Var));
    }

    public xl4(pa4 pa4Var, r73 r73Var, zb3 zb3Var) {
        this.f34389a = pa4Var;
        this.f34390b = r73Var;
        this.f34391c = zb3Var;
    }
}
