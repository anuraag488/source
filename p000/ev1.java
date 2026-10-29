package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ev1 {

    /* JADX INFO: renamed from: a */
    public final byte f18511a;

    /* JADX INFO: renamed from: b */
    public final float f18512b;

    /* JADX INFO: renamed from: c */
    public final byte f18513c;

    public /* synthetic */ ev1(int i, float f, int i2, int i3) {
        this((i2 & 2) != 0 ? 1.0f : f, i, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev1)) {
            return false;
        }
        ev1 ev1Var = (ev1) obj;
        return this.f18511a == ev1Var.f18511a && Float.compare(this.f18512b, ev1Var.f18512b) == 0 && this.f18513c == ev1Var.f18513c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18513c) + c75.m3874f(this.f18512b, Integer.hashCode(this.f18511a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HapticEffectPrimitive(primitiveId=");
        sb.append((int) this.f18511a);
        sb.append(", scale=");
        sb.append(this.f18512b);
        sb.append(", delayMillis=");
        return c75.m3880l(sb, this.f18513c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ev1(float f, int i, int i2) {
        this.f18511a = i;
        this.f18512b = f;
        this.f18513c = i2;
    }
}
