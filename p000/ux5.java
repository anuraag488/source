package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ux5 extends sx5 {
    @Override // p000.sx5
    /* JADX INFO: renamed from: a */
    public final px5 mo10947a(e06 e06Var) {
        px5 px5Var;
        px5 px5Var2 = px5.f28071d;
        synchronized (e06Var) {
            try {
                px5Var = e06Var.f35606b;
                if (px5Var != px5Var2) {
                    e06Var.f35606b = px5Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return px5Var;
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: c */
    public final wx5 mo10948c(e06 e06Var) {
        wx5 wx5Var;
        wx5 wx5Var2 = wx5.f33841c;
        synchronized (e06Var) {
            try {
                wx5Var = e06Var.f35607c;
                if (wx5Var != wx5Var2) {
                    e06Var.f35607c = wx5Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wx5Var;
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: d */
    public final void mo10949d(wx5 wx5Var, wx5 wx5Var2) {
        wx5Var.f33843b = wx5Var2;
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: e */
    public final void mo10950e(wx5 wx5Var, Thread thread) {
        wx5Var.f33842a = thread;
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: f */
    public final boolean mo10951f(e06 e06Var, px5 px5Var, px5 px5Var2) {
        synchronized (e06Var) {
            try {
                if (e06Var.f35606b != px5Var) {
                    return false;
                }
                e06Var.f35606b = px5Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: g */
    public final boolean mo10952g(yx5 yx5Var, Object obj, Object obj2) {
        synchronized (yx5Var) {
            try {
                if (yx5Var.f35605a != obj) {
                    return false;
                }
                yx5Var.f35605a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: h */
    public final boolean mo10953h(yx5 yx5Var, wx5 wx5Var, wx5 wx5Var2) {
        synchronized (yx5Var) {
            try {
                if (yx5Var.f35607c != wx5Var) {
                    return false;
                }
                yx5Var.f35607c = wx5Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
