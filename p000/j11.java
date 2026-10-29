package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j11 implements ai3 {

    /* JADX INFO: renamed from: c */
    public static final Object f21949c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile ai3 f21950a;

    /* JADX INFO: renamed from: b */
    public volatile Object f21951b;

    /* JADX INFO: renamed from: a */
    public static ai3 m6991a(ai3 ai3Var) {
        if (ai3Var instanceof j11) {
            return ai3Var;
        }
        j11 j11Var = new j11();
        j11Var.f21951b = f21949c;
        j11Var.f21950a = ai3Var;
        return j11Var;
    }

    @Override // p000.ai3
    public final Object get() {
        Object obj;
        Object obj2 = this.f21951b;
        Object obj3 = f21949c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f21951b;
                if (obj == obj3) {
                    obj = this.f21950a.get();
                    Object obj4 = this.f21951b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f21951b = obj;
                    this.f21950a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
