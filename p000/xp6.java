package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xp6 implements kq6 {

    /* JADX INFO: renamed from: a */
    public hm6 f34523a;

    /* JADX INFO: renamed from: b */
    public aj5 f34524b;

    @Override // p000.kq6
    /* JADX INFO: renamed from: a */
    public final void mo7578a(Object obj) {
        this.f34524b.getClass();
        pq6 pq6Var = ((jo6) obj).zzc;
        if (pq6Var.f27905d) {
            pq6Var.f27905d = false;
        }
        int i = xn6.f34473a;
        throw zi4.m13616p(obj);
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: b */
    public final void mo7579b(Object obj, Object obj2) {
        lq6.m8088o(obj, obj2);
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: c */
    public final boolean mo7580c(jo6 jo6Var, jo6 jo6Var2) {
        return jo6Var.zzc.equals(jo6Var2.zzc);
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: d */
    public final boolean mo7581d(Object obj) {
        throw zi4.m13616p(obj);
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: e */
    public final int mo7582e(hm6 hm6Var) {
        pq6 pq6Var = ((jo6) hm6Var).zzc;
        int i = pq6Var.f27904c;
        if (i != -1) {
            return i;
        }
        pq6Var.f27904c = 0;
        return 0;
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: f */
    public final void mo7583f(Object obj, rr5 rr5Var) {
        throw zi4.m13616p(obj);
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: g */
    public final int mo7584g(jo6 jo6Var) {
        jo6Var.zzc.getClass();
        return 506991;
    }

    @Override // p000.kq6
    /* JADX INFO: renamed from: h */
    public final jo6 mo7585h() {
        hm6 hm6Var = this.f34523a;
        if (hm6Var instanceof jo6) {
            return (jo6) ((jo6) hm6Var).mo205g(4);
        }
        fo6 fo6Var = (fo6) ((jo6) hm6Var).mo205g(5);
        boolean zM7199f = fo6Var.f19209b.m7199f();
        jo6 jo6Var = fo6Var.f19209b;
        if (!zM7199f) {
            return jo6Var;
        }
        jo6Var.getClass();
        zp6.f36259c.m13720a(jo6Var.getClass()).mo7578a(jo6Var);
        jo6Var.m7201k();
        return fo6Var.f19209b;
    }
}
