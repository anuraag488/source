package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class na2 extends fb2 {

    /* JADX INFO: renamed from: a */
    public final boolean f25597a;

    /* JADX INFO: renamed from: b */
    public final g24 f25598b;

    /* JADX INFO: renamed from: c */
    public final String f25599c;

    public na2(Object obj, boolean z, g24 g24Var) {
        this.f25597a = z;
        this.f25598b = g24Var;
        this.f25599c = obj.toString();
        if (g24Var == null || g24Var.mo5886f()) {
            return;
        }
        C1077qn.m9987m("Failed requirement.");
        throw null;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final String mo5629a() {
        return this.f25599c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || na2.class != obj.getClass()) {
            return false;
        }
        na2 na2Var = (na2) obj;
        return this.f25597a == na2Var.f25597a && z62.m13387o(this.f25599c, na2Var.f25599c);
    }

    public final int hashCode() {
        return this.f25599c.hashCode() + (Boolean.hashCode(this.f25597a) * 31);
    }

    @Override // p000.fb2
    public final String toString() {
        boolean z = this.f25597a;
        String str = this.f25599c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        ed4.m5092a(str, sb);
        return sb.toString();
    }
}
