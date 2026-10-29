package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d56 {

    /* JADX INFO: renamed from: f */
    public static final Object f16793f = new Object();

    /* JADX INFO: renamed from: a */
    public String f16794a;

    /* JADX INFO: renamed from: b */
    public ut5 f16795b;

    /* JADX INFO: renamed from: c */
    public Object f16796c;

    /* JADX INFO: renamed from: d */
    public Object f16797d;

    /* JADX INFO: renamed from: e */
    public volatile Object f16798e;

    /* JADX INFO: renamed from: a */
    public final Object m4379a(Object obj) {
        synchronized (this.f16797d) {
        }
        if (obj != null) {
            return obj;
        }
        if (x46.f33990a == null) {
            return this.f16796c;
        }
        synchronized (f16793f) {
            try {
                if (yj5.m13150b()) {
                    return this.f16798e == null ? this.f16796c : this.f16798e;
                }
                try {
                    for (d56 d56Var : e56.f17769a) {
                        if (yj5.m13150b()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objMo3008f = null;
                        try {
                            ut5 ut5Var = d56Var.f16795b;
                            if (ut5Var != null) {
                                objMo3008f = ut5Var.mo3008f();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f16793f) {
                            d56Var.f16798e = objMo3008f;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                ut5 ut5Var2 = this.f16795b;
                if (ut5Var2 != null) {
                    try {
                        return ut5Var2.mo3008f();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f16796c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
