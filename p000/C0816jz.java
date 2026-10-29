package p000;

/* JADX INFO: renamed from: jz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0816jz {

    /* JADX INFO: renamed from: a */
    public final float f22750a;

    public C0816jz(float f) {
        this.f22750a = f;
    }

    /* JADX INFO: renamed from: a */
    public final int m7343a(int i, int i2) {
        return Math.round((1.0f + this.f22750a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0816jz) && Float.compare(this.f22750a, ((C0816jz) obj).f22750a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22750a);
    }

    public final String toString() {
        return "Vertical(bias=" + this.f22750a + ")";
    }
}
