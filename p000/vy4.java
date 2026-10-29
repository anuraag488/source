package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vy4 implements vt2 {

    /* JADX INFO: renamed from: a */
    public f40 f32971a;

    /* JADX INFO: renamed from: b */
    public C1034ph f32972b;

    /* JADX INFO: renamed from: c */
    public long f32973c;

    /* JADX INFO: renamed from: d */
    public int f32974d;

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (p000.lb5.m7921b0(r2, r10, r0) == r1) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:13:0x0030). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m12038c(ro0 ro0Var, ym0 ym0Var) {
        uy4 uy4Var;
        z30 it;
        z30 z30Var;
        ro0 ro0Var2;
        Object objM13297b;
        if (ym0Var instanceof uy4) {
            uy4Var = (uy4) ym0Var;
            int i = uy4Var.f32263x;
            if ((i & Integer.MIN_VALUE) != 0) {
                uy4Var.f32263x = i - Integer.MIN_VALUE;
            } else {
                uy4Var = new uy4(this, ym0Var);
            }
        } else {
            uy4Var = new uy4(this, ym0Var);
        }
        Object obj = uy4Var.f32261v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = uy4Var.f32263x;
        wm0 wm0Var = null;
        if (i2 == 0) {
            k43.m7376J(obj);
            it = this.f32971a.iterator();
            uy4Var.f32259t = ro0Var;
            uy4Var.f32260u = it;
            uy4Var.f32263x = 1;
            objM13297b = it.m13297b(uy4Var);
            if (objM13297b != ap0Var) {
                ro0Var2 = ro0Var;
                z30Var = it;
                obj = objM13297b;
                if (!((Boolean) obj).booleanValue()) {
                    return ju4.f22634a;
                }
                z30Var.m13298c();
                C1088qy c1088qy = new C1088qy(this, wm0Var, (byte) 5);
                uy4Var.f32259t = ro0Var2;
                uy4Var.f32260u = z30Var;
                uy4Var.f32263x = 2;
            }
            return ap0Var;
        }
        if (i2 == 1) {
            z30Var = uy4Var.f32260u;
            ro0Var2 = uy4Var.f32259t;
            k43.m7376J(obj);
            if (!((Boolean) obj).booleanValue()) {
                return ju4.f22634a;
            }
            z30Var.m13298c();
            C1088qy c1088qy2 = new C1088qy(this, wm0Var, (byte) 5);
            uy4Var.f32259t = ro0Var2;
            uy4Var.f32260u = z30Var;
            uy4Var.f32263x = 2;
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z30Var = uy4Var.f32260u;
            ro0Var2 = uy4Var.f32259t;
            k43.m7376J(obj);
        }
        it = z30Var;
        ro0Var = ro0Var2;
        uy4Var.f32259t = ro0Var;
        uy4Var.f32260u = it;
        uy4Var.f32263x = 1;
        objM13297b = it.m13297b(uy4Var);
        if (objM13297b != ap0Var) {
            ro0Var2 = ro0Var;
            z30Var = it;
            obj = objM13297b;
            if (!((Boolean) obj).booleanValue()) {
                return ju4.f22634a;
            }
            z30Var.m13298c();
            C1088qy c1088qy3 = new C1088qy(this, wm0Var, (byte) 5);
            uy4Var.f32259t = ro0Var2;
            uy4Var.f32260u = z30Var;
            uy4Var.f32263x = 2;
        }
        return ap0Var;
    }

    @Override // p000.ro0
    public final Object fold(mq1 mq1Var, Object obj) {
        return mq1Var.invoke(obj, this);
    }

    @Override // p000.ro0
    public final po0 get(qo0 qo0Var) {
        return AbstractC1356y5.m12929w(this, qo0Var);
    }

    @Override // p000.vt2
    /* JADX INFO: renamed from: l */
    public final Object mo9530l(yp1 yp1Var, wm0 wm0Var) {
        return this.f32972b.mo9530l(yp1Var, wm0Var);
    }

    @Override // p000.ro0
    public final ro0 minusKey(qo0 qo0Var) {
        return AbstractC1356y5.m12896E(this, qo0Var);
    }

    @Override // p000.ro0
    public final ro0 plus(ro0 ro0Var) {
        return qs5.m10089N(this, ro0Var);
    }
}
