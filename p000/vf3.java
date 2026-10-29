package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vf3 {

    /* JADX INFO: renamed from: a */
    public final Class f32567a;

    /* JADX INFO: renamed from: b */
    public final Class f32568b;

    public vf3(Class cls, Class cls2) {
        this.f32567a = cls;
        this.f32568b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vf3)) {
            return false;
        }
        vf3 vf3Var = (vf3) obj;
        return vf3Var.f32567a.equals(this.f32567a) && vf3Var.f32568b.equals(this.f32568b);
    }

    public final int hashCode() {
        return Objects.hash(this.f32567a, this.f32568b);
    }

    public final String toString() {
        return this.f32567a.getSimpleName() + " with primitive type: " + this.f32568b.getSimpleName();
    }
}
