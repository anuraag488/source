package p000;

/* JADX INFO: renamed from: vp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1264vp implements qh3 {

    /* JADX INFO: renamed from: a */
    public byte f32767a;

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return qh3.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh3)) {
            return false;
        }
        qh3 qh3Var = (qh3) obj;
        return this.f32767a == qh3Var.tag() && oh3.f26699a.equals(qh3Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f32767a ^ 14552422) + (oh3.f26699a.hashCode() ^ 2041407134);
    }

    @Override // p000.qh3
    public final oh3 intEncoding() {
        return oh3.f26699a;
    }

    @Override // p000.qh3
    public final int tag() {
        return this.f32767a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.f32767a) + "intEncoding=" + oh3.f26699a + ')';
    }
}
