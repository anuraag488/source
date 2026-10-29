package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lc3 {

    /* JADX INFO: renamed from: a */
    public final long f23935a;

    /* JADX INFO: renamed from: b */
    public final long f23936b;

    /* JADX INFO: renamed from: c */
    public final long f23937c;

    /* JADX INFO: renamed from: d */
    public final boolean f23938d;

    /* JADX INFO: renamed from: e */
    public final float f23939e;

    /* JADX INFO: renamed from: f */
    public final long f23940f;

    /* JADX INFO: renamed from: g */
    public final long f23941g;

    /* JADX INFO: renamed from: h */
    public final boolean f23942h;

    /* JADX INFO: renamed from: i */
    public final int f23943i;

    /* JADX INFO: renamed from: j */
    public final long f23944j;

    /* JADX INFO: renamed from: k */
    public final float f23945k;

    /* JADX INFO: renamed from: l */
    public final long f23946l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f23947m;

    /* JADX INFO: renamed from: n */
    public final long f23948n;

    /* JADX INFO: renamed from: o */
    public boolean f23949o;

    /* JADX INFO: renamed from: p */
    public boolean f23950p;

    /* JADX INFO: renamed from: q */
    public lc3 f23951q;

    public lc3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.f23935a = j;
        this.f23936b = j2;
        this.f23937c = j3;
        this.f23938d = z;
        this.f23939e = f;
        this.f23940f = j4;
        this.f23941g = j5;
        this.f23942h = z2;
        this.f23943i = i;
        this.f23944j = j6;
        this.f23945k = f2;
        this.f23946l = j7;
        this.f23948n = 0L;
        this.f23949o = z3;
        this.f23950p = z3;
    }

    /* JADX INFO: renamed from: a */
    public final void m7952a() {
        lc3 lc3Var = this.f23951q;
        if (lc3Var == null) {
            this.f23949o = true;
            this.f23950p = true;
        } else if (lc3Var != null) {
            lc3Var.m7952a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final List m7953b() {
        ArrayList arrayList = this.f23947m;
        return arrayList == null ? v71.f32439a : arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7954c() {
        lc3 lc3Var = this.f23951q;
        if (lc3Var != null) {
            return lc3Var.m7954c();
        }
        return this.f23949o || this.f23950p;
    }

    public final String toString() {
        String strM3802G = c20.m3802G(this.f23935a);
        String strM3432j = b33.m3432j(this.f23937c);
        String strM3432j2 = b33.m3432j(this.f23941g);
        boolean zM7954c = m7954c();
        String strM11030a = tc3.m11030a(this.f23943i);
        List listM7953b = m7953b();
        String strM3432j3 = b33.m3432j(this.f23944j);
        String strM3432j4 = b33.m3432j(this.f23946l);
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append(strM3802G);
        sb.append(", uptimeMillis=");
        sb.append(this.f23936b);
        sb.append(", position=");
        sb.append(strM3432j);
        sb.append(", pressed=");
        sb.append(this.f23938d);
        sb.append(", pressure=");
        sb.append(this.f23939e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f23940f);
        sb.append(", previousPosition=");
        sb.append(strM3432j2);
        sb.append(", previousPressed=");
        sb.append(this.f23942h);
        sb.append(", isConsumed=");
        sb.append(zM7954c);
        sb.append(", type=");
        sb.append(strM11030a);
        sb.append(", historical=");
        sb.append(listM7953b);
        sb.append(", scrollDelta=");
        sb.append(strM3432j3);
        sb.append(", scaleFactor=");
        sb.append(this.f23945k);
        return c75.m3881m(sb, ", panOffset=", strM3432j4, ")");
    }

    public lc3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.f23947m = arrayList;
        this.f23948n = j8;
    }
}
