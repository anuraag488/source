package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r73 implements InterfaceC0728hk {

    /* JADX INFO: renamed from: a */
    public final int f29064a;

    /* JADX INFO: renamed from: b */
    public final int f29065b;

    /* JADX INFO: renamed from: c */
    public final long f29066c;

    /* JADX INFO: renamed from: d */
    public final al4 f29067d;

    /* JADX INFO: renamed from: e */
    public final mb3 f29068e;

    /* JADX INFO: renamed from: f */
    public final dl2 f29069f;

    /* JADX INFO: renamed from: g */
    public final int f29070g;

    /* JADX INFO: renamed from: h */
    public final int f29071h;

    /* JADX INFO: renamed from: i */
    public final ol4 f29072i;

    public r73(int i, int i2, long j, al4 al4Var, mb3 mb3Var, dl2 dl2Var, int i3, int i4, ol4 ol4Var) {
        this.f29064a = i;
        this.f29065b = i2;
        this.f29066c = j;
        this.f29067d = al4Var;
        this.f29068e = mb3Var;
        this.f29069f = dl2Var;
        this.f29070g = i3;
        this.f29071h = i4;
        this.f29072i = ol4Var;
        cm4[] cm4VarArr = bm4.f15418b;
        if (bm4.m3632b(j, bm4.f15419c)) {
            return;
        }
        if (bm4.m3634d(j) >= 0.0f) {
            return;
        }
        r32.m10187b("lineHeight can't be negative (" + bm4.m3634d(j) + ")");
    }

    /* JADX INFO: renamed from: a */
    public final r73 m10231a(r73 r73Var) {
        return r73Var == null ? this : s73.m10546a(this, r73Var.f29064a, r73Var.f29065b, r73Var.f29066c, r73Var.f29067d, r73Var.f29068e, r73Var.f29069f, r73Var.f29070g, r73Var.f29071h, r73Var.f29072i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r73)) {
            return false;
        }
        r73 r73Var = (r73) obj;
        return this.f29064a == r73Var.f29064a && this.f29065b == r73Var.f29065b && bm4.m3632b(this.f29066c, r73Var.f29066c) && z62.m13387o(this.f29067d, r73Var.f29067d) && z62.m13387o(this.f29068e, r73Var.f29068e) && z62.m13387o(this.f29069f, r73Var.f29069f) && this.f29070g == r73Var.f29070g && this.f29071h == r73Var.f29071h && z62.m13387o(this.f29072i, r73Var.f29072i);
    }

    public final int hashCode() {
        int iM13609i = zi4.m13609i(this.f29065b, Integer.hashCode(this.f29064a) * 31, 31);
        cm4[] cm4VarArr = bm4.f15418b;
        int iM13612l = zi4.m13612l(iM13609i, this.f29066c, 31);
        al4 al4Var = this.f29067d;
        int iHashCode = (iM13612l + (al4Var != null ? al4Var.hashCode() : 0)) * 31;
        mb3 mb3Var = this.f29068e;
        int iHashCode2 = (iHashCode + (mb3Var != null ? mb3Var.hashCode() : 0)) * 31;
        dl2 dl2Var = this.f29069f;
        int iM13609i2 = zi4.m13609i(this.f29071h, zi4.m13609i(this.f29070g, (iHashCode2 + (dl2Var != null ? dl2Var.hashCode() : 0)) * 31, 31), 31);
        ol4 ol4Var = this.f29072i;
        return iM13609i2 + (ol4Var != null ? ol4Var.hashCode() : 0);
    }

    public final String toString() {
        String strM12307a = wi4.m12307a(this.f29064a);
        String strM12698a = xj4.m12698a(this.f29065b);
        String strM3635e = bm4.m3635e(this.f29066c);
        String strM13151a = yk2.m13151a(this.f29070g);
        String strM5863a = fz1.m5863a(this.f29071h);
        StringBuilder sbM13625y = zi4.m13625y("ParagraphStyle(textAlign=", strM12307a, ", textDirection=", strM12698a, ", lineHeight=");
        sbM13625y.append(strM3635e);
        sbM13625y.append(", textIndent=");
        sbM13625y.append(this.f29067d);
        sbM13625y.append(", platformStyle=");
        sbM13625y.append(this.f29068e);
        sbM13625y.append(", lineHeightStyle=");
        sbM13625y.append(this.f29069f);
        sbM13625y.append(", lineBreak=");
        zi4.m13599B(sbM13625y, strM13151a, ", hyphens=", strM5863a, ", textMotion=");
        sbM13625y.append(this.f29072i);
        sbM13625y.append(")");
        return sbM13625y.toString();
    }
}
