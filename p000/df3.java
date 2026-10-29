package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class df3 implements ky0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ky0 f17014a;

    /* JADX INFO: renamed from: b */
    public boolean f17015b;

    /* JADX INFO: renamed from: c */
    public boolean f17016c;

    /* JADX INFO: renamed from: d */
    public final gx2 f17017d = new gx2(false);

    public df3(ky0 ky0Var) {
        this.f17014a = ky0Var;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: A0 */
    public final float mo3572A0(float f) {
        return this.f17014a.mo3572A0(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: C */
    public final long mo3573C(float f) {
        return this.f17014a.mo3573C(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: D */
    public final long mo3574D(long j) {
        return this.f17014a.mo3574D(j);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: E */
    public final float mo3575E(float f) {
        return this.f17014a.mo3575E(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: O */
    public final float mo3577O(long j) {
        return this.f17014a.mo3577O(j);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: U */
    public final int mo3579U(float f) {
        return this.f17014a.mo3579U(f);
    }

    /* JADX INFO: renamed from: a */
    public final void m4498a() {
        this.f17016c = true;
        gx2 gx2Var = this.f17017d;
        if (gx2Var.m6190d()) {
            gx2Var.m6193g(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4499b() {
        this.f17015b = true;
        gx2 gx2Var = this.f17017d;
        if (gx2Var.m6190d()) {
            gx2Var.m6193g(null);
        }
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f17014a.mo3580c();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c0 */
    public final long mo3581c0(long j) {
        return this.f17014a.mo3581c0(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m4500e(ym0 ym0Var) {
        bf3 bf3Var;
        if (ym0Var instanceof bf3) {
            bf3Var = (bf3) ym0Var;
            int i = bf3Var.f15239v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bf3Var.f15239v = i - Integer.MIN_VALUE;
            } else {
                bf3Var = new bf3(this, ym0Var);
            }
        } else {
            bf3Var = new bf3(this, ym0Var);
        }
        Object obj = bf3Var.f15237t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = bf3Var.f15239v;
        if (i2 == 0) {
            k43.m7376J(obj);
            bf3Var.f15239v = 1;
            if (this.f17017d.m6191e(bf3Var) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        this.f17015b = false;
        this.f17016c = false;
        return ju4.f22634a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m4501h(ym0 ym0Var) {
        cf3 cf3Var;
        if (ym0Var instanceof cf3) {
            cf3Var = (cf3) ym0Var;
            int i = cf3Var.f15982v;
            if ((i & Integer.MIN_VALUE) != 0) {
                cf3Var.f15982v = i - Integer.MIN_VALUE;
            } else {
                cf3Var = new cf3(this, ym0Var);
            }
        } else {
            cf3Var = new cf3(this, ym0Var);
        }
        Object obj = cf3Var.f15980t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = cf3Var.f15982v;
        gx2 gx2Var = this.f17017d;
        if (i2 == 0) {
            k43.m7376J(obj);
            if (!this.f17015b && !this.f17016c) {
                cf3Var.f15982v = 1;
                if (gx2Var.m6191e(cf3Var) == ap0Var) {
                    return ap0Var;
                }
            }
            return Boolean.valueOf(this.f17015b);
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        gx2Var.m6193g(null);
        return Boolean.valueOf(this.f17015b);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: h0 */
    public final float mo3582h0(long j) {
        return this.f17014a.mo3582h0(j);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: o0 */
    public final long mo3584o0(float f) {
        return this.f17014a.mo3584o0(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f17014a.mo3585r();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: w0 */
    public final float mo3586w0(int i) {
        return this.f17014a.mo3586w0(i);
    }
}
