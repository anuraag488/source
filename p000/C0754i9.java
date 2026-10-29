package p000;

import java.util.Objects;

/* JADX INFO: renamed from: i9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0754i9 extends AbstractC0640f7 {

    /* JADX INFO: renamed from: a */
    public int f21179a;

    /* JADX INFO: renamed from: b */
    public int f21180b;

    /* JADX INFO: renamed from: c */
    public int f21181c;

    /* JADX INFO: renamed from: d */
    public C0973o7 f21182d;

    /* JADX INFO: renamed from: b */
    public static C1283w7 m6697b() {
        C1283w7 c1283w7 = new C1283w7((byte) 2);
        c1283w7.f33126b = null;
        c1283w7.f33127c = null;
        c1283w7.f33128d = null;
        c1283w7.f33129e = C0973o7.f26386l;
        return c1283w7;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f21182d != C0973o7.f26386l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0754i9)) {
            return false;
        }
        C0754i9 c0754i9 = (C0754i9) obj;
        return c0754i9.f21179a == this.f21179a && c0754i9.f21180b == this.f21180b && c0754i9.f21181c == this.f21181c && c0754i9.f21182d == this.f21182d;
    }

    public final int hashCode() {
        return Objects.hash(C0754i9.class, Integer.valueOf(this.f21179a), Integer.valueOf(this.f21180b), Integer.valueOf(this.f21181c), this.f21182d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f21182d);
        sb.append(", ");
        sb.append(this.f21180b);
        sb.append("-byte IV, ");
        sb.append(this.f21181c);
        sb.append("-byte tag, and ");
        return c75.m3880l(sb, this.f21179a, "-byte key)");
    }
}
