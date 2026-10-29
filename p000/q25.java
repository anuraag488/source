package p000;

import androidx.work.OverwritingInputMerger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q25 {

    /* JADX INFO: renamed from: a */
    public final String f28162a;

    /* JADX INFO: renamed from: b */
    public f25 f28163b;

    /* JADX INFO: renamed from: c */
    public final String f28164c;

    /* JADX INFO: renamed from: d */
    public final String f28165d;

    /* JADX INFO: renamed from: e */
    public zs0 f28166e;

    /* JADX INFO: renamed from: f */
    public final zs0 f28167f;

    /* JADX INFO: renamed from: g */
    public final long f28168g;

    /* JADX INFO: renamed from: h */
    public final long f28169h;

    /* JADX INFO: renamed from: i */
    public final long f28170i;

    /* JADX INFO: renamed from: j */
    public jl0 f28171j;

    /* JADX INFO: renamed from: k */
    public final int f28172k;

    /* JADX INFO: renamed from: l */
    public final EnumC0887lw f28173l;

    /* JADX INFO: renamed from: m */
    public final long f28174m;

    /* JADX INFO: renamed from: n */
    public long f28175n;

    /* JADX INFO: renamed from: o */
    public final long f28176o;

    /* JADX INFO: renamed from: p */
    public final long f28177p;

    /* JADX INFO: renamed from: q */
    public boolean f28178q;

    /* JADX INFO: renamed from: r */
    public final f63 f28179r;

    /* JADX INFO: renamed from: s */
    public final int f28180s;

    /* JADX INFO: renamed from: t */
    public final int f28181t;

    /* JADX INFO: renamed from: u */
    public final long f28182u;

    /* JADX INFO: renamed from: v */
    public final int f28183v;

    /* JADX INFO: renamed from: w */
    public final int f28184w;

    /* JADX INFO: renamed from: x */
    public String f28185x;

    /* JADX INFO: renamed from: y */
    public final Boolean f28186y;

    static {
        wn2.m12327g("WorkSpec");
    }

    public /* synthetic */ q25(String str, f25 f25Var, String str2, String str3, zs0 zs0Var, zs0 zs0Var2, long j, long j2, long j3, jl0 jl0Var, int i, EnumC0887lw enumC0887lw, long j4, long j5, long j6, long j7, boolean z, f63 f63Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? f25.f18681a : f25Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? zs0.f36338b : zs0Var, (i5 & 32) != 0 ? zs0.f36338b : zs0Var2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? jl0.f22381j : jl0Var, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? EnumC0887lw.f24406a : enumC0887lw, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z, (131072 & i5) != 0 ? f63.f18787a : f63Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX INFO: renamed from: a */
    public final long m9716a() {
        return C0638f5.m5535f(this.f28163b == f25.f18681a && this.f28172k > 0, this.f28172k, this.f28173l, this.f28174m, this.f28175n, this.f28180s, m9717b(), this.f28168g, this.f28170i, this.f28169h, this.f28182u);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9717b() {
        return this.f28169h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q25)) {
            return false;
        }
        q25 q25Var = (q25) obj;
        return z62.m13387o(this.f28162a, q25Var.f28162a) && this.f28163b == q25Var.f28163b && z62.m13387o(this.f28164c, q25Var.f28164c) && z62.m13387o(this.f28165d, q25Var.f28165d) && z62.m13387o(this.f28166e, q25Var.f28166e) && z62.m13387o(this.f28167f, q25Var.f28167f) && this.f28168g == q25Var.f28168g && this.f28169h == q25Var.f28169h && this.f28170i == q25Var.f28170i && z62.m13387o(this.f28171j, q25Var.f28171j) && this.f28172k == q25Var.f28172k && this.f28173l == q25Var.f28173l && this.f28174m == q25Var.f28174m && this.f28175n == q25Var.f28175n && this.f28176o == q25Var.f28176o && this.f28177p == q25Var.f28177p && this.f28178q == q25Var.f28178q && this.f28179r == q25Var.f28179r && this.f28180s == q25Var.f28180s && this.f28181t == q25Var.f28181t && this.f28182u == q25Var.f28182u && this.f28183v == q25Var.f28183v && this.f28184w == q25Var.f28184w && z62.m13387o(this.f28185x, q25Var.f28185x) && z62.m13387o(this.f28186y, q25Var.f28186y);
    }

    public final int hashCode() {
        int iM13609i = zi4.m13609i(this.f28184w, zi4.m13609i(this.f28183v, zi4.m13612l(zi4.m13609i(this.f28181t, zi4.m13609i(this.f28180s, (this.f28179r.hashCode() + zi4.m13611k(zi4.m13612l(zi4.m13612l(zi4.m13612l(zi4.m13612l((this.f28173l.hashCode() + zi4.m13609i(this.f28172k, (this.f28171j.hashCode() + zi4.m13612l(zi4.m13612l(zi4.m13612l((this.f28167f.hashCode() + ((this.f28166e.hashCode() + zi4.m13613m(zi4.m13613m((this.f28163b.hashCode() + (this.f28162a.hashCode() * 31)) * 31, this.f28164c, 31), this.f28165d, 31)) * 31)) * 31, this.f28168g, 31), this.f28169h, 31), this.f28170i, 31)) * 31, 31)) * 31, this.f28174m, 31), this.f28175n, 31), this.f28176o, 31), this.f28177p, 31), 31, this.f28178q)) * 31, 31), 31), this.f28182u, 31), 31), 31);
        String str = this.f28185x;
        int iHashCode = (iM13609i + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f28186y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return zi4.m13621u("{WorkSpec: ", this.f28162a, "}");
    }

    public q25(String str, f25 f25Var, String str2, String str3, zs0 zs0Var, zs0 zs0Var2, long j, long j2, long j3, jl0 jl0Var, int i, EnumC0887lw enumC0887lw, long j4, long j5, long j6, long j7, boolean z, f63 f63Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        this.f28162a = str;
        this.f28163b = f25Var;
        this.f28164c = str2;
        this.f28165d = str3;
        this.f28166e = zs0Var;
        this.f28167f = zs0Var2;
        this.f28168g = j;
        this.f28169h = j2;
        this.f28170i = j3;
        this.f28171j = jl0Var;
        this.f28172k = i;
        this.f28173l = enumC0887lw;
        this.f28174m = j4;
        this.f28175n = j5;
        this.f28176o = j6;
        this.f28177p = j7;
        this.f28178q = z;
        this.f28179r = f63Var;
        this.f28180s = i2;
        this.f28181t = i3;
        this.f28182u = j8;
        this.f28183v = i4;
        this.f28184w = i5;
        this.f28185x = str4;
        this.f28186y = bool;
    }
}
