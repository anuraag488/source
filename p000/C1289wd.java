package p000;

import android.widget.EdgeEffect;

/* JADX INFO: renamed from: wd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1289wd {

    /* JADX INFO: renamed from: a */
    public ky0 f33244a;

    /* JADX INFO: renamed from: b */
    public long f33245b;

    /* JADX INFO: renamed from: c */
    public r61 f33246c;

    /* JADX INFO: renamed from: d */
    public d83 f33247d;

    /* JADX INFO: renamed from: e */
    public boolean f33248e;

    /* JADX INFO: renamed from: f */
    public boolean f33249f;

    /* JADX INFO: renamed from: g */
    public long f33250g;

    /* JADX INFO: renamed from: h */
    public long f33251h;

    /* JADX INFO: renamed from: i */
    public bd4 f33252i;

    /* JADX INFO: renamed from: a */
    public final void m12214a() {
        boolean z;
        r61 r61Var = this.f33246c;
        EdgeEffect edgeEffect = r61Var.f29048d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = r61Var.f29049e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = r61Var.f29050f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = r61Var.f29051g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            m12217d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: b */
    public final Object m12215b(long j, mq1 mq1Var, ym0 ym0Var) {
        C1178td c1178td;
        float fM13028h;
        float fM13028h2;
        long j2;
        ky0 ky0Var = this.f33244a;
        r61 r61Var = this.f33246c;
        if (ym0Var instanceof C1178td) {
            c1178td = (C1178td) ym0Var;
            int i = c1178td.f31084w;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1178td.f31084w = i - Integer.MIN_VALUE;
            } else {
                c1178td = new C1178td(this, ym0Var);
            }
        } else {
            c1178td = new C1178td(this, ym0Var);
        }
        Object obj = c1178td.f31082u;
        Object obj2 = ap0.f14763a;
        int i2 = c1178td.f31084w;
        ju4 ju4Var = ju4.f22634a;
        if (i2 == 0) {
            k43.m7376J(obj);
            if (h74.m6274f(this.f33250g)) {
                Object objM7330a = jx4.m7330a(j);
                c1178td.f31084w = 1;
                if (mq1Var.invoke(objM7330a, c1178td) != obj2) {
                    return ju4Var;
                }
            } else {
                if (!r61.m10220g(r61Var.f29050f) || jx4.m7332c(j) >= 0.0f) {
                    fM13028h = (!r61.m10220g(r61Var.f29051g) || jx4.m7332c(j) <= 0.0f) ? 0.0f : -y70.m13028h(r61Var.m10224d(), -jx4.m7332c(j), Float.intBitsToFloat((int) (this.f33250g >> 32)), ky0Var);
                } else {
                    fM13028h = y70.m13028h(r61Var.m10223c(), jx4.m7332c(j), Float.intBitsToFloat((int) (this.f33250g >> 32)), ky0Var);
                }
                if (!r61.m10220g(r61Var.f29048d) || jx4.m7333d(j) >= 0.0f) {
                    fM13028h2 = (!r61.m10220g(r61Var.f29049e) || jx4.m7333d(j) <= 0.0f) ? 0.0f : -y70.m13028h(r61Var.m10222b(), -jx4.m7333d(j), Float.intBitsToFloat((int) (4294967295L & this.f33250g)), ky0Var);
                } else {
                    fM13028h2 = y70.m13028h(r61Var.m10225e(), jx4.m7333d(j), Float.intBitsToFloat((int) (4294967295L & this.f33250g)), ky0Var);
                }
                long jM10097b = qs5.m10097b(fM13028h, fM13028h2);
                if (jM10097b != 0) {
                    m12217d();
                }
                long jM7334e = jx4.m7334e(j, jM10097b);
                Object objM7330a2 = jx4.m7330a(jM7334e);
                c1178td.f31081t = jM7334e;
                c1178td.f31084w = 2;
                Object objInvoke = mq1Var.invoke(objM7330a2, c1178td);
                if (objInvoke != obj2) {
                    j2 = jM7334e;
                    obj = objInvoke;
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            k43.m7376J(obj);
            return ju4Var;
        }
        if (i2 != 2) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = c1178td.f31081t;
        k43.m7376J(obj);
        long jM7334e2 = jx4.m7334e(j2, ((jx4) obj).f22730a);
        this.f33249f = false;
        if (jx4.m7332c(jM7334e2) > 0.0f) {
            r61Var.m10223c().onAbsorb(qq2.m10010E(jx4.m7332c(jM7334e2)));
        } else if (jx4.m7332c(jM7334e2) < 0.0f) {
            r61Var.m10224d().onAbsorb(-qq2.m10010E(jx4.m7332c(jM7334e2)));
        }
        if (jx4.m7333d(jM7334e2) > 0.0f) {
            r61Var.m10225e().onAbsorb(qq2.m10010E(jx4.m7333d(jM7334e2)));
        } else if (jx4.m7333d(jM7334e2) < 0.0f) {
            r61Var.m10222b().onAbsorb(-qq2.m10010E(jx4.m7333d(jM7334e2)));
        }
        m12214a();
        return ju4Var;
    }

    /* JADX INFO: renamed from: c */
    public final long m12216c() {
        long jM6597v = this.f33245b;
        if ((9223372034707292159L & jM6597v) == 9205357640488583168L) {
            jM6597v = i20.m6597v(this.f33250g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM6597v >> 32)) / Float.intBitsToFloat((int) (this.f33250g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM6597v & 4294967295L)) / Float.intBitsToFloat((int) (this.f33250g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: d */
    public final void m12217d() {
        if (this.f33248e) {
            this.f33247d.setValue(ju4.f22634a);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12218e() {
        float distance;
        float distance2;
        float distance3;
        float distance4;
        r61 r61Var = this.f33246c;
        EdgeEffect edgeEffect = r61Var.f29048d;
        if (edgeEffect != null) {
            try {
                distance = edgeEffect.getDistance();
            } catch (Throwable unused) {
                distance = 0.0f;
            }
            if (distance != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = r61Var.f29049e;
        if (edgeEffect2 != null) {
            try {
                distance2 = edgeEffect2.getDistance();
            } catch (Throwable unused2) {
                distance2 = 0.0f;
            }
            if (distance2 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = r61Var.f29050f;
        if (edgeEffect3 != null) {
            try {
                distance3 = edgeEffect3.getDistance();
            } catch (Throwable unused3) {
                distance3 = 0.0f;
            }
            if (distance3 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = r61Var.f29051g;
        if (edgeEffect4 == null) {
            return false;
        }
        try {
            distance4 = edgeEffect4.getDistance();
        } catch (Throwable unused4) {
            distance4 = 0.0f;
        }
        return distance4 != 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public final float m12219f(long j) {
        float fOnPullDistance;
        float distance;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m12216c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f33250g & 4294967295L));
        EdgeEffect edgeEffectM10222b = this.f33246c.m10222b();
        float f = -fIntBitsToFloat2;
        float f2 = 1.0f - fIntBitsToFloat;
        try {
            fOnPullDistance = edgeEffectM10222b.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffectM10222b.onPull(f, f2);
            fOnPullDistance = 0.0f;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.f33250g)) * (-fOnPullDistance);
        try {
            distance = edgeEffectM10222b.getDistance();
        } catch (Throwable unused2) {
            distance = 0.0f;
        }
        return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: g */
    public final float m12220g(long j) {
        float fOnPullDistance;
        float distance;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m12216c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f33250g >> 32));
        EdgeEffect edgeEffectM10223c = this.f33246c.m10223c();
        float f = 1.0f - fIntBitsToFloat;
        try {
            fOnPullDistance = edgeEffectM10223c.onPullDistance(fIntBitsToFloat2, f);
        } catch (Throwable unused) {
            edgeEffectM10223c.onPull(fIntBitsToFloat2, f);
            fOnPullDistance = 0.0f;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f33250g >> 32)) * fOnPullDistance;
        try {
            distance = edgeEffectM10223c.getDistance();
        } catch (Throwable unused2) {
            distance = 0.0f;
        }
        return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: h */
    public final float m12221h(long j) {
        float fOnPullDistance;
        float distance;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m12216c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f33250g >> 32));
        EdgeEffect edgeEffectM10224d = this.f33246c.m10224d();
        float f = -fIntBitsToFloat2;
        try {
            fOnPullDistance = edgeEffectM10224d.onPullDistance(f, fIntBitsToFloat);
        } catch (Throwable unused) {
            edgeEffectM10224d.onPull(f, fIntBitsToFloat);
            fOnPullDistance = 0.0f;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f33250g >> 32)) * (-fOnPullDistance);
        try {
            distance = edgeEffectM10224d.getDistance();
        } catch (Throwable unused2) {
            distance = 0.0f;
        }
        return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: i */
    public final float m12222i(long j) {
        float fOnPullDistance;
        float distance;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m12216c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f33250g & 4294967295L));
        EdgeEffect edgeEffectM10225e = this.f33246c.m10225e();
        try {
            fOnPullDistance = edgeEffectM10225e.onPullDistance(fIntBitsToFloat2, fIntBitsToFloat);
        } catch (Throwable unused) {
            edgeEffectM10225e.onPull(fIntBitsToFloat2, fIntBitsToFloat);
            fOnPullDistance = 0.0f;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f33250g & 4294967295L)) * fOnPullDistance;
        try {
            distance = edgeEffectM10225e.getDistance();
        } catch (Throwable unused2) {
            distance = 0.0f;
        }
        return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i);
    }
}
