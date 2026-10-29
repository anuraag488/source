package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nx4 implements InterfaceC0728hk {

    /* JADX INFO: renamed from: a */
    public String f26180a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx4) && this.f26180a.equals(((nx4) obj).f26180a);
    }

    public final int hashCode() {
        return this.f26180a.hashCode();
    }

    public final String toString() {
        return zi4.m13621u("VerbatimTtsAnnotation(verbatim=", this.f26180a, ")");
    }
}
