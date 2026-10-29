package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n73 {

    /* JADX INFO: renamed from: a */
    public C1328xe f25497a;

    /* JADX INFO: renamed from: b */
    public int f25498b;

    /* JADX INFO: renamed from: c */
    public int f25499c;

    /* JADX INFO: renamed from: d */
    public int f25500d;

    /* JADX INFO: renamed from: e */
    public int f25501e;

    /* JADX INFO: renamed from: f */
    public float f25502f;

    /* JADX INFO: renamed from: g */
    public float f25503g;

    /* JADX INFO: renamed from: a */
    public final jl3 m8569a(jl3 jl3Var) {
        float f = this.f25502f;
        return jl3Var.m7174j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public final long m8570b(long j, boolean z) {
        if (z) {
            long j2 = ql4.f28556b;
            if (ql4.m9899c(j, j2)) {
                return j2;
            }
        }
        int i = ql4.f28557c;
        int i2 = this.f25498b;
        return sc6.m10657b(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    /* JADX INFO: renamed from: c */
    public final jl3 m8571c(jl3 jl3Var) {
        float f = -this.f25502f;
        return jl3Var.m7174j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public final int m8572d(int i) {
        int i2 = this.f25498b;
        return sc6.m10675p(i, i2, this.f25499c) - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n73) {
            n73 n73Var = (n73) obj;
            if (this.f25497a == n73Var.f25497a && this.f25498b == n73Var.f25498b && this.f25499c == n73Var.f25499c && this.f25500d == n73Var.f25500d && this.f25501e == n73Var.f25501e && Float.compare(this.f25502f, n73Var.f25502f) == 0 && Float.compare(this.f25503g, n73Var.f25503g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25503g) + c75.m3874f(this.f25502f, zi4.m13609i(this.f25501e, zi4.m13609i(this.f25500d, zi4.m13609i(this.f25499c, zi4.m13609i(this.f25498b, this.f25497a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.f25497a + ", startIndex=" + this.f25498b + ", endIndex=" + this.f25499c + ", startLineIndex=" + this.f25500d + ", endLineIndex=" + this.f25501e + ", top=" + this.f25502f + ", bottom=" + this.f25503g + ")";
    }
}
