package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l00 extends i73 {

    /* JADX INFO: renamed from: f */
    public final t02 f23658f;

    /* JADX INFO: renamed from: g */
    public final long f23659g;

    /* JADX INFO: renamed from: h */
    public boolean f23660h = true;

    /* JADX INFO: renamed from: i */
    public final long f23661i;

    /* JADX INFO: renamed from: j */
    public float f23662j;

    /* JADX INFO: renamed from: k */
    public o00 f23663k;

    public l00(t02 t02Var, long j) {
        int i;
        this.f23658f = t02Var;
        this.f23659g = j;
        int i2 = (int) (j >> 32);
        if (i2 >= 0 && (i = (int) (4294967295L & j)) >= 0) {
            C0759ie c0759ie = (C0759ie) t02Var;
            if (i2 <= c0759ie.f21276a.getWidth() && i <= c0759ie.f21276a.getHeight()) {
                this.f23661i = j;
                this.f23662j = 1.0f;
                return;
            }
        }
        C1077qn.m9987m("Failed requirement.");
        throw null;
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: a */
    public final boolean mo35a(float f) {
        this.f23662j = f;
        return true;
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: b */
    public final boolean mo36b(o00 o00Var) {
        this.f23663k = o00Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l00)) {
            return false;
        }
        l00 l00Var = (l00) obj;
        return z62.m13387o(this.f23658f, l00Var.f23658f) && o52.m8956c(0L, 0L) && w52.m12108c(this.f23659g, l00Var.f23659g) && this.f23660h == l00Var.f23660h;
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: g */
    public final long mo40g() {
        return z62.m13369a0(this.f23661i);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23660h ? 1 : 0) + zi4.m13612l(zi4.m13612l(this.f23658f.hashCode() * 31, 0L, 31), this.f23659g, 31);
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: i */
    public final void mo42i(u31 u31Var) {
        int iRound = Math.round(Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (u31Var.mo11227d() & 4294967295L)));
        float f = this.f23662j;
        o00 o00Var = this.f23663k;
        boolean z = this.f23660h;
        u31.m11219M(u31Var, this.f23658f, this.f23659g, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, o00Var, z ? 1 : 0, 328);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String strM8959f = o52.m8959f(0L);
        String strM12109d = w52.m12109d(this.f23659g);
        boolean z = this.f23660h;
        if (z == 0) {
            str = "None";
        } else if (z == 1) {
            str = "Low";
        } else if (z == 2) {
            str = "Medium";
        } else {
            str = z == 3 ? "High" : "Unknown";
        }
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f23658f);
        sb.append(", srcOffset=");
        sb.append(strM8959f);
        sb.append(", srcSize=");
        return c75.m3882n(sb, strM12109d, ", filterQuality=", str, ")");
    }
}
