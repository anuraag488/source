package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vo0 extends AbstractC1202u0 {

    /* JADX INFO: renamed from: c */
    public static final r50 f32759c = new r50((byte) 3);

    /* JADX INFO: renamed from: b */
    public String f32760b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo0) && z62.m13387o(this.f32760b, ((vo0) obj).f32760b);
    }

    public final int hashCode() {
        return this.f32760b.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.f32760b + ')';
    }
}
