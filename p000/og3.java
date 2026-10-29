package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class og3 {

    /* JADX INFO: renamed from: a */
    public final String f26681a;

    /* JADX INFO: renamed from: b */
    public final ng3 f26682b;

    public og3(String str, ng3 ng3Var) {
        this.f26681a = str;
        this.f26682b = ng3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og3)) {
            return false;
        }
        og3 og3Var = (og3) obj;
        return this.f26681a.equals(og3Var.f26681a) && this.f26682b == og3Var.f26682b;
    }

    public final int hashCode() {
        return this.f26682b.hashCode() + (this.f26681a.hashCode() * 31);
    }

    public final String toString() {
        return "Product(id=" + this.f26681a + ", type=" + this.f26682b + ")";
    }
}
