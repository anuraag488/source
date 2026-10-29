package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s34 {

    /* JADX INFO: renamed from: a */
    public i44 f29856a;

    /* JADX INFO: renamed from: b */
    public i44 f29857b;

    /* JADX INFO: renamed from: a */
    public final double m10516a() {
        Double dMo6661b = this.f29856a.mo6661b();
        if (dMo6661b != null) {
            double dDoubleValue = dMo6661b.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dMo6661b2 = this.f29857b.mo6661b();
        if (dMo6661b2 != null) {
            double dDoubleValue2 = dMo6661b2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6.mo6662c(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10517b(ym0 ym0Var) {
        r34 r34Var;
        if (ym0Var instanceof r34) {
            r34Var = (r34) ym0Var;
            int i = r34Var.f28982w;
            if ((i & Integer.MIN_VALUE) != 0) {
                r34Var.f28982w = i - Integer.MIN_VALUE;
            } else {
                r34Var = new r34(this, ym0Var);
            }
        } else {
            r34Var = new r34(this, ym0Var);
        }
        Object obj = r34Var.f28980u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = r34Var.f28982w;
        if (i2 == 0) {
            k43.m7376J(obj);
            i44 i44Var = this.f29856a;
            r34Var.f28979t = this;
            r34Var.f28982w = 1;
            if (i44Var.mo6662c(r34Var) != ap0Var) {
            }
            return ap0Var;
        }
        if (i2 == 1) {
            this = r34Var.f28979t;
            k43.m7376J(obj);
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
        i44 i44Var2 = this.f29857b;
        r34Var.f28979t = null;
        r34Var.f28982w = 2;
    }
}
