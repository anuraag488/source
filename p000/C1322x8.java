package p000;

import java.util.Objects;

/* JADX INFO: renamed from: x8 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1322x8 extends AbstractC0640f7 {

    /* JADX INFO: renamed from: a */
    public int f34054a;

    /* JADX INFO: renamed from: b */
    public int f34055b;

    /* JADX INFO: renamed from: c */
    public int f34056c;

    /* JADX INFO: renamed from: d */
    public C0641f8 f34057d;

    /* JADX INFO: renamed from: b */
    public static C1283w7 m12527b() {
        C1283w7 c1283w7 = new C1283w7((byte) 1);
        c1283w7.f33126b = null;
        c1283w7.f33127c = null;
        c1283w7.f33128d = null;
        c1283w7.f33129e = C0641f8.f18809j;
        return c1283w7;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f34057d != C0641f8.f18809j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1322x8)) {
            return false;
        }
        C1322x8 c1322x8 = (C1322x8) obj;
        return c1322x8.f34054a == this.f34054a && c1322x8.f34055b == this.f34055b && c1322x8.f34056c == this.f34056c && c1322x8.f34057d == this.f34057d;
    }

    public final int hashCode() {
        return Objects.hash(C1322x8.class, Integer.valueOf(this.f34054a), Integer.valueOf(this.f34055b), Integer.valueOf(this.f34056c), this.f34057d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f34057d);
        sb.append(", ");
        sb.append(this.f34055b);
        sb.append("-byte IV, ");
        sb.append(this.f34056c);
        sb.append("-byte tag, and ");
        return c75.m3880l(sb, this.f34054a, "-byte key)");
    }
}
