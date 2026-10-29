package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l12 {

    /* JADX INFO: renamed from: f */
    public static final l12 f23696f = new l12(0, true, 1, 1, zm2.f36182c);

    /* JADX INFO: renamed from: a */
    public final int f23697a;

    /* JADX INFO: renamed from: b */
    public final boolean f23698b;

    /* JADX INFO: renamed from: c */
    public final int f23699c;

    /* JADX INFO: renamed from: d */
    public final int f23700d;

    /* JADX INFO: renamed from: e */
    public final zm2 f23701e;

    public l12(int i, boolean z, int i2, int i3, zm2 zm2Var) {
        this.f23697a = i;
        this.f23698b = z;
        this.f23699c = i2;
        this.f23700d = i3;
        this.f23701e = zm2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l12)) {
            return false;
        }
        l12 l12Var = (l12) obj;
        return this.f23697a == l12Var.f23697a && this.f23698b == l12Var.f23698b && this.f23699c == l12Var.f23699c && this.f23700d == l12Var.f23700d && z62.m13387o(this.f23701e, l12Var.f23701e);
    }

    public final int hashCode() {
        return this.f23701e.f36183a.hashCode() + zi4.m13609i(this.f23700d, zi4.m13609i(this.f23699c, zi4.m13611k(zi4.m13609i(this.f23697a, Boolean.hashCode(false) * 31, 31), 31, this.f23698b), 31), 961);
    }

    public final String toString() {
        String strM13667S = zp0.m13667S(this.f23697a);
        String strM4694W = dt0.m4694W(this.f23699c);
        String strM7358b = k12.m7358b(this.f23700d);
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        sb.append(strM13667S);
        sb.append(", autoCorrect=");
        sb.append(this.f23698b);
        sb.append(", keyboardType=");
        zi4.m13599B(sb, strM4694W, ", imeAction=", strM7358b, ", platformImeOptions=null, hintLocales=");
        sb.append(this.f23701e);
        sb.append(")");
        return sb.toString();
    }
}
