package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qt0 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ gx2 f28780a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ml3 f28781b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ql3 f28782c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ru0 f28783d;

    /* JADX WARN: Code duplicated, block: B:37:0x00aa A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #2 {all -> 0x004e, blocks: (B:21:0x004a, B:35:0x00a2, B:37:0x00aa), top: B:55:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m10122a(C0667fx c0667fx, ym0 ym0Var) throws Throwable {
        pt0 pt0Var;
        gx2 gx2Var;
        ml3 ml3Var;
        ql3 ql3Var;
        ru0 ru0Var;
        gx2 gx2Var2;
        gx2 gx2Var3;
        ql3 ql3Var2;
        Object obj;
        if (ym0Var instanceof pt0) {
            pt0Var = (pt0) ym0Var;
            int i = pt0Var.f27961A;
            if ((i & Integer.MIN_VALUE) != 0) {
                pt0Var.f27961A = i - Integer.MIN_VALUE;
            } else {
                pt0Var = new pt0(this, ym0Var);
            }
        } else {
            pt0Var = new pt0(this, ym0Var);
        }
        Object obj2 = pt0Var.f27967y;
        ap0 ap0Var = ap0.f14763a;
        int i2 = pt0Var.f27961A;
        try {
            if (i2 == 0) {
                k43.m7376J(obj2);
                gx2Var = this.f28780a;
                ml3Var = this.f28781b;
                ql3Var = this.f28782c;
                ru0Var = this.f28783d;
                pt0Var.f27962t = c0667fx;
                pt0Var.f27963u = gx2Var;
                pt0Var.f27964v = ml3Var;
                pt0Var.f27965w = ql3Var;
                pt0Var.f27966x = ru0Var;
                pt0Var.f27961A = 1;
                if (gx2Var.m6191e(pt0Var) != ap0Var) {
                }
                return ap0Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = pt0Var.f27965w;
                    ql3Var2 = (ql3) pt0Var.f27964v;
                    gx2Var2 = pt0Var.f27963u;
                    try {
                        k43.m7376J(obj2);
                        ql3Var2.f28555a = obj;
                        Object obj3 = ql3Var2.f28555a;
                        gx2Var2.m6193g(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        gx2Var2.m6193g(null);
                        throw th;
                    }
                }
                ru0Var = (ru0) pt0Var.f27965w;
                ql3Var2 = (ql3) pt0Var.f27964v;
                gx2Var3 = pt0Var.f27963u;
                try {
                    k43.m7376J(obj2);
                    if (!z62.m13387o(obj2, ql3Var2.f28555a)) {
                        pt0Var.f27962t = null;
                        pt0Var.f27963u = gx2Var3;
                        pt0Var.f27964v = ql3Var2;
                        pt0Var.f27965w = obj2;
                        pt0Var.f27961A = 3;
                        if (ru0Var.m10437j(obj2, false, pt0Var) != ap0Var) {
                            obj = obj2;
                            gx2Var2 = gx2Var3;
                            ql3Var2.f28555a = obj;
                        }
                        return ap0Var;
                    }
                    gx2Var2 = gx2Var3;
                    Object obj4 = ql3Var2.f28555a;
                    gx2Var2.m6193g(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    gx2Var2 = gx2Var3;
                    gx2Var2.m6193g(null);
                    throw th;
                }
            }
            ru0Var = pt0Var.f27966x;
            ql3 ql3Var3 = (ql3) pt0Var.f27965w;
            ml3Var = (ml3) pt0Var.f27964v;
            gx2 gx2Var4 = pt0Var.f27963u;
            C0667fx c0667fx2 = pt0Var.f27962t;
            k43.m7376J(obj2);
            ql3Var = ql3Var3;
            c0667fx = c0667fx2;
            gx2Var = gx2Var4;
            if (ml3Var.f25002a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = ql3Var.f28555a;
            pt0Var.f27962t = null;
            pt0Var.f27963u = gx2Var;
            pt0Var.f27964v = ql3Var;
            pt0Var.f27965w = ru0Var;
            pt0Var.f27966x = null;
            pt0Var.f27961A = 2;
            Object objInvoke = c0667fx.invoke(obj5, pt0Var);
            if (objInvoke != ap0Var) {
                gx2Var3 = gx2Var;
                obj2 = objInvoke;
                ql3Var2 = ql3Var;
                if (!z62.m13387o(obj2, ql3Var2.f28555a)) {
                    pt0Var.f27962t = null;
                    pt0Var.f27963u = gx2Var3;
                    pt0Var.f27964v = ql3Var2;
                    pt0Var.f27965w = obj2;
                    pt0Var.f27961A = 3;
                    if (ru0Var.m10437j(obj2, false, pt0Var) != ap0Var) {
                        obj = obj2;
                        gx2Var2 = gx2Var3;
                        ql3Var2.f28555a = obj;
                    }
                } else {
                    gx2Var2 = gx2Var3;
                }
                Object obj6 = ql3Var2.f28555a;
                gx2Var2.m6193g(null);
                return obj6;
            }
            return ap0Var;
        } catch (Throwable th3) {
            th = th3;
            gx2Var2 = gx2Var;
            gx2Var2.m6193g(null);
            throw th;
        }
    }
}
