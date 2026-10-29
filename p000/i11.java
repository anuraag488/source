package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i11 implements ai3, og2 {

    /* JADX INFO: renamed from: c */
    public static final Object f21001c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile ai3 f21002a;

    /* JADX INFO: renamed from: b */
    public volatile Object f21003b = f21001c;

    public i11(ai3 ai3Var) {
        this.f21002a = ai3Var;
    }

    /* JADX INFO: renamed from: a */
    public static ai3 m6538a(ai3 ai3Var) {
        return ai3Var instanceof i11 ? ai3Var : new i11(ai3Var);
    }

    @Override // p000.ai3
    public final Object get() {
        Object obj;
        Object obj2 = this.f21003b;
        Object obj3 = f21001c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f21003b;
                if (obj == obj3) {
                    obj = this.f21002a.get();
                    Object obj4 = this.f21003b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f21003b = obj;
                    this.f21002a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
