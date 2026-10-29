package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cr6 implements dr6 {

    /* JADX INFO: renamed from: c */
    public static final Object f16401c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile dr6 f16402a;

    /* JADX INFO: renamed from: b */
    public volatile Object f16403b;

    /* JADX INFO: renamed from: a */
    public static cr6 m4145a(dr6 dr6Var) {
        if (dr6Var instanceof cr6) {
            return (cr6) dr6Var;
        }
        cr6 cr6Var = new cr6();
        cr6Var.f16403b = f16401c;
        cr6Var.f16402a = dr6Var;
        return cr6Var;
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public final Object mo4146j() {
        Object obj = this.f16403b;
        Object obj2 = f16401c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f16403b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objMo4146j = this.f16402a.mo4146j();
                Object obj4 = this.f16403b;
                if (obj4 != obj2 && obj4 != objMo4146j) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objMo4146j + ". This is likely due to a circular dependency.");
                }
                this.f16403b = objMo4146j;
                this.f16402a = null;
                return objMo4146j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
