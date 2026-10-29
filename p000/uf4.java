package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uf4 implements ky0, wm0 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ vf4 f31825a;

    /* JADX INFO: renamed from: b */
    public b70 f31826b;

    /* JADX INFO: renamed from: c */
    public b70 f31827c;

    /* JADX INFO: renamed from: d */
    public fc3 f31828d;

    /* JADX INFO: renamed from: e */
    public r71 f31829e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ vf4 f31830f;

    @Override // p000.ky0
    /* JADX INFO: renamed from: A0 */
    public final float mo3572A0(float f) {
        return f / this.f31825a.mo3580c();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: C */
    public final long mo3573C(float f) {
        return this.f31825a.mo3573C(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: D */
    public final long mo3574D(long j) {
        return this.f31825a.mo3574D(j);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: E */
    public final float mo3575E(float f) {
        return this.f31825a.mo3580c() * f;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: O */
    public final float mo3577O(long j) {
        return this.f31825a.mo3577O(j);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: U */
    public final int mo3579U(float f) {
        return this.f31825a.mo3579U(f);
    }

    /* JADX INFO: renamed from: a */
    public final Object m11538a(fc3 fc3Var, AbstractC0888lx abstractC0888lx) {
        b70 b70Var = new b70(1, C0006a5.m86x(abstractC0888lx));
        b70Var.m3497u();
        this.f31828d = fc3Var;
        this.f31827c = b70Var;
        Object objM3495r = b70Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        return objM3495r;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f31825a.mo3580c();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c0 */
    public final long mo3581c0(long j) {
        return this.f31825a.mo3581c0(j);
    }

    /* JADX INFO: renamed from: e */
    public final long m11539e() {
        vf4 vf4Var = this.f31830f;
        long jMo3581c0 = vf4Var.mo3581c0(sc6.m10652X(vf4Var).f33294B.mo5862g());
        long j = vf4Var.f32578x;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo3581c0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo3581c0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // p000.wm0
    public final ro0 getContext() {
        return this.f31829e;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: h0 */
    public final float mo3582h0(long j) {
        return this.f31825a.mo3582h0(j);
    }

    /* JADX INFO: renamed from: k */
    public final fy4 m11540k() {
        return sc6.m10652X(this.f31830f).f33294B;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, uf4] */
    /* JADX WARN: Type inference failed for: r10v1, types: [t82] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4, types: [t82] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [mq1] */
    /* JADX INFO: renamed from: l */
    public final Object m11541l(long j, mq1 mq1Var, AbstractC0888lx abstractC0888lx) {
        sf4 sf4Var;
        b70 b70Var;
        if (abstractC0888lx instanceof sf4) {
            sf4Var = (sf4) abstractC0888lx;
            int i = sf4Var.f30235w;
            if ((i & Integer.MIN_VALUE) != 0) {
                sf4Var.f30235w = i - Integer.MIN_VALUE;
            } else {
                sf4Var = new sf4(this, abstractC0888lx);
            }
        } else {
            sf4Var = new sf4(this, abstractC0888lx);
        }
        Object objInvoke = sf4Var.f30233u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = sf4Var.f30235w;
        try {
            if (i2 == 0) {
                k43.m7376J(objInvoke);
                if (j <= 0 && (b70Var = this.f31827c) != null) {
                    b70Var.resumeWith(k43.m7389n(new gc3(j)));
                }
                t82 t82VarM7910S = lb5.m7910S(this.f31830f.m8391C0(), null, null, new mn3((byte) 1, j, null, this), 3);
                sf4Var.f30232t = t82VarM7910S;
                sf4Var.f30235w = 1;
                objInvoke = mq1Var.invoke(this, sf4Var);
                this = t82VarM7910S;
                if (objInvoke == ap0Var) {
                    return ap0Var;
                }
            } else {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t82 t82Var = sf4Var.f30232t;
                k43.m7376J(objInvoke);
                this = t82Var;
            }
            this.mo4993a(z60.f35778b);
            return objInvoke;
        } catch (Throwable th) {
            this.mo4993a(z60.f35778b);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m11542n(long j, mq1 mq1Var, ym0 ym0Var) {
        tf4 tf4Var;
        if (ym0Var instanceof tf4) {
            tf4Var = (tf4) ym0Var;
            int i = tf4Var.f31124v;
            if ((i & Integer.MIN_VALUE) != 0) {
                tf4Var.f31124v = i - Integer.MIN_VALUE;
            } else {
                tf4Var = new tf4(this, ym0Var);
            }
        } else {
            tf4Var = new tf4(this, ym0Var);
        }
        Object obj = tf4Var.f31122t;
        Object obj2 = ap0.f14763a;
        int i2 = tf4Var.f31124v;
        try {
            if (i2 == 0) {
                k43.m7376J(obj);
                tf4Var.f31124v = 1;
                Object objM11541l = m11541l(j, mq1Var, tf4Var);
                return objM11541l == obj2 ? obj2 : objM11541l;
            }
            if (i2 == 1) {
                k43.m7376J(obj);
                return obj;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        } catch (gc3 unused) {
            return null;
        }
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: o0 */
    public final long mo3584o0(float f) {
        return this.f31825a.mo3584o0(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f31825a.mo3585r();
    }

    @Override // p000.wm0
    public final void resumeWith(Object obj) {
        vf4 vf4Var = this.f31830f;
        synchronized (vf4Var.f32575u) {
            vf4Var.f32574t.m11671k(this);
        }
        this.f31826b.resumeWith(obj);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: w0 */
    public final float mo3586w0(int i) {
        return this.f31825a.mo3586w0(i);
    }
}
