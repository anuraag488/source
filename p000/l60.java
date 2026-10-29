package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l60 extends e80 {

    /* JADX INFO: renamed from: f */
    public final mq1 f23816f;

    public l60(mq1 mq1Var, ro0 ro0Var, int i, y30 y30Var) {
        super(mq1Var, ro0Var, i, y30Var, (byte) 0);
        this.f23816f = mq1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.e80, p000.d80
    /* JADX INFO: renamed from: c */
    public final Object mo3886c(mg3 mg3Var, wm0 wm0Var) {
        k60 k60Var;
        if (wm0Var instanceof k60) {
            k60Var = (k60) wm0Var;
            int i = k60Var.f22931w;
            if ((i & Integer.MIN_VALUE) != 0) {
                k60Var.f22931w = i - Integer.MIN_VALUE;
            } else {
                k60Var = new k60(this, (ym0) wm0Var);
            }
        } else {
            k60Var = new k60(this, (ym0) wm0Var);
        }
        Object obj = k60Var.f22929u;
        Object obj2 = ap0.f14763a;
        int i2 = k60Var.f22931w;
        if (i2 == 0) {
            k43.m7376J(obj);
            k60Var.f22928t = mg3Var;
            k60Var.f22931w = 1;
            if (super.mo3886c(mg3Var, k60Var) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mg3Var = k60Var.f22928t;
            k43.m7376J(obj);
        }
        if (mg3Var.f24885e.m5503z()) {
            return ju4.f22634a;
        }
        C1077qn.m9989o("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // p000.e80, p000.d80
    /* JADX INFO: renamed from: d */
    public final d80 mo3887d(ro0 ro0Var, int i, y30 y30Var) {
        return new l60(this.f23816f, ro0Var, i, y30Var);
    }
}
