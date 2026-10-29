package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ut1 {

    /* JADX INFO: renamed from: a */
    public List f32154a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ut1) && this.f32154a.equals(((ut1) obj).f32154a);
    }

    public final int hashCode() {
        return (this.f32154a.hashCode() + 1791937494) * 31;
    }
}
