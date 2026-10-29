package p000;

import java.util.Objects;

/* JADX INFO: renamed from: g8 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0679g8 extends AbstractC0640f7 {

    /* JADX INFO: renamed from: a */
    public int f19647a;

    /* JADX INFO: renamed from: b */
    public int f19648b;

    /* JADX INFO: renamed from: c */
    public int f19649c;

    /* JADX INFO: renamed from: d */
    public int f19650d;

    /* JADX INFO: renamed from: e */
    public C0973o7 f19651e;

    /* JADX INFO: renamed from: f */
    public C0641f8 f19652f;

    /* JADX INFO: renamed from: b */
    public static C0602e8 m5914b() {
        C0602e8 c0602e8 = new C0602e8();
        c0602e8.f17867a = null;
        c0602e8.f17868b = null;
        c0602e8.f17869c = null;
        c0602e8.f17870d = null;
        c0602e8.f17871e = null;
        c0602e8.f17872f = C0973o7.f26383i;
        return c0602e8;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f19651e != C0973o7.f26383i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0679g8)) {
            return false;
        }
        C0679g8 c0679g8 = (C0679g8) obj;
        return c0679g8.f19647a == this.f19647a && c0679g8.f19648b == this.f19648b && c0679g8.f19649c == this.f19649c && c0679g8.f19650d == this.f19650d && c0679g8.f19651e == this.f19651e && c0679g8.f19652f == this.f19652f;
    }

    public final int hashCode() {
        return Objects.hash(C0679g8.class, Integer.valueOf(this.f19647a), Integer.valueOf(this.f19648b), Integer.valueOf(this.f19649c), Integer.valueOf(this.f19650d), this.f19651e, this.f19652f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb.append(this.f19651e);
        sb.append(", hashType: ");
        sb.append(this.f19652f);
        sb.append(", ");
        sb.append(this.f19649c);
        sb.append("-byte IV, and ");
        sb.append(this.f19650d);
        sb.append("-byte tags, and ");
        sb.append(this.f19647a);
        sb.append("-byte AES key, and ");
        return c75.m3880l(sb, this.f19648b, "-byte HMAC key)");
    }
}
