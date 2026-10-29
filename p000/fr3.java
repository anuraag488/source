package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fr3 implements p44 {

    /* JADX INFO: renamed from: a */
    public final oo0 f19236a;

    /* JADX INFO: renamed from: b */
    public final oo0 f19237b;

    /* JADX INFO: renamed from: c */
    public final oo0 f19238c;

    /* JADX INFO: renamed from: d */
    public final oo0 f19239d;

    public fr3(oo0 oo0Var, oo0 oo0Var2, oo0 oo0Var3, oo0 oo0Var4) {
        this.f19236a = oo0Var;
        this.f19237b = oo0Var2;
        this.f19238c = oo0Var3;
        this.f19239d = oo0Var4;
    }

    /* JADX INFO: renamed from: b */
    public static fr3 m5796b(fr3 fr3Var, oo0 oo0Var, oo0 oo0Var2, oo0 oo0Var3, oo0 oo0Var4, int i) {
        if ((i & 1) != 0) {
            oo0Var = fr3Var.f19236a;
        }
        if ((i & 2) != 0) {
            oo0Var2 = fr3Var.f19237b;
        }
        if ((i & 4) != 0) {
            oo0Var3 = fr3Var.f19238c;
        }
        if ((i & 8) != 0) {
            oo0Var4 = fr3Var.f19239d;
        }
        fr3Var.getClass();
        return new fr3(oo0Var, oo0Var2, oo0Var3, oo0Var4);
    }

    @Override // p000.p44
    /* JADX INFO: renamed from: a */
    public final lb5 mo5797a(long j, df2 df2Var, ky0 ky0Var) {
        float fMo9217a = this.f19236a.mo9217a(j, ky0Var);
        float fMo9217a2 = this.f19237b.mo9217a(j, ky0Var);
        float fMo9217a3 = this.f19238c.mo9217a(j, ky0Var);
        float fMo9217a4 = this.f19239d.mo9217a(j, ky0Var);
        float fM6272d = h74.m6272d(j);
        float f = fMo9217a + fMo9217a4;
        if (f > fM6272d) {
            float f2 = fM6272d / f;
            fMo9217a *= f2;
            fMo9217a4 *= f2;
        }
        float f3 = fMo9217a2 + fMo9217a3;
        if (f3 > fM6272d) {
            float f4 = fM6272d / f3;
            fMo9217a2 *= f4;
            fMo9217a3 *= f4;
        }
        if (fMo9217a < 0.0f || fMo9217a2 < 0.0f || fMo9217a3 < 0.0f || fMo9217a4 < 0.0f) {
            StringBuilder sbM4370o = d55.m4370o("Corner size in Px can't be negative(topStart = ", fMo9217a, ", topEnd = ", fMo9217a2, ", bottomEnd = ");
            sbM4370o.append(fMo9217a3);
            sbM4370o.append(", bottomStart = ");
            sbM4370o.append(fMo9217a4);
            sbM4370o.append(")!");
            t32.m10968a(sbM4370o.toString());
        }
        if (fMo9217a + fMo9217a2 + fMo9217a3 + fMo9217a4 == 0.0f) {
            return new h63(AbstractC0647fd.m5672j(0L, j));
        }
        jl3 jl3VarM5672j = AbstractC0647fd.m5672j(0L, j);
        df2 df2Var2 = df2.f17011a;
        float f5 = df2Var == df2Var2 ? fMo9217a : fMo9217a2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (df2Var == df2Var2) {
            fMo9217a = fMo9217a2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo9217a)) << 32) | (((long) Float.floatToRawIntBits(fMo9217a)) & 4294967295L);
        float f6 = df2Var == df2Var2 ? fMo9217a3 : fMo9217a4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (df2Var != df2Var2) {
            fMo9217a4 = fMo9217a3;
        }
        return new i63(new cr3(jl3VarM5672j.f22396a, jl3VarM5672j.f22397b, jl3VarM5672j.f22398c, jl3VarM5672j.f22399d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fMo9217a4)) << 32) | (((long) Float.floatToRawIntBits(fMo9217a4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr3)) {
            return false;
        }
        fr3 fr3Var = (fr3) obj;
        return z62.m13387o(this.f19236a, fr3Var.f19236a) && z62.m13387o(this.f19237b, fr3Var.f19237b) && z62.m13387o(this.f19238c, fr3Var.f19238c) && z62.m13387o(this.f19239d, fr3Var.f19239d);
    }

    public final int hashCode() {
        return this.f19239d.hashCode() + ((this.f19238c.hashCode() + ((this.f19237b.hashCode() + (this.f19236a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f19236a + ", topEnd = " + this.f19237b + ", bottomEnd = " + this.f19238c + ", bottomStart = " + this.f19239d + ")";
    }
}
