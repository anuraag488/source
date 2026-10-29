package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fs4 {

    /* JADX INFO: renamed from: a */
    public final bm1 f19249a;

    /* JADX INFO: renamed from: b */
    public final xm1 f19250b;

    /* JADX INFO: renamed from: c */
    public final int f19251c;

    /* JADX INFO: renamed from: d */
    public final int f19252d;

    /* JADX INFO: renamed from: e */
    public final Object f19253e;

    public fs4(bm1 bm1Var, xm1 xm1Var, int i, int i2, Object obj) {
        this.f19249a = bm1Var;
        this.f19250b = xm1Var;
        this.f19251c = i;
        this.f19252d = i2;
        this.f19253e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs4)) {
            return false;
        }
        fs4 fs4Var = (fs4) obj;
        return z62.m13387o(this.f19249a, fs4Var.f19249a) && z62.m13387o(this.f19250b, fs4Var.f19250b) && this.f19251c == fs4Var.f19251c && this.f19252d == fs4Var.f19252d && z62.m13387o(this.f19253e, fs4Var.f19253e);
    }

    public final int hashCode() {
        bm1 bm1Var = this.f19249a;
        int iM13609i = zi4.m13609i(this.f19252d, zi4.m13609i(this.f19251c, (((bm1Var == null ? 0 : bm1Var.hashCode()) * 31) + this.f19250b.f34418a) * 31, 31), 31);
        Object obj = this.f19253e;
        return iM13609i + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.f19251c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        int i2 = this.f19252d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f19249a);
        sb.append(", fontWeight=");
        sb.append(this.f19250b);
        sb.append(", fontStyle=");
        zi4.m13599B(sb, str, ", fontSynthesis=", str2, ", resourceLoaderCacheKey=");
        sb.append(this.f19253e);
        sb.append(")");
        return sb.toString();
    }
}
